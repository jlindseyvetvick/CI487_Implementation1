//Implementation #1 - Vehicle Info Search File
//Lindsey Vetvick - CI487

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class VehicleInfoSearch {

    /*
    For this function refer to the provided documentation on how the 
    user input should be structured. 
    */
	
    public static void main(String args[]){

        // Step 1) parse the data
    	System.out.println("Generating database....");
    	VehicleDatabase vdb = new VehicleDatabase(args[0]);
    	
    	Scanner sc = new Scanner(System.in);
    	
        while (true){

            //Step 2) Ask the user to enter a field for each of the car attributes
        	System.out.println("");
        	System.out.println("Makes: " + vdb.getMakes());
        	System.out.print("Enter a make: ");
        	String userMake = sc.nextLine().toLowerCase();
        	
        	System.out.println("");
        	System.out.println("Classes: " + vdb.queryClasses(userMake));
        	System.out.print("Enter a class: ");
        	String userClass = sc.nextLine().toLowerCase();
        	
        	System.out.println("");
        	System.out.println("Models: " + vdb.queryModels(userMake, userClass));
        	System.out.print("Enter a model: ");
        	String userModel = sc.nextLine().toLowerCase();
        	
        	System.out.println("");
        	System.out.println(vdb.queryVehicles(userModel));
        	
            //Step 3) Ask the user if they want to quit or continue
            System.out.println("Enter to continue, press q to quit");
        	String goAgain = sc.nextLine();
        	
        	if(goAgain.equals("q")) break;
        }

    }
    
  
}

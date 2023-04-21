//Implementation #1 - Vehicle Class File
//Lindsey Vetvick - CI487

/*
The this class should have the following:
    1. Attributes to store the vehicle information
    2. Getters for each of the attributes
    3. Overrides for the compareTo and toString functions
Refer to the assignment documentation on details for each of these requirements
*/
public class Vehicle implements Comparable<Vehicle> {
	
	//create attributes 2.1 of assignment doc
	private final Integer cylinders;
	private final String drive;
	private final String fuelType;
	private final String make;
	private final String model;
	private final Integer year;
	private final String trans;
	private final String vClass;
	
	Vehicle(Integer cylinders, String drive, String fuelType, String make, String model, Integer year, String trans, String vClass){
		this.cylinders = cylinders;
        this.drive = drive;
        this.fuelType = fuelType;
        this.make = make;
        this.model = model;
        this.year = year;
        this.trans = trans;
        this.vClass = vClass;
	}
	
	public Integer getCylinders() {
		return cylinders;
	}
	
	public String getDrive() {
		return drive;
	}
	
	public String getFuelType() {
		return fuelType;
	}
	
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public Integer getYear() {
		return year;
	}
	
	public String getTrans() {
		return trans;
	}
	
	public String getVClass() {
		return vClass;
	}
	
    @Override
   public String toString(){
   return String.format("%n---- %d %s %s ----%nCylinders: %d%nDrive: %s%nFuel Type: %s%nTransmission: %s%nClass: %s%n", year, make, model, cylinders, drive, fuelType, trans, vClass);
   }
    
   @Override
    public int compareTo(Vehicle other){
        return year.compareTo(other.year);
    }
}
	
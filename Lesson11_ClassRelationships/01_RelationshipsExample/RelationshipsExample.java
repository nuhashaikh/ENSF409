public class RelationshipsExample{
 
    public static void main(String[] args) {
        
    //Build a new house.
    House newBuild = new House("Pat Neil", "123 Main St. NW", "cedar", "2010", 10.0, 6, 3, 4.5, "inset");

    //Purchase a new door.
    Door newDoor = new Door("metal","green");
    
    //Purchase a new bathtub.
    Bathtub newTub = new Bathtub("clawfoot","blue");

    //Make renovations.
    newBuild.buildDeck("wood", 37.5, "2021");
    newBuild.renoBathroom("farmhouse", newTub);
    newBuild.updateRoof("asphalt", "2021");
    newBuild.replaceDoor("front", newDoor);
    
    //Find tenant(s).
    Tenant renter1 = new Tenant("Jordan Upton","engineer","587-289-1111");
    Tenant renter2 = new Tenant("Jamie Upton","teacher","403-787-2222",renter1);
    Tenant[] renterInfo = new Tenant[]{renter1, renter2};
    
    //Sign rental agreement.
    RentalAgreement contract = new RentalAgreement("January 2021", "June 2021", 2500.00, renterInfo, newBuild);
    contract.rentalSummary();
    RentalAgreementHardcopy legalCopy = new RentalAgreementHardcopy();
    legalCopy.printAgreement(contract);
    }    
}

class House {
    
    private String owner;
    private String address;
    private Roof houseRoof;
    private Kitchen houseKitchen;
    private Bathroom houseBathroom;
    private Door frontDoor = new Door();
    private Door backDoor = new Door();
    private Deck houseDeck;
    
    
    public House(String owner, String address, String roofMaterial, String roofInstalled, double kitchenArea, int kitchenSeats, int numAppliances, double bathroomArea, String sinkType){
        this.owner = owner;
        this.address = address;
        this.houseRoof = new Roof(roofMaterial, roofInstalled);
        this.houseKitchen = new Kitchen(kitchenArea, kitchenSeats, numAppliances);
        this.houseBathroom = new Bathroom(bathroomArea, sinkType);
    }

    public House(String owner, String address, String roofMaterial, String roofInstalled, double kitchenArea, int kitchenSeats, int numAppliances, double bathroomArea, String sinkType, Door frontDoor, Door backDoor){
        this.owner = owner;
        this.address = address;
        this.houseRoof = new Roof(roofMaterial, roofInstalled);
        this.houseKitchen = new Kitchen(kitchenArea, kitchenSeats, numAppliances);
        this.houseBathroom = new Bathroom(bathroomArea, sinkType);
        this.frontDoor = frontDoor;
        this.backDoor = backDoor;
    }
    
    public void updateRoof(String roofMaterial, String roofInstalled){
        this.houseRoof = new Roof(roofMaterial, roofInstalled);
    }
    
    public String getRoofInstall(){
        return this.houseRoof.getRoofInstall();
    }
    
    public void renoBathroom(String sinkType, Bathtub newTub){
        this.houseBathroom.addTub(newTub);
        this.houseBathroom.setSink(sinkType);
    }
    
    public void buildDeck(String material, double area, String installationYear){
        this.houseDeck = new Deck(material, area, installationYear);
    }
    
    public void replaceDoor(String whichDoor, Door newDoor){
        if(whichDoor.equalsIgnoreCase("front")){
            this.frontDoor = newDoor;
        }else if(whichDoor.equalsIgnoreCase("back")){
            this.backDoor = newDoor;
        }
    }
    
    public String getOwner(){
        return this.owner;
    }

    public String getAddress(){
        return this.address;
    }

    public Roof getRoof(){
        return this.houseRoof;
    }

    public Kitchen getKitchen(){
        return this.houseKitchen;
    }
    public Bathroom getBathroom(){
        return this.houseBathroom;
    }
    public Door getFrontDoor(){
        return this.frontDoor;
    }
    public Door getBackDoor(){
        return this.backDoor;
    }
    public Deck getDeck(){
        return this.houseDeck;
    }
        
}

class Roof{
    
    private String material;
    private String installationYear;
    
    public Roof(String material, String installationYear){
        this.material = material;
        this.installationYear = installationYear;
    }

    String getRoofInstall(){
        return this.installationYear;
    }
    
    String getMaterial(){
        return this.material;
    }
}

class Deck{
    
    private String material;
    private double area;
    private String installationYear;
    
    public Deck(String material, double area, String installationYear){
        this.material = material;
        this.area = area;
        this.installationYear = installationYear;
        System.out.println("Enjoy your new deck!");
    }    
    
    public String getMaterial(){
        return this.material;
    }
    
    public double getArea(){
        return this.area;
    }
    
    public String getInstallYear(){
        return this.installationYear;
    }
}

class Door{
    private String material = "wood";
    private String colour = "white";
    
    public Door(){      
    }
    
    public Door(String material, String colour){
        this.material = material;
        this.colour = colour;
    }
    
    public String getMaterial(){
        return this.material;
    }
    
    public String getColour(){
        return this.colour;
    }
}

class Kitchen{

    private double area;
    private int numSeats;
    private int numAppliances;
    
    public Kitchen(double area, int numSeats, int numAppliances){
        this.area = area;
        this.numSeats = numSeats;
        this.numAppliances = numAppliances;
    }
    
    public double getArea(){
        return this.area;
    }
    
    public int getSeats(){
        return this.numSeats;
    }
    
    public int numAppliances(){
        return this.numAppliances;
    }
}

class Bathroom{

    private double area;
    private String sinkType;
    private Bathtub tub;
    
    public Bathroom(double area, String sinkType){
        this.area = area;
        this.sinkType = sinkType;
    }

    public Bathroom(double area, String sinkType, Bathtub tub){
        this.area = area;
        this.sinkType = sinkType;
        this.tub = tub;
    }
    
    public void addTub(Bathtub newTub){
        this.tub = newTub;
        System.out.println("Enjoy your new tub!");        
    }
    
    public void setSink(String sinkType){
        this.sinkType = sinkType;
        System.out.println("New sink looks great!");        
    }
    
    public double getArea(){
        return this.area;
    }
    
    public String getSinkType(){
        return this.sinkType;
    }
    
    public Bathtub getTub(){
        return this.tub;
    }
}

class Bathtub{

    private String type;
    private String colour;
    
    public Bathtub(String type, String colour){
        this.type = type;
        this.colour = colour;
    }
    
    public String getTubType(){
        return this.type;
    }
    
    public String getTubColour(){
        return this.colour;
    }
}

class Tenant{
    
    private String name;
    private String occupation;
    private String phoneNumber;
    private Tenant houseContact;
    
    public Tenant(String name, String occupation, String phoneNumber){
        this.name = name;
        this.occupation = occupation;
        this.phoneNumber = phoneNumber;        
    }

    public Tenant(String name, String occupation, String phoneNumber, Tenant houseContact){
        this.name = name;
        this.occupation = occupation;
        this.phoneNumber = phoneNumber;
        this.houseContact = houseContact;
    }
    
    public String getTenant(){
        return this.name;
    }
    
    public String getOccupation(){
        return this.occupation;
    }
    
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    
    public Tenant getHouseContact(){
        return this.houseContact;
    }
}

class RentalAgreement{
    
    private String startDate;
    private String endDate;
    private double monthlyCost;
    private Tenant[] renters;
    private House residence;
    
    public RentalAgreement(String startDate, String endDate, double monthlyCost, Tenant[] renters, House residence){
        this.startDate = startDate;
        this.endDate = endDate;
        this.monthlyCost = monthlyCost;
        this.renters = renters;
        this.residence = residence;
    }
    
    public void rentalSummary(){
        System.out.println("The details of the agreement are as follows: ");
        System.out.println("Agreement is between: " + getBothParties());
        System.out.println("Begins: " + startDate.toString() + " Ends: " + endDate.toString());
        System.out.println("Monthly cost: " + String.format("$%.2f", monthlyCost));
        System.out.println("Roof was last updated: " + residence.getRoofInstall());
        System.out.println();
    }
    
    public String getStartDate(){
        return this.startDate;
    }
    
    public String getEndDate(){
        return this.endDate;
    }
    
    public double getMonthlyCost(){
        return this.monthlyCost;
    }
    
    public Tenant[] getRenters(){
        return this.renters;
    }
    
    public House getResidence(){
        return this.residence;
    }
    
    private String getBothParties(){
        
        StringBuilder allContractParties = new StringBuilder();
        
        allContractParties.append(residence.getOwner());
        
        for(int i = 0; i < renters.length; i++){
            allContractParties.append(" and " + renters[i].getTenant());
        }
        return allContractParties.toString();
    }
}

class RentalAgreementHardcopy{
        
    public void printAgreement(RentalAgreement agreement){
        // Not implemented...
        // Use file I/O and send to PDF...
    }
}


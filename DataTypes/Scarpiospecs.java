package DataTypes;

public class Scarpiospecs {
    public static void main(String[] args) {

        // basic specications
        double milage= 14.5;//km/l
        String fueltype="diesel";
        String color="black";
        int numberOfCylinders = 4;
        // basic features
        boolean powersteering=true;
        boolean powerwindows=true;
        boolean abs=true;
        boolean airbags=true;
        // performance
        double topspeed=180.0; //km/h
        double acceleration=8.5; //0-100 km/h in seconds
        // dimensions
        double length=4.5; //meters
        double width=1.8; //meters
        double height=1.5; //meters
        // engine specifications
        String engineType="m HAWK4-cylinder";
        int engineCapacity=2200; //cc
        int horsepower=140; //bhp
        
        
        
        //output of some data
        System.out.println("Milage: " + milage + " km/l");
        System.out.println("Fuel Type: " + fueltype);
        System.out.println("Color: " + color);
        System.out.println("Number of Cylinders: " + numberOfCylinders);
        System.out.println("Power Steering: " + powersteering);
        System.out.println("Power Windows: " + powerwindows);
        System.out.println("ABS: " + abs);
        System.out.println("Airbags: " + airbags);
        System.out.println("Top Speed: " + topspeed + " km/h");
        System.out.println("Acceleration (0-100 km/h): " + acceleration + " seconds");
        System.out.println("Length: " + length + " meters");
        System.out.println("Width: " + width + " meters");
        System.out.println("Height: " + height + " meters");
        System.out.println("Engine Type: " + engineType);
        System.out.println("Engine Capacity: " + engineCapacity + " cc");
        System.out.println("Horsepower: " + horsepower + " bhp");
    }
}

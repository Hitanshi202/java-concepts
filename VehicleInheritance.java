public class VehicleInheritance
{}
 class Vehicle
 {
     String make;
     String model;
     int year;

     Vehicle(String make, String model, int year)
     {
        this.make = make;
        this.model = model;
        this.year = year;
    }

     void displayVehicleInfo()
     {
         System.out.println("Vehicle Information");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

 class Car extends Vehicle
 {
     int numDoors;

     Car(String make, String model, int year, int numDoors)
     {
        super(make, model, year);
        this.numDoors = numDoors;
     }

    void displayCarInfo()
    {
        displayVehicleInfo();
        System.out.println("Number of doors: " + numDoors);
    }
}

 class Motorcycle extends Vehicle
 {
    boolean isTwoSeater;

      Motorcycle(String make, String model, int year, boolean isTwoSeater)
     {
        super(make, model, year);
        this.isTwoSeater = isTwoSeater;
    }

    public void displayMotorcycleInfo()
    {
        displayVehicleInfo();
        System.out.println("Is two-seater: " + isTwoSeater);
    }
}

class Main
{
    public static void main(String[] args)
    {
                Car myCar = new Car("Toyota", "Camry", 2020, 4);
                Motorcycle myMotorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2021, true);
                myCar.displayCarInfo();
                myMotorcycle.displayMotorcycleInfo();
    }
}




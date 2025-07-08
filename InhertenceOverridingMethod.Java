// Vehicle.Java
class Vehicle{
public class Vehicles {
  private String engine;
  private int wheels;
  private int seats;
  private int fuelType;
  private String light;


public Vehicles(){
  engine = "petrol";
  wheels = 2;
  seats = 2;
  fuelType = 14;
  light = "LED";
  
}

// generate parameterized constructor
public Vehicles(String engine, int wheels, int seats, int fuelType, String light) {
  this.engine = engine;
  this.wheels = wheels;
  this.seats = seats;
  this.fuelType = fuelType;
  this.light = light;
}

// Adding Getters
public String getEngine(){
  return engine;
}

public int getWheels(){
  return wheels;
}

public int getSeats(){
  return seats;
}

public int getfuleType(){
  return fuelType;
}

public String light(){
  return light;
}

// Adding a new method
public String run() {
  return "Running Vehicles";
}

  //Generate toString method
  @Override
  public String toString() {
  return "Vehicles{" +
    "engine='" + engine + '\'' +
    ", wheels=" + wheels +
    ", seats=" + seats +
    ", fuelType=" + fuelType +
    ", light='" + light + '\'' +
    '}';
  }

}
}

//Bike.java


public class Bike extends Vehicles{

  // here we not only we are taking the bike properties but also the vehicle properties
  
  private String handle;

  // Initializing--creating a default constructor
  public Bike() {
    handle = "short";
  }

  // super method of parameterized constructor
  public Bike(String engine, int wheels, int seats, int fuelType, String light, String handle){
    super(engine, wheels, seats, fuelType, light);
    this.handle = handle;
  }

  //adding setters 
  public String getHandle() {
    return handle;
  }

  // Adding a same method from the vehicle class
  @Override // this is used to override the method
  //here we are overriding the method from the vehicle class
  public String run() {
    return "Running Bike";
  }

  // o/p will be Running Bike
  // because we are overriding the method in the bike class
  //when we call the run method on the bike object it will call the run method in the bike class not in the vehicle class
  //because the child class is always given priority over the parent class

  //generate toString method
  // @Override
  // public String toString() {
  //   return "Bike{" +
  //     "handle='" + handle + '\'' +
  //     '}';
  // }


  // toSTring only give the bike info so create a toString for the vehicle too
  
  @Override
  public String toString()  {
    return "Bike{" +
      "handle='" + handle + '\'' +
      "} " + super.toString();
  }

  //Here we are not only taking the bike properties but also the vehicle properties using the super keyword
  
  
}


//Main.java

class Main{
import org.xml.sax.HandlerBase;

// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    Bike bike = new Bike("petrol", 2, 2, 14, "LED", "short");
    System.out.println(bike.run());
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}
}


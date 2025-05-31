//Syntax of Car.java

public class Car {
  private String doors;
  private String engine;
  private String driver;
  private int speed;

  // parked car.... Constructor without selecting the object type and value

  public Car() {
    doors = "closed";
    engine = "off";
    driver = "absent";
    speed = 0;
  }

  // Constructor with selecting the object type and value

  public Car( String doors, String engine, String driver, int speed) {
    this.doors = doors;
    this.engine = engine;
    this.driver = driver;
    this.speed = speed;
    // Here we are not giving the value to the object..keeping them as same for the user input
    
  }

  // Genrating the Getter and Setter

  

// public String getDoors() {
// 	return doors;
// }

// public void setDoors(String doors) {
// 	this.doors = doors;
// }

// public String getEngine() {
// 	return engine;
// }

// public void setEngine(String engine) {
// 	this.engine = engine;
// }

// public String getDriver() {
// 	return driver;
// }

// public void setDriver(String driver) {
// 	this.driver = driver;
// }

// public int getSpeed() {
// 	return speed;
// }

// public void setSpeed(int speed) {
// 	this.speed = speed;
// }


  public void setDoors(String doors) {
    this.doors = doors;
  }


  public void setEngine(String engine) {
    this.engine = engine;
  }


  public void setDriver(String driver) {
    this.driver = driver;
  }


  public void setSpeed(int speed) {
    this.speed = speed;
  }

  

  // Adding a funcionality to the car
  
  public String run() {
    if(doors.equals("closed") && engine.equals("on") && driver.equals("seated") && speed > 0){
      return "running";
    }else{
      return "not running";
    }
  }
  
  
}




//  Syntax of Main.java




public class Main {
  public static void main(String[] args) {

    Car car = new Car("closed", "on", "absent", 0);
    System.out.println(car.run());
    
  }


}



// O/p  :  not running

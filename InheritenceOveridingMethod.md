Display the vale of base class/ Parent class in java
1. Remove the toString method from the child class (Bike.java)
2. S.o.u.t(bike)

o/p 

	Vehicles{engine='petrol', wheels=2, seats=2, fuelType=14, light='LED'}

What if dont have the toString in any classes of the java

1. Removed the toString method of the Parent class (Vehicle.java)

o/p

	Bike@27c170f0.
 
	//This is noting but the assress value of the object


This is not the ideal setp to do


1. Undo the vehicle toString method
2. In Bike.java create a another toString method with the super keyword
	syntax :
			@Override
			public String toString() {
			   return "Bike{" +
			 	"handle='" + handle + '\'' +
				"} " + super.toString();
			}

o/p:

	Bike{handle='short'} Vehicles{engine='petrol', wheels=2, seats=2, fuelType=14, light='LED'}

 

This is how we handle the toStrign method

---------------------------------------------------------------------------------------------------------------------------------------------------------------------

Let's see the another important note



create a run method in vehicle.java

Syntax:
	public String run() {
return "running  vehicle";
}

and sout(bike.run());    in Main.java

o/p:

	Running Vehicle


if the same thing we write to Bike.java 

syntax:
	@Override	//here override mean he is overriding the vehicle run method
	public String run() {
	return "Running Bike";
	}

If I run the code 

Main.java
		sout(bike.run());

O/p will be the 

		Running Bike

------> Here you will have a question that the o/p should be the Running Vehicle, but the o/p is
Running Bike.


**Note: whenever we have the same method in parent class and even the child class, always
the child class will win.**

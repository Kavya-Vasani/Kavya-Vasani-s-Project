/*
 * Student Name:Kavya Vasani
 * Student Number:041163941
 * Program:CET-CS
 * Section:342
 * Lab Professor:Dr.James Mwangi
 * Assesment:CST8116 Assignment 
 * Description:A cylinder pyramid is created when you stack multiple right-circular cylinders
   together, each is smaller than the one below, as seen in the figure on the right.
 */

public class CylinderPyramid {//Open New class for Cylinder Pyramid
	public double radius; //Declaration attributes radius 
	public double height; //Declaration attributes height 
	
	 //Constructor for Cylinder Pyramid object, parameter
	public CylinderPyramid(double radius, double height) { 
		this.radius = radius;
		this.height = height;
		
	}
	
	double volumeCylinder (double radius, double height) { //Work method  
		return Math.PI*height*Math.pow(radius,2); //"Varsity Tutors," [Online]. Available: https://www.varsitytutors.com/hotmath/hotmath_help/topics/volume-of-a-cylinder. [Accessed 1 September 2024].
	}
	
	//Create a new volumePyramid method for calculate the volume 
	double volumePyramid (double radius, double height) { 
		double volume = volumeCylinder (radius,height); //For the bottom Cylinder
		volume += volumeCylinder (radius*0.8,height); //For the middle Cylinder
		volume += volumeCylinder (radius*0.64,height);//For the top Cylinder
		return volume;//Total of the Cylinder Pyramid volume
	}
}

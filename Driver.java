/*
 * Student Name:Kavya Vasani
 * Student Number:041163941
 * Program:CET-CS
 * Section:342
 * Lab Professor:Dr.James Mwangi
 * Assesment:CST8116 Assignment 
 * Description:A cylinder pyramid is created when you stack multiple right-circular cylinders
   together, each is smaller than the one below.
 */

import java.util.Scanner; //scanner class for user input

//Open new Driver class 
public class Driver { 
	
	//Create a main method for driver class
	public static void main(String[] args) { 
		Scanner myVolume = new Scanner(System.in);
		
		System.out.print("Enter radius of Cylinder : "); 
		double radius = myVolume.nextDouble();
		
		System.out.print("Enter height of Cylinder : ");
		double height = myVolume.nextDouble();
		
		//Create a new myCylinder object
		CylinderPyramid myCylinder = new CylinderPyramid(radius, height); 
		
		System.out.print("The volume of pyramid is: ");
		System.out.printf("%.3f\n",myCylinder.volumePyramid(radius,height));
		
		System.out.printf("This code was written by Kavya Vasani");
		System.out.printf("\nStudent Number = 041163941");
		
		myVolume.close();
	}

}

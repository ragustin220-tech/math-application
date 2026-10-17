package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
// Question 1:
// declare variables here
        double bobSalary = 50000, garySalary = 55000;
        double highestSalary;
//comparing salaries
        highestSalary = Math.max (bobSalary, garySalary);
//printing out max salary of both
        System.out.println("The highest salary is "+ highestSalary);

// declare variables here
        double carPrice = 30500, truckPrice = 85000;
        double lowestPrice;
//comparing prices
        lowestPrice = Math.min (carPrice,truckPrice);
//printing lowest cost
        System.out.println("Between both cars the smallest lowest cost is " + lowestPrice);


        int radius = (int) 7.25;
// declare variables here
     double square = Math.pow(7.25,2);
//use pi times square to calculate area
     double area = Math.PI * square;
//print area
     System.out.println("The area of a circle that has a radius of 7.25 is " + area);

// declare variables here
     double square2 = 5 ;
//square five to the power of two
     double squareR = Math.pow(5,2);
//print results of square
     System.out.println("the square root of 5 to the second power is " + squareR);

// declare variables here
     int point1x = 5;
     int point1y = 10;
     int point2x = 85;
     int point2y = 50;
//use equation to calculate distance between both points
     double distance =
             Math.sqrt(

             Math.pow(point2x - point1x,2) + Math.pow(point2y - point1y,2)
             );

     System.out.println("The distance is " + distance);
// declare variable
     int number = -5;
// use absolute value to determine the value of 5
     double absoluteV = Math.abs(number);
     System.out.println("The adsolut value of -5 is " + absoluteV);

// use Math.random to select a number between 0 and 1
    double randomnumber = Math.random();
    System.out.print("Random number between 0 and 1 : " + randomnumber);




    }

}

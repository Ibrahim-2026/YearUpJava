package com.yearup.week2.homework;
import java.util.Scanner;
public class Squarearea implements calculator{
    private double areaValue;
    private double Length;

    @Override
    public double getarea(double number1, double number2) {
        this.areaValue = number1*number2;
        return this.areaValue;
    }
    public void area (){
        System.out.println("The area of the square is: " + areaValue);
    }
    public double length(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the length: ");
        this.Length = sc.nextDouble();
        return 0;
    }

    @Override
    public double getsum(double number1, double number2) {
        return 0;
    }

    @Override
    public double getvolume(double number1, double number2, double number3) {
        return 0;
        }
    public static void main (String[] args){
        Squarearea areaCalc = new Squarearea();
        areaCalc.length();
        final double AREA = areaCalc.getarea(areaCalc.Length,areaCalc.Length);
       areaCalc.area();
    }
}

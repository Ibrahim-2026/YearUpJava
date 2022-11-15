package com.yearup.week2.homework;

public abstract class Planet implements calculator{
    protected String star;
    protected String planetName;
    protected double planetRadius;

    public String Star() {
        return this.star;
    }

    @Override
    public double getarea(double number1, double number2) {
        return Math.PI*Math.pow(this.planetRadius, 2);
    }

    @Override
    public double getsum(double number1, double number2) {
        return 0;
    }

    public double getarea(double number1){

        return Math.PI*Math.pow(number1,2);
    }

    @Override
    public double getvolume(double number1, double number2, double number3) {
        return 0;
    }

    public abstract String getStar();
}

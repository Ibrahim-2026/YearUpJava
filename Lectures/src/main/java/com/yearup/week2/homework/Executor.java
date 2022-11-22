package com.yearup.week2.homework;
import java.util.Objects;
import java.util.Scanner;
public class Executor {
    static Scanner sc = new Scanner(System.in);
    static solarSystemPlanet planet = new solarSystemPlanet();

    public static String getPlanetName() {
        System.out.println("Enter the planet name: ");
        String input = sc.nextLine();
        return input;
    }

    public static double getRadius() {
        System.out.println("Enter the planet radius: ");
        double input = sc.nextDouble();
        sc.nextLine();
        return input;
    }

    public static void displayArea(double area) {
        System.out.println("Area of the planet is " + area);
    }

    public static void getStar(solarSystemPlanet planet) {
        System.out.println("The star of the planet is " + planet.getStar());
    }
    public static void getPos(solarSystemPlanet planet, String planetName) {
        int position = planet.getPosition(planetName);
        System.out.println("The position of the planet is: " + position);
    }

    public static void main(String[] args) {
        boolean doAgain = false;
        do {
            doAgain = false;
            String planetName = getPlanetName();
            double radius = getRadius();
            double planetArea = planet.getarea(radius);
            displayArea(planetArea);
            getStar(planet);
            getPos(planet, planetName);

            int w = planetClass.getNumOfMoons(planetName) ;
           System.out.println(w);
    }
        while(doAgain);
        System.out.println("Would you like to use the application again? ");
        String input = sc.nextLine();
        if (input.equalsIgnoreCase("yes")) {
            doAgain = true;
        }
        else {
            System.out.println("Thanks. Goodbye!!!");
        }
    }
    interface CelestialObject{
        void displayCelestialObject();
    }
    public class executor implements CelestialObject {
        @Override
        public void displayCelestialObject() {
            System.out.println("Comet is a celestial object");
        }
    }
    static Scanner milkyWayPlanet = new Scanner(System.in);
    static solarSystemPlanet solarSystemPlanet = new solarSystemPlanet();
    public static void planetBelongs(){
        System.out.println("Your planet belongs to Milky way galaxy");
    }

}
enum planetClass {
    MERCURY(0),
    VENUS(0),
    EARTH(1),
    MARS(2),
    JUPITER(80),
    SATURN(83),
    URANUS(27),
    NEPTUNE(14);

    int moons;

    planetClass(int moons) {
        this.moons = moons;
    }
    public static int getNumOfMoons(String planet) {
        int numMoons = 0;
        for (planetClass p : planetClass.values()) {

            if (Objects.equals(planet, String.valueOf(p))) {
                numMoons = p.moons;
            }
        }
        return numMoons;
    }

}
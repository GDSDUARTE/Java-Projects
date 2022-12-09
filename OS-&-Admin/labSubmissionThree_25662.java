/*
* CA3: Operating Systems & Administration
* Lab: Semaphore
* Name: Guilherme Duarte da Silva
* Email: 25662@student.dorset-college.ie
* ID: 25662
*/

import java.util.concurrent.Semaphore;
import java.util.Random;
import java.util.ArrayList;

class Vehicles extends Thread {

    String type; // Type (Car, Bike, Truck or Bus)
    int number; // Number of the Vehicle
    int speed; // Car (20m/s), Bike (30m/s), Truck (5m/s) and Bus (10m/s)
    String state; // State (Waiting, Travelling, Exiting)
    Semaphore ourSem; 
    int tunnelLength = 200; 

    Vehicles(String type, int number, int speed, Semaphore sem) {
        
        this.type = type;
        this.number = number;
        this.speed = speed;
        this.state = "Waiting";
        this.ourSem = sem;

        switch (type) {
            case "Car":
                this.speed = 20;
                break;
            case "Bike":
                this.speed = 30;
                break;
            case "Truck":
                this.speed = 5;
                break;
            case "Bus":
                this.speed = 10;
                break;     
        }

    }

    @Override
    public void run() {
            
        try {
            
            // The vehicle is trying to enter the tunnel.
            ourSem.acquire(); 

            // The vehicle is traveling through the tunnel.
            this.state = "Travelling"; 
            Thread.sleep(tunnelLength / this.speed * 1000); 

            // The vehicle is exiting the tunnel.
            this.state = "Exiting";
            ourSem.release();

        } catch (InterruptedException e) {
            System.out.println("Error: " + e);
        }

    }

}

public class labSubmissionThree_25662 {
    public static void main(String[] args) {

        // Semaphore
        // Define 10 vehicles.
        // Randomly Initialize 10 vehicles (Car, Bike, Truck or Bus).
        // Store the vehicles in an array.

        // Array of Types.
        String[] vehicleTypes = {"Car", "Bike", "Truck", "Bus"};

        // Random generator.
        Random randFunc = new Random();

        // Semaphore.
        Semaphore sem_tunnel = new Semaphore(2);

        int numOfVehicles = 10;

        // Array of vehicles.
        Vehicles[] ourVehicles = new Vehicles[numOfVehicles];

        // Initialize the vehicles.
        for (int i = 0; i < numOfVehicles; i++) {
            String myVehicle = vehicleTypes[randFunc.nextInt(vehicleTypes.length)];
            int myVehicleNum = randFunc.nextInt(numOfVehicles);
            ourVehicles[i] = new Vehicles(myVehicle, myVehicleNum, 0, sem_tunnel);
        }

        for (Vehicles v: ourVehicles) {
            v.start();
        }

        while (true) {

            // Three ArrayList - Waiting, Travelling and Exiting.
            ArrayList<String> waiting = new ArrayList<>();
            ArrayList<String> travelling = new ArrayList<>();
            ArrayList<String> exiting = new ArrayList<>();

            for (Vehicles v : ourVehicles) {

                switch (v.state) {
                    case "Waiting":
                        waiting.add(v.type + " " + v.number);
                        break;
                    case "Travelling":
                        travelling.add(v.type + " " + v.number);
                        break;
                    case "Exiting":
                        exiting.add(v.type + " " + v.number);
                        break;
                }
            }

            System.out.println("\033[H\033[2J");
            System.out.flush();
          
            // Vehicles waiting to enter the tunnel.
            System.out.println("=============================================");
            System.out.println("Vehicle Waiting");
            for (String s : waiting) {
                System.out.println(s);
            }

            // Vehicles travelling through the tunnel.
            System.out.println("----------------------------");
            System.out.println("Vehicle Travelling");
            for (String s : travelling) {
                System.out.println(s);
            }

            // Vehicles exiting the tunnel.
            System.out.println("----------------------------");
            System.out.println("Vehicle Exiting");
            for (String s : exiting) {
                System.out.println(s);
            }

            System.out.println("=============================================");
            
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Error: " + e);
            }
        } 
    }
}


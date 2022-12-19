/*
* CA2: Operating Systems & Administration
* Lab: Concurrency
* Name: Guilherme Duarte da Silva
* ID: 25662
*/

// Class to simulate
class VirtualPrinter {

    // Method to simulate printing
    void printOperation(int numOfCopies, String mssg) {

        // Print the number of copies
        for(int i=1; i<=numOfCopies; i++) {
            System.out.println("** Printing Copy: " + i + "\tfor File: " + mssg);
        }
    }
}

// Threads
class Thread3 extends Thread {

    // Create a new object of the VirtualPrinter class
    VirtualPrinter pref;

    // Constructor
    Thread3(VirtualPrinter p) {
        this.pref = p;
    }

    // Override the run method
    @Override
    public void run() {
        pref.printOperation(5, "From Thread 1");
    }
}

// Threads 
class Thread4 extends Thread {

    // Create a new object of the VirtualPrinter class
    VirtualPrinter pref;
    
    // Constructor
    Thread4(VirtualPrinter p) {
        this.pref = p;
    }

    // Override the run method
    @Override
    public void run() {
        pref.printOperation(5, "From Thread 2");
    }
}

// Main class
public class labSubmissionTwo {
    public static void main(String[] args) {

        System.out.println("== Application Started ==");
       
        // Create a new object of the VirtualPrinter class
        VirtualPrinter hp_printer = new VirtualPrinter();
        Thread3 printThread3 = new Thread3(hp_printer);
        Thread4 printThread4 = new Thread4(hp_printer);

        // Start the threads
        printThread3.start();
        try {
            printThread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Start the threads
        printThread4.start();
        try {
            printThread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the main thread
        hp_printer.printOperation(5, "Main Thread");

        System.out.println("== Application Finished ==");
    }
}
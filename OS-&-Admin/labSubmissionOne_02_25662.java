/*
* CA1: Operating Systems & Administration
* Lab: Threads / Runable
* Name: Guilherme Duarte da Silva
* Email: 25662@student.dorset-college.ie
* ID: 25662
*/

// Create a class that implements the Runnable interface.
class Task3 implements Runnable {

    @Override
    public void run() {

        System.out.println("Entering Print Function in the Class");

        for (int i = 0; i <= 10; i++) {
            System.out.println(">> From Task2 - Count " + i);
        }

        System.out.println("Exiting Print Function in the Class");
    }
}

class GeneralTask {
    int genTaskNum;
    int genTaskName;
}

class Task4 extends GeneralTask implements Runnable {

    @Override
    public void run() {

        System.out.println("Entering Print Function in the Class");

        for (int i = 0; i <= 10; i++) {
            System.out.println(">> From Task4 - Count " + i);
        }

        System.out.println("Exiting Print Function in the Class");
    }
}

public class labSubmissionOne_02_25662 {
    public static void main(String[] args) {

        //Task1
        System.out.println("** Starting Main **");

        //Task2
        Runnable task3 = new Task3();
        Runnable task4 = new Task4();

        Thread thread3 = new Thread(task3);
        Thread thread4 = new Thread(task4);

        thread3.start();
        thread4.start();

        //Task3
        System.out.println("** Ending Main **");
    }
}
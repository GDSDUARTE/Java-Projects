/*
* CA1: Operating Systems & Administration
* Lab: Threads
* Name: Guilherme Duarte da Silva
* ID: 25662
*/

class Task1 extends Thread {

    @Override
    public void run() {

        System.out.println("Entering Print Function in the Class");

        for (int i = 0; i <= 10; i++) {
            System.out.println(">> From Task2 - Count " + i);
        }

        System.out.println("Exiting Print Function in the Class");
    }

}

class Task2 extends Thread {

    @Override
    public void run() {

        System.out.println("Entering Print Function in the Class");

        for (int i = 0; i <= 10; i++) {
            System.out.println(">> From Task4 - Count " + i);
        }

        System.out.println("Exiting Print Function in the Class");
    }

}

public class labSubmissionOne_01 {
    public static void main(String[] args) {

        //Task1
        System.out.println("** Starting Main **");

        //Task2
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();

        task1.start();
        task2.start();

        //Task3
        System.out.println("** Ending Main **");
    }
}

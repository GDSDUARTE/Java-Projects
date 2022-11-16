package CA3;

import java.util.Scanner;

public class Person {

    private static String firstName, lastName;

    /** Method to ask the user to input personal data **/
    public static void person(){

        Scanner kb = new Scanner(System.in);

        // Displaying a message on the screen
        System.out.print("Please input your first name: ");
        String name = kb.nextLine();

        // Displaying a message on the screen
        System.out.print("Please input your last name: ");
        String surname = kb.nextLine();

        // Saving the inputs into variables .
        firstName = name;
        lastName = surname;

        System.out.print("Hello " +Person.getName()+ "!\n");

        kb.close();
    }

    /** Method that connects the first name with the last name **/
    public static String getName() {

        return firstName + " " + lastName;
    }
}

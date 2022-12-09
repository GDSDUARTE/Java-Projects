package CA3;

import java.util.Scanner;

public class BloodClinic {

    static Scanner kb = new Scanner(System.in);

    /** Method to ask the user to choice between Donor or Receiver **/
    // Method used in the class Main.
    public static int option() {
        int userOption;
        // Donor or Receiver Loop in case of wrong choice.
        // Alert given by the Method isOption().
        do {
            // Displaying a message on the screen.
            System.out.print("Are you a donor or receiver? (1 for Donor, 2 for Receiver): ");
            userOption = kb.nextInt();
        } while(isOption(userOption));

        return userOption;
    }

    /** Method to ask the user to input his Blood Type **/
    // Method used in the classes Donor and Receiver.
    public static String bloodType(){
        String userBloodType;
        // Blood type Loop in case of wrong choice.
        // Alert given by the Method isBlood().
        do {
            // Displaying a message on the screen.
            System.out.print("Please provide blood type (A+, O+, B+, AB+, A-, O-, B-, AB-): ");
            userBloodType = kb.next().toUpperCase();
        } while(isBlood(userBloodType));

        return userBloodType;
    }

    /** Method alert the user about the wrong option **/
    public static boolean isOption(int userOption) {
        if (userOption == 1 || userOption == 2){
            // Return false to finish the do...while Loop.
            return false;
        }
        System.out.println("Choice does not exist, please try again!");
        return true;
    }

    /** Method alert the user about the wrong blood type **/
    public static boolean isBlood(String userBloodType) {
        if (Donor.bloodTypeList.contains(userBloodType)){
            // Return false to finish the do...while Loop.
            return false;
        }
        System.out.println("Choice does not exist, please try again!");
        return true;
    }
}

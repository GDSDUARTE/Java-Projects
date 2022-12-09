/**
* CA2: Programming Essentials
* Student name: Guilherme Duarte da Silva
* Student ID: 25662
*/

import java.util.*;

public class BloodTypeCompatibility {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        final String[] bloodType = {"A+", "O+", "B+", "AB+", "A-", "O-", "B-", "AB-"};
        final String[] gives = {"A+, AB+",
                "O+, A+, B+, AB+",
                "B+, AB+",
                "AB+",
                "A+, A-, AB+, AB-",
                "Everyone",
                "B+, B-, AB+, AB-",
                "AB+, AB-"};
        final String[] receives = {"A+, A-, O+, O-",
                "O+, O-",
                "B+, B-, O+, O-",
                "Everyone",
                "A-, O-",
                "O-",
                "B-, O-",
                "AB-, A-, B-,O-"};
        List<String> bloodTypeList = Arrays.asList(bloodType);
        List<String> givesList = Arrays.asList(gives);
        List<String> receivesList = Arrays.asList(receives);
        String answer1;
        String answer2;
        String answer3;

        //Loop to give more options
        do {
            //Blood type input
            do {
                System.out.print("\nPlease provide blood type (A+, O+, B+, AB+, A-, O-, B-, AB-): ");
                answer1 = kb.next().toUpperCase();
                if (!bloodTypeList.contains(answer1)){
                    System.out.println("Blood type does not exist, please try again!");
                }
            }while (!bloodTypeList.contains(answer1));

            //Gives or Receives input
            do {
                System.out.print("Do you want to know about giving or receiving? (1 for Gives, 2 for Receives): ");
                answer2 = kb.next();
                if (!(answer2.equals("1") || answer2.equals("2"))){
                    System.out.println("Choice does not exist, please try again!");
                }
            }while (!(answer2.equals("1") || answer2.equals("2")));

            //Conditions
            int index = bloodTypeList.indexOf(answer1);
            if(answer2.equals("1")){
                System.out.println("The blood type for " +bloodTypeList.get(index)+
                        " to give are: " +givesList.get(index)+ ".");
            }else {
                System.out.println("The blood type for " +bloodTypeList.get(index)+
                        " to receive are: " +receivesList.get(index)+ ".");
            }

            //Continue
            do {
                System.out.print("\nDo you want to try another Blood Type? (1 for Yes, 2 for No): ");
                answer3 = kb.next();
                if (!(answer3.equals("1") || answer3.equals("2"))){
                    System.out.println("Choice does not exist, please try again!");
                }
            }while (!(answer3.equals("1") || answer3.equals("2")));

        }while (answer3.equals("1"));

        System.out.println("\nThank you!");

        kb.close();
    }
}
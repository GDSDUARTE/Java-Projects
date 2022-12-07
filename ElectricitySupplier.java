/*
* CA1: Programming Essentials
* Name: Guilherme Duarte da Silva
* ID: 25662
*
* Task: 
*   A domestic electricity supplier has asked you to write a simple program for them to help 
*   their urban 24 Hour meter customers to calculate the estimated annual electricity bill. 
*
*   An example of how the Estimated Annual Bill is calculated for an electricity 
*   Urban 24 Hour meter customer on the standard tariff, is given below.
*
*     Annual Standing Charge excl VAT €183.96.
*     Unit Rate excl VAT 21.12 cent per kWh
*     Average Annual Consumption 4200kWh*
*     Annual PSO Levy excl VAT €51.60
*
*   Annual Electricity Charge 21.12 x 4200kWh €887.04
*   Total excl VAT €1,122.60  (= 183.96 + 51.60 + 887.04 )
*   VAT at 13.5% €151.55  ( = 1122.60 * 13.5% )
*   Estimated Annual Bill €1,274.15
*/

import java.util.Scanner;

public class ElectricitySupplier {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        String answer;
        double consum;
        double ASC = 183.96;
        double UR = 21.12;
        int AAC = 4200;
        double PSO = 51.60;

        kb.close();

        System.out.println("Please answer Y or N");
        System.out.print("Do you want to use the average annual consumption: ");
        answer = kb.next().toLowerCase();
        if (answer.equals("y")){
            double math1 = (UR * AAC)/100;
            double math2 = math1 + ASC + PSO;
            double math3 = math2 * 13.5/100;
            double math4 = math2+math3;
            System.out.format("Annual Electricity Charge: €%.2f\n",math1);
            System.out.format("Total excl VAT: €%.2f\n",math2);
            System.out.format("VAT at 13.5: €%.2f\n",math3);
            System.out.format("Estimated Annual Bill: €%.2f\n",math4);
        }
        if (answer.equals("n")) {
            System.out.print("Please enter your annual consumption:");
            consum = kb.nextInt();
            double math5 = (UR * consum)/100;
            double math6 = math5 + ASC + PSO;
            double math7 = math6 * 13.5/100;
            double math8 = math6+math7;
            System.out.format("Annual Electricity Charge: €%.2f\n",math5);
            System.out.format("Total excl VAT: €%.2f\n",math6);
            System.out.format("VAT at 13.5: €%.2f\n",math7);
            System.out.format("Estimated Annual Bill: €%.2f\n",math8);
        }
    }
}

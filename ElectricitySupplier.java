
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

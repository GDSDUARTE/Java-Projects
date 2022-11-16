package CA3;

public class Main {

    public static void main(String[] args) {

        // Calling the Method person() from Class Person.
        Person.person();

        // Accessing the Methods creating an object.
        Donor mDonor = new Donor();
        Receiver mReceiver = new Receiver();

        // Condition to choice between Donor or Receiver.
        if (BloodClinic.option() == 1) {
            // Calling the Method donor() from Class Donor.
            mDonor.donor();
        }else {
            // Calling the Method receives() from Class Receiver.
            mReceiver.receives();
        }
    }
}

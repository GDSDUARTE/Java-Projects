package CA3;

import java.util.Arrays;
import java.util.List;

public class Receiver {

    public static final String[] blood = {"A+", "O+", "B+", "AB+", "A-", "O-", "B-", "AB-"};
    public static final List<String> bloodTypeList = Arrays.asList(blood);
    public static final String[] receiver = {"A+, A-, O+, O-",
                "O+, O-",
                "B+, B-, O+, O-",
                "Everyone",
                "A-, O-",
                "O-",
                "B-, O-",
                "AB-, A-, B-,O-"
    };
    public static final List<String> receiverList = Arrays.asList(receiver);

    /** Method that matches the user blood type with the list of receiver blood types **/
    public void receives() {

        // Getting the blood type inputted by the user calling
        // the Method BloodType() from Class BloodClinic.
        String userBloodType = BloodClinic.bloodType();

        // Getting the index of the blood type inputted from bloodTypeList.
        int index = bloodTypeList.indexOf(userBloodType);

        // Calling the Method getName() from Class Person.
        // Using the index to find the correspondent in String[] bloodTypeList.
        // As the Strings[] were built to have the same index,
        // use the index to find the correspondent String[] receiveList.

        System.out.println(Person.getName()+ ", with the blood type " +userBloodType +
                " you can receive the following blood type: " +receiverList.get(index)+ ".");

    }
}

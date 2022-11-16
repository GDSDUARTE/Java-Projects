package CA3;

import java.util.Arrays;
import java.util.List;

public class Donor {

    public static final String[] blood = {"A+", "O+", "B+", "AB+", "A-", "O-", "B-", "AB-"};
    public static final List<String> bloodTypeList = Arrays.asList(blood);
    public static final String[] donor = {"A+, AB+",
            "O+, A+, B+, AB+",
            "B+, AB+",
            "AB+",
            "A+, A-, AB+, AB-",
            "Everyone",
            "B+, B-, AB+, AB-",
            "AB+, AB-"
    };
    private static final List<String> donorList = Arrays.asList(donor);


    /** Method that matches the user blood type with the list of receiver blood types **/
    public void donor() {

        // Getting the blood type inputted by the user calling
        // the Method BloodType() from Class BloodClinic.
        String userBloodType = BloodClinic.bloodType();

        // Getting the index of the blood type inputted from bloodTypeList.
        int index = bloodTypeList.indexOf(userBloodType);

        // Calling the Method getName() from Class Person.
        // Using the index to find the correspondent in String[] bloodTypeList.
        // As the Strings[] were built to have the same index,
        // use the index to find the correspondent String[] donorList.

        System.out.println(Person.getName()+ ", your blood type " +userBloodType+
                " can be given to the following blood type: " +donorList.get(index)+ ".");

    }
}

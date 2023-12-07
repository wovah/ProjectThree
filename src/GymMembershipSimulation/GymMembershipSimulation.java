package GymMembershipSimulation;

public class GymMembershipSimulation {
    public static void main(String[] args) {
        String[][] classes = {
                {
                        "Yoga",
                        "Thursday",
                        "11:00 am",
                        "15",
                        "available"


                },
                {
                        "Weightlifting",
                        "Wednesday",
                        "3:00 pm",
                        "10",
                        "available"
                },
                {
                        "Swimming",
                        "Saturday",
                        "7:00 pm",
                        "5",
                        "booked"
                }
        };
        for (String[] row : classes) {
            for (String value : row) {
                System.out.println(value);
            }
        }
        classes[2][4] = "available";
        for (String[] row : classes) {
            for (String value : row) {
                System.out.println(value);
            }
        }
    }
}




package ArrayFromInput;

import java.util.Scanner;

public class ArrayFromInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] studentLetterGrades = new String[5];
        int[] gradeScore = new int[5];
        String[] gpa = new String[5];
        for(int i = 0; i < 5;i++){
            System.out.println("Enter a Student Letter Grade");
            studentLetterGrades[i] = scan.nextLine();
        }
        for(int i =0; i < 5;i++){
            System.out.println("Enter a Student's score in the class");
            gradeScore[i] = Integer.parseInt(scan.nextLine());
        }
        for(int i = 0; i < 5;i++){
            System.out.println("Enter a Students GPA");
            gpa[i] = scan.nextLine();
        }
        System.out.println("Letter Grade | Grade Score | GPA" );
        for(int i = 0; i < 5;i++){
            System.out.println(studentLetterGrades[i] + " " + gradeScore[i] + " " + gpa[i]);
        }

    }
}

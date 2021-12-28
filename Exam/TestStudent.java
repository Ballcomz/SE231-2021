package Exam;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student std1 = new Student();

        System.out.print("Enter First name:");
        std1.setFname(input.nextLine());
        System.out.print("Enter Last name:");
        std1.setLname(input.nextLine());
        System.out.print("Enter id:");
        std1.setId(input.nextLine());
        System.out.print("Enter score:");
        std1.setScore(input.nextInt());

        System.out.println(std1.toString());
        std1.grade(std1.getScore());


    }
}

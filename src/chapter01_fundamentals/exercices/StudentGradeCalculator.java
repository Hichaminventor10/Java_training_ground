package src.chapter01_fundamentals.exercices;

import java.util.Scanner;


public class StudentGradeCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // 1. create a scanner object to read input from the user

        System.out.println("enter your Name: ");
        String name = scanner.nextLine();

        System.out.println("enter grade 1: ");
        double grade1 = scanner.nextDouble();

        System.out.println("enter grade 2: ");
        double grade2 = scanner.nextDouble();

        System.out.println("enter grade 3: ");
        double grade3 = scanner.nextDouble();

        // 3.validate grades

        if (!isValidGrade(grade1) || (!isValidGrade(grade2) || (!isValidGrade(grade1)) )) {
            System.out.println("Error , Grades must be between 0 and 20");
            scanner.close();
            return;
        }
        // 4.double average
       double average = calculateAverage(grade1, grade2, grade3);

        // 5. display result
        System.out.println("\n============");
        System.out.println("Name: " + name);
        System.out.println("Grade 1: " + grade1);
        System.out.println("Grade 2: " + grade2);
        System.out.println("Grade 3: " + grade3);
        System.out.println("Average: " + average);

        // 6. check if the student passed or failed
        if (average >= 10) {
            System.out.println("Result: Passed");
        } else {
            System.out.println("Result: Failed");
        }
        System.out.println("============");




        scanner.close();

    }
    public static boolean isValidGrade( double grade ){
        return grade >= 0 && grade <= 20 ;
    }
    public static double calculateAverage(double a,double b,double c){
        return (a+b+c) / 3 ;
    }
}

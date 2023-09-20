package markSheets;

import java.util.Scanner;

public class MarkSheetDemo {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int studentsNumbers = number.nextInt();

        int[][] studentMarks = new int[studentsNumbers][5];

        String[] studentNames = new String[studentsNumbers];

        int[] studentSerialNumbers = new int[studentsNumbers];

        for (int i = 0; i < studentsNumbers; i++) {
            System.out.print("\nEnter the student serial number: ");
            studentSerialNumbers[i] = number.nextInt();

            System.out.print("Enter the student name: ");
            studentNames[i] = number.next();

            for (int j = 0; j < 5; j++) {
                System.out.print("Enter the marks for subject " + (j + 1) + ": ");
                studentMarks[i][j] = number.nextInt();
            }
        }

        int[] studentTotals = new int[studentsNumbers];
        for (int i = 0; i < studentsNumbers; i++) {
            studentTotals[i] = 0;
            for (int j = 0; j < 5; j++) {
                studentTotals[i] += studentMarks[i][j];
            }
        }

        double[] studentAverages = new double[studentsNumbers];
        for (int i = 0; i < studentsNumbers; i++) {
            studentAverages[i] = (double) studentTotals[i] / 5;
        }

        double[] unitAverages = new double[5];
        for (int i = 0; i < 5; i++) {
            unitAverages[i] = 0.0;
            for (int j = 0; j < studentsNumbers; j++) {
                unitAverages[i] += studentMarks[j][i];
            }
            unitAverages[i] /= studentsNumbers;
        }

        System.out.println("Welcome to Student Marklist Application");
        System.out.println("________________________________________________________________________________");
        System.out.println("SNo\tStudent Name\tSub1\tSub2\tSub3\tSub4\tSub5\tTotal\tAverage");
        System.out.println("________________________________________________________________________________");
        for (int i = 0; i < studentsNumbers; i++) {
            System.out.println((i + 1) + "\t"  + studentNames[i] + "    \t" + studentMarks[i][0] + "\t" + studentMarks[i][1] + "\t" + studentMarks[i][2] + "\t" + studentMarks[i][3] + "\t" + studentMarks[i][4] + "\t" + studentTotals[i] + "\t" + studentAverages[i]);
        }
        System.out.println("________________________________________________________________________________");

        
        System.out.print("Average marks per unit");
        for (int i = 0; i < 5; i++) {
            System.out.print("\t" +String.format("%.2f", unitAverages[i]));
        }
    }

}

	



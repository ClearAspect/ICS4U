/**
 * B. Cutten
 * Sept 2014
 * A test harness for the Student class
 */
package studenttestharnessidcp2;

import java.util.Scanner;

public class StudentTester {

    public static void main(String[] args) {
        Student student1;
        student1 = new Student(); //instantiated object

        Student student2 = new Student(); //instantiated object
        Student student3 = new Student(); //instantiated object

        Scanner reader = new Scanner(System.in); //instantiated object

        String name; //instantiated object
        int score;

        System.out.println("Enter the first student's name: "); //requesting name for student1
        name = reader.nextLine();
        student1.setName(name);
        for (int i = 1; i <= 3; i++) { //requesting all 3 test scores for student1
            System.out.println("Enter the student's score on test " + i + " : ");
            score = Integer.parseInt(reader.nextLine());
            student1.setScore(i, score);
        }

        System.out.println("Enter the second student's name: "); //requesting name for student2
        name = reader.nextLine();
        student2.setName(name);
        for (int i = 1; i <= 3; i++) { //requesting all 3 test scores for student2
            System.out.println("Enter the student's score on test " + i + " : ");
            score = Integer.parseInt(reader.nextLine());
            student2.setScore(i, score);
        }

        System.out.println("Enter the third student's name: "); //requesting name for student3
        name = reader.nextLine();
        student3.setName(name);
        for (int i = 1; i <= 3; i++) { //requesting all 3 test scores for student3
            System.out.println("Enter the student's score on test " + i + " : ");
            score = Integer.parseInt(reader.nextLine());
            student3.setScore(i, score);
        }
        System.out.println("Enter the teacher's name: "); //requesting name for teacher
        name = reader.nextLine();
        Teacher teacher = new Teacher(name, student1,student2,student2);
        System.out.println(teacher);
        
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        if (student1.getHighScore() > student2.getHighScore() && student1.getHighScore() > student3.getHighScore()) { //Checks to see which student has the highest score
            name = student1.getName();
            score = student1.getHighScore();
        } else if (student2.getHighScore() > student1.getHighScore() && student2.getHighScore() > student3.getHighScore()) {
            name = student2.getName();
            score = student2.getHighScore();
        } else {
            name = student3.getName();
            score = student3.getHighScore();
        }

        System.out.println(name + " has the highest score: " + score); //output name and score

        if (student1.getAverage() > student2.getAverage() && student1.getAverage() > student3.getAverage()) { //Checks to see which student has the highest average score
            name = student1.getName();
            score = student1.getAverage();
        } else if (student2.getAverage() > student1.getAverage() && student2.getAverage() > student3.getAverage()) {
            name = student2.getName();
            score = student2.getHighScore();
        } else {
            name = student3.getName();
            score = student3.getAverage();
        }
        System.out.println(name + " has the highest average score: " + score);//output name and score

    }
    
}

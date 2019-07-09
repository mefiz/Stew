
package stew;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; //import scanner

public class Stew {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //create scanner
        System.out.println("How many students are in the class: "); //prompt user
        int numOfStudents = input.nextInt(); //get user input
        List<Student> studentList = new ArrayList<>(); //create an array list for the student class
        
        //create a for loop to enter the input based on numOfStudent - number of studets in class
        //declare variables to get data within the loop for student class
        String nameOfStudent;
        int idOfStudent;
        double averageMarks;
        char gradeOfStudent;
        //declare variables used to get the marks for the modules and calulcate average
        double marksOne;
        double marksTwo;
        double marksThree;
        for (int i = 0; i < numOfStudents; i++){
            System.out.println("Enter the name of the student: ");
            input.nextLine(); //open the scanner for input
            nameOfStudent = input.nextLine();
            System.out.println("Enter student ID (numbers only): ");
            idOfStudent = input.nextInt();
            System.out.println("Enter marks for the first module: ");
            marksOne = input.nextDouble();
            System.out.println("Enter marks for the second module: ");
            marksTwo = input.nextDouble();
            System.out.println("Enter marks for the first module: ");
            marksThree = input.nextDouble();
            
            //calculate average
            averageMarks = (marksOne + marksTwo + marksThree) / 3.0;
            gradeOfStudent = GradeCalculator(averageMarks); //grade using the student grade function
            
            //add to the list of students
            studentList.add(new Student(nameOfStudent, idOfStudent, averageMarks, gradeOfStudent));

        }//end for - numOfStudents
        
        input.close(); //close the scanner
        
        //for loop to print the results to screen
        for (int i = 0; i < numOfStudents; i++){
            System.out.println("-------------------------------------------");
            System.out.println("Name: " + studentList.get(i).studentName); //print the name
            System.out.println("ID: S" + studentList.get(i).studentID); //print the ID
            System.out.println("Average marks: " + studentList.get(i).average); //print the average
            System.out.println("Grade: " + studentList.get(i).studentGrade); //print the grade
            System.out.println("-------------------------------------------");
        }//end for - print
    }//end main
    
    //student class - holds all the student information
    static class Student{
        String studentName;
        int studentID;
        double average;
        char studentGrade;
    
        //object constructor
        public Student(String name, int ID, double avg, char grade){
            studentName = name;
            studentID = ID;
            average = avg;
            studentGrade = grade;
            
        }//end student object
      
    }//end student class
    
    //create a function to calculate the students grade based on average
    static char GradeCalculator (double a){
        char calculatedGrade = 'z'; //holds the value of the grade
        if (a <= 100 && a >= 90){
            calculatedGrade = 'A';
        }//end if (A)
        else if (a < 90 && a >= 80){
            calculatedGrade = 'B';
        }//end else if (B)
        else if (a < 80 && a >= 70){
            calculatedGrade = 'C';
        }//end else if (C)
        else if (a < 70 && a >= 60){
            calculatedGrade = 'D';
        }//end else if (D)
        else if (a < 60 && a >= 50){
            calculatedGrade = 'E';
        }//end else if (E)
        else if (a < 50){
            calculatedGrade = 'F';
        }//end else if (F)
        
        return calculatedGrade;
    }//end GradeCalculator 
    
}//end stew

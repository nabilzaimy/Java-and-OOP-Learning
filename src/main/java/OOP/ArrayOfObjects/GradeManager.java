package OOP.ArrayOfObjects;

public class GradeManager {

    public static void main(String[] args){

    Student[] students = new Student[4];

    students[0] = new Student(101 , "Abun" , 97.0 , 63.0);
    students[1] = new Student(102 , "Abin" , 30.0 , 50.0);
    students[2] = new Student(102 , "Salam" , 8.0 , 32.0);
    students[3] = new Student(103 , "Koil" , 68.0 , 50.0);


    double classTotal = 0;

    for(int i = 0 ; i < students.length ; i++){

        System.out.println("Student Id: " + students[i].studentId);
        System.out.println("Student Name: " + students[i].name);
        System.out.println("Average Score: " + students[i].getAverageScore());
        System.out.println("Student Name: ");
    }
    }
}

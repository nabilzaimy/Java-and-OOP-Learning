package OOP.ArrayOfObjects;

public class Student {

    int studentId;
    String name;
    double exam1Score;
    double exam2Score;

    Student(int studentId , String name , double exam1Score , double exam2Score){

        this.studentId = studentId;
        this.name = name;
        this.exam1Score = exam1Score;
        this.exam2Score = exam2Score;
    }

    double getAverageScore(){
        return ((exam1Score+exam2Score)/2);

    }

    boolean hasPassed(){
        if(getAverageScore()>= 50.0){
            System.out.println("You Passed");
            return hasPassed();
        }
        else{
            System.out.println("You Failed");
        };
        return hasPassed();
    }
}

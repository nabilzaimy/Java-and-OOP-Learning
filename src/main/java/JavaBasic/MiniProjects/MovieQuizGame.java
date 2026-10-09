package JavaBasic.MiniProjects;

import java.util.Scanner;

public class MovieQuizGame {

    // using 2-Dimension Array

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        char guess;
        int correct = 0;

        String[] questions = {"Which Movie is a horror movie?"
                            , "Which Movie is a comedy movie?"
                            , "Which Movie is a love story movie?"
                            , "Which Movie is a cartoon movie?"};

        String[][] options = {{"A - Hantu Kak Limah" , "B - Spiderman" , "C - Minion" , "D - Sepahtu"}
                            , {"A - Hantu Kak Limah" , "B - Spiderman" , "C - Minion" , "D - Sepahtu"}
                            , {"A - Hantu Kak Limah" , "B - Love 3000" , "C - Minion" , "D - Sepahtu"}
                            , {"A - Hantu Kak Limah" , "B - Spiderman" , "C - Munafik" , "D - Sepahtu"}};

        char[] answers = {'A' , 'D' , 'B' , 'B'};

        for(int i = 0 ; i < questions.length ; i++){
            System.out.println("*************");
            System.out.println("Question " + (i+1));
            System.out.println("*************");
            System.out.println(questions[i]);
            System.out.println();

            for(int j = 0 ; j < options[i].length ; j++ ) {
                System.out.println("Options: " + options[i][j]);
            }
                System.out.print("Enter Your Answer: ");
                guess = scanner.next().charAt(0);
                System.out.println();

                if(guess == answers[i]){
                    System.out.print("CORRECT ANSWER !");
                    correct++;
                }
                else{
                    System.out.print("WRONG ANSWER !");
                }
            }



        System.out.println("Your SCORE : " + correct + "/" + questions.length);

        scanner.close();
        }


    }


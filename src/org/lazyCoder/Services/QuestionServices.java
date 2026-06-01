package org.lazyCoder.Services;

import org.lazyCoder.model.Questions;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class QuestionServices {

    private final Questions[] questions = new Questions[5];
    private final Integer[] reply = new Integer[5];

    private final Scanner scan = new Scanner(System.in);

    public QuestionServices(){
        questions[0] = new Questions(1, "What is the size of int ?", 4, new String[]{"5","4","3","8"});
        questions[1] = new Questions(2, "What is the size of double ?", 8, new String[]{"8","4","2","6"});
        questions[2] = new Questions(3, "What is the size of float ?", 4, new String[]{"1","8","4","8"});
        questions[3] = new Questions(4, "What is the size of char ?", 2, new String[]{"1","4","2","8"});
        questions[4] = new Questions(5, "What is the size of byte ?", 1, new String[]{"8","4","1","2"});
    }

    public void playQuiz(){

        int i = 0;

        for (Questions question : questions) {

            System.out.println("Question no. : "+question.getQuestionId());
            System.out.println(question.getQuestion());

            Arrays.stream(question.getOption()).forEach(option -> {
                System.out.print(option + "  ");
            });
            System.out.println();

            System.out.print("Your Answer : ");
            try {
                reply[i] = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nPlease enter an integer");
                scan.next();
                reply[i] = null;
            }
            i++;
            System.out.println();
        }
    }

    public void getScore(){
        int score = 0;

        for (int i = 0; i < questions.length; i++) {

            Questions question = questions[i];
            Integer actualAnswer = question.getAnswer();
            Integer userAnswer = reply[i];

            if(userAnswer != null && userAnswer.equals(actualAnswer)){
                score++;
            }
        }

        System.out.println("Your score is "+score);
    }

    public void getReply() {
        System.out.println(Arrays.toString(reply));
    }

}

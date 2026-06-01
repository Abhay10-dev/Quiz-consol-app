package org.lazyCoder;

import org.lazyCoder.Services.QuestionServices;

public class Main {
    public static void main(String[] args) {

        System.out.println("----------WELCOME TO THE QUIZ GAME----------");
        QuestionServices questionServices = new QuestionServices();
        questionServices.playQuiz();
        questionServices.getScore();

        System.out.print("Your answers : ");
        questionServices.getReply();
        System.out.println("----------THANK YOU FOR PLAYING THE QUIZ GAME----------");

    }
}
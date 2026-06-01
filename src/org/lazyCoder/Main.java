package org.lazyCoder;

import org.lazyCoder.Services.QuestionServices;

public class Main {
    public static void main(String[] args) {
        QuestionServices questionServices = new QuestionServices();
        questionServices.playQuiz();
        questionServices.getScore();
        questionServices.getReply();
    }
}
package org.lazyCoder.model;

import java.util.Arrays;

public class Questions {

    private Integer questionId;
    private String question;
    private Integer answer;
    private String[] option;

    public Questions(Integer questionId, String question, Integer answer, String[] option) {
        this.questionId = questionId;
        this.question = question;
        this.answer = answer;
        this.option = option;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Integer getAnswer() {
        return answer;
    }

    public void setAnswer(Integer answer) {
        this.answer = answer;
    }

    public String[] getOption() {
        return option;
    }

    public void setOption(String[] option) {
        this.option = option;
    }

    @Override
    public String toString() {
        return "Questions{" +
                "question_id='" + questionId + '\'' +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                ", option=" + Arrays.toString(option) +
                '}';
    }

}

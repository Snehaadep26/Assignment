package com.example.assignment;

public class AllQuestions {

    private String questionNumber,question,color,attempt;

    public AllQuestions(String questionNumber, String question, String color,String attempt) {
        this.questionNumber = questionNumber;
        this.question = question;
        this.color = color;
        this.attempt = attempt;

    }

    public String getQuestionNumber() {
        return questionNumber;
    }

    public String getQuestion() {
        return question;
    }

    public String getColor() {
        return color;
    }
    public String getAttempt() {
        return attempt;
    }

}
package com.example.assignment.ReturnPackage;


public class Returned {

    private String subject;
    private String subjectImage;
    private String noOfQuestions,marks,type,title;

    public Returned(String subject, String subjectImage, String noOfQuestions, String marks, String type,String title) {
        this.subject = subject;
        this.subjectImage = subjectImage;
        this.noOfQuestions = noOfQuestions;
        this.marks = marks;
        this.type = type;
        this.title=title;
    }

    public String getSubject() {
        return subject;
    }

    public String getSubjectImage() {
        return subjectImage;
    }

    public String getNoOfQuestions() {
        return noOfQuestions;
    }

    public String getMarks() {
        return marks;
    }

    public String getType() {
        return type;
    }
    public String getTitle()
    {
        return title;
    }
}




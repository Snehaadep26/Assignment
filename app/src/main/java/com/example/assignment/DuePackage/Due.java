package com.example.assignment.DuePackage;

public class Due {
    private String subjectImage;
    private String noOfQuestions,marks, subject,type,title;
    int progress;
    String perText;

    public Due(String subjectImage, String noOfQuestions, String marks, String subject, String type, String title, int progress, String perText) {
        this.subjectImage = subjectImage;
        this.noOfQuestions = noOfQuestions;
        this.marks = marks;
        this.subject = subject;
        this.type = type;
        this.title=title;
        this.progress=progress;
        this.perText=perText;
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

    public String getSubject() {
        return subject;
    }

    public String getType() {
        return type;
    }
    public String getTitle()
    {
        return title;
    }
    public int getProgress()
    {
        return  progress;
    }
    public String getPerText()
    {
        return perText;
    }
}

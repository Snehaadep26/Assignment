package com.example.assignment.ReturnPackage;


public class Returned {

    private int subjectImage;
    private String week;
    private String subject;

    private  String teacherName;

    public Returned(int subjectImage, String week, String subject, String teacherName) {
        this.subjectImage = subjectImage;
        this.week = week;
        this.subject=subject;
        this.teacherName=teacherName;
    }

    public int getImageView() {
        return subjectImage;
    }

    public String getWeek() {
        return week;
    }

    public String getSubject() {
        return subject;
    }

    public String getTeacherName() {
        return teacherName;
    }
}




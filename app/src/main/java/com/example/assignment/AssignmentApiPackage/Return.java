package com.example.assignment.AssignmentApiPackage;

import java.util.Date;

public class Return {
    public int id;
    public String title;
    public Date dueDate;
    public String status;
    public String type;
    public Date publishDate;
    public String subjectName;
    public String subjectIcon;
    public Object assignmentStudentId;
    public Object returnedDate;
    public String teacherName;
    public String noOfQuestions;
    public String marks;
    public String countAttempted;

    public Return(int id, String title, Date dueDate, String status, String type, Date publishDate, String subjectName, String subjectIcon, Object assignmentStudentId, Object returnedDate, String teacherName, String noOfQuestions, String marks, String countAttempted) {
        this.id = id;
        this.title = title;
        this.dueDate = dueDate;
        this.status = status;
        this.type = type;
        this.publishDate = publishDate;
        this.subjectName = subjectName;
        this.subjectIcon = subjectIcon;
        this.assignmentStudentId = assignmentStudentId;
        this.returnedDate = returnedDate;
        this.teacherName = teacherName;
        this.noOfQuestions = noOfQuestions;
        this.marks = marks;
        this.countAttempted = countAttempted;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public String getStatus() {
        return status;
    }

    public String getType() {
        return type;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public String getSubjectIcon() {
        return subjectIcon;
    }

    public Object getAssignmentStudentId() {
        return assignmentStudentId;
    }

    public Object getReturnedDate() {
        return returnedDate;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getNoOfQuestions() {
        return noOfQuestions;
    }

    public String getMarks() {
        return marks;
    }

    public String getCountAttempted() {
        return countAttempted;
    }
}

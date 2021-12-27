package com.example.assignment.AssignmentApiPackage;

import java.util.Date;

public class DueForSubmission {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectIcon() {
        return subjectIcon;
    }

    public void setSubjectIcon(String subjectIcon) {
        this.subjectIcon = subjectIcon;
    }

    public Object getAssignmentStudentId() {
        return assignmentStudentId;
    }

    public void setAssignmentStudentId(Object assignmentStudentId) {
        this.assignmentStudentId = assignmentStudentId;
    }

    public Object getReturnedDate() {
        return returnedDate;
    }

    public void setReturnedDate(Object returnedDate) {
        this.returnedDate = returnedDate;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getNoOfQuestions() {
        return noOfQuestions;
    }

    public void setNoOfQuestions(String noOfQuestions) {
        this.noOfQuestions = noOfQuestions;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    public String getCountAttempted() {
        return countAttempted;
    }

    public void setCountAttempted(String countAttempted) {
        this.countAttempted = countAttempted;
    }
}

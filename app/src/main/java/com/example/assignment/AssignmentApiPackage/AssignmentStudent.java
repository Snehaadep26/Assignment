package com.example.assignment.AssignmentApiPackage;

import java.util.Date;

public class AssignmentStudent {
    public int assignmentId;
    public int studentId;
    public Object gradeObtained;
    public Object returnedDate;
    public Object submittedOn;
    public int id;
    public String status;
    public Date createdAt;
    public Date updatedAt;

    public int getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(int assignmentId) {
        this.assignmentId = assignmentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Object getGradeObtained() {
        return gradeObtained;
    }

    public void setGradeObtained(Object gradeObtained) {
        this.gradeObtained = gradeObtained;
    }

    public Object getReturnedDate() {
        return returnedDate;
    }

    public void setReturnedDate(Object returnedDate) {
        this.returnedDate = returnedDate;
    }

    public Object getSubmittedOn() {
        return submittedOn;
    }

    public void setSubmittedOn(Object submittedOn) {
        this.submittedOn = submittedOn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}

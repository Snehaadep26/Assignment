package com.example.assignment.AssignmentApiPackage;

import java.util.Date;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString), Root.class); */
public class Draft {
    public int id;
    public String title;
    public Date dueDate;
    public String type;
    public Date publishDate;
    public int standardId;
    public Date createdAt;
    public String teacherName;
    public Object assignmentStudentId;
    public Object status;
    public Object returnedDate;
    public Object submittedOn;
    public String noOfQuestions;
    public String countAttempted;
    public boolean newA;

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

    public int getStandardId() {
        return standardId;
    }

    public void setStandardId(int standardId) {
        this.standardId = standardId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Object getAssignmentStudentId() {
        return assignmentStudentId;
    }

    public void setAssignmentStudentId(Object assignmentStudentId) {
        this.assignmentStudentId = assignmentStudentId;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
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

    public String getNoOfQuestions() {
        return noOfQuestions;
    }

    public void setNoOfQuestions(String noOfQuestions) {
        this.noOfQuestions = noOfQuestions;
    }

    public String getCountAttempted() {
        return countAttempted;
    }

    public void setCountAttempted(String countAttempted) {
        this.countAttempted = countAttempted;
    }

    public boolean isNewA() {
        return newA;
    }

    public void setNewA(boolean newA) {
        this.newA = newA;
    }
}

package com.example.assignment.AssignmentApiPackage;

public class SubmitAnswerRequest {
        public int assignmentStudentId;
        public String newStatus;

    public SubmitAnswerRequest(int assignmentStudentId, String newStatus) {
        this.assignmentStudentId = assignmentStudentId;
        this.newStatus = newStatus;
    }

    public int getAssignmentStudentId() {
        return assignmentStudentId;
    }

    public String getNewStatus() {
        return newStatus;
    }
}




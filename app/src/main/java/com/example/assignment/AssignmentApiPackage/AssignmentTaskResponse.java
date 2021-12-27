package com.example.assignment.AssignmentApiPackage;

import java.util.List;

public class AssignmentTaskResponse {
    public List<Task> tasks;
    public Assignment assignment;
    public int totalQuestions;
    public int unAttempted;
    public AssignmentStudent assignmentStudent;

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }

    public void setTotalQuestions(int totalQuestions) {
        this.totalQuestions = totalQuestions;
    }

    public int getUnAttempted() {
        return unAttempted;
    }

    public void setUnAttempted(int unAttempted) {
        this.unAttempted = unAttempted;
    }

    public AssignmentStudent getAssignmentStudent() {
        return assignmentStudent;
    }

    public void setAssignmentStudent(AssignmentStudent assignmentStudent) {
        this.assignmentStudent = assignmentStudent;
    }
}



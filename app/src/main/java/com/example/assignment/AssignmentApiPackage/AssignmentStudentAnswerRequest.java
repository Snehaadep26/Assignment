package com.example.assignment.AssignmentApiPackage;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString), Root.class); */
public class AssignmentStudentAnswerRequest {
    public int assignmentTaskId;
    public String type;
    public int answer;

    public AssignmentStudentAnswerRequest(int assignmentTaskId, String type, int answer) {
        this.assignmentTaskId = assignmentTaskId;
        this.type = type;
        this.answer = answer;
    }

    public int getAssignmentTaskId() {
        return assignmentTaskId;
    }

    public String getType() {
        return type;
    }

    public int getAnswer() {
        return answer;
    }
}



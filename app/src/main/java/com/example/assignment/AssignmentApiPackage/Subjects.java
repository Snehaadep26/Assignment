package com.example.assignment.AssignmentApiPackage;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString), Root.class); */
public class Subjects {
    public int subId;
    public String subName;
    public Object noOfQuestions;
    public String icon;

    public int getSubId() {
        return subId;
    }

    public void setSubId(int subId) {
        this.subId = subId;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public Object getNoOfQuestions() {
        return noOfQuestions;
    }

    public void setNoOfQuestions(Object noOfQuestions) {
        this.noOfQuestions = noOfQuestions;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}



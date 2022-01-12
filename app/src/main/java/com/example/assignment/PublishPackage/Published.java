package com.example.assignment.PublishPackage;


import java.util.Date;
public class Published {
        private String title;
        private String dueMonth;
        private int dueDate;
        private String subjectName;
        private String noOfQuestions;
        private String marks;
        private String type;

        public Published(String title, String dueMonth, int dueDate, String subjectName, String noOfQuestions, String marks, String type) {
            this.title = title;
            this.dueMonth = dueMonth;
            this.dueDate = dueDate;
            this.subjectName = subjectName;
            this.noOfQuestions = noOfQuestions;
            this.marks = marks;
            this.type = type;
        }

        public String getTitle() {
            return title;
        }

        public String getDueMonth(){
            return dueMonth;
        }

        public int getDueDate(){
            return dueDate;
        }

        public String getSubjectName() {
            return subjectName;
        }

        public String getNoOfQuestions() {
            return noOfQuestions;
        }

        public String getMarks() {
            return marks;
        }

        public String getType() {
            return type;
        }
    }




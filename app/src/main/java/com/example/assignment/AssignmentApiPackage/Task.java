package com.example.assignment.AssignmentApiPackage;

import java.util.List;

public class Task {
    public int taskId;
    public String statement;
    public String type;
    public List<Option> options;
    public int positiveMarks;
    public int negativeMarks;
    public String task_level;
    public int assignmentId;
    public String assignmentStudent_status;
    public String chapterName;
    public Object studentAnswerId;
    public Object studentAnswer;
    public Object images;
    public Object studentId;
    public int chapterId;

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public int getPositiveMarks() {
        return positiveMarks;
    }

    public void setPositiveMarks(int positiveMarks) {
        this.positiveMarks = positiveMarks;
    }

    public int getNegativeMarks() {
        return negativeMarks;
    }

    public void setNegativeMarks(int negativeMarks) {
        this.negativeMarks = negativeMarks;
    }

    public String getTask_level() {
        return task_level;
    }

    public void setTask_level(String task_level) {
        this.task_level = task_level;
    }

    public int getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(int assignmentId) {
        this.assignmentId = assignmentId;
    }

    public String getAssignmentStudent_status() {
        return assignmentStudent_status;
    }

    public void setAssignmentStudent_status(String assignmentStudent_status) {
        this.assignmentStudent_status = assignmentStudent_status;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public Object getStudentAnswerId() {
        return studentAnswerId;
    }

    public void setStudentAnswerId(Object studentAnswerId) {
        this.studentAnswerId = studentAnswerId;
    }

    public Object getStudentAnswer() {
        return studentAnswer;
    }

    public void setStudentAnswer(Object studentAnswer) {
        this.studentAnswer = studentAnswer;
    }

    public Object getImages() {
        return images;
    }

    public void setImages(Object images) {
        this.images = images;
    }

    public Object getStudentId() {
        return studentId;
    }

    public void setStudentId(Object studentId) {
        this.studentId = studentId;
    }

    public int getChapterId() {
        return chapterId;
    }

    public void setChapterId(int chapterId) {
        this.chapterId = chapterId;
    }
}

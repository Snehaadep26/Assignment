package com.example.assignment.AssignmentApiPackage;

import java.util.Date;
import java.util.List;

public class Assignment {
    public int id;
    public String title;
    public String instructions;
    public String deadlineDate;
    public String status;
    public String type;
    public String gradingType;
    public String publishDate;
    public Object returnedDate;
    public Object comment;
    public int subjectId;
    public int standardId;
    public int teacherId;
    public boolean declared;
    public String index;
    public int authorId;
    public Date createdAt;
    public Date updatedAt;
    public List<Chapter> chapters;
    public SubjectAssignmentTask subjectAssignmentTask;
    public Teacher teacher;
    public int totalMarks;

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

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getDeadlineDate() {
        return deadlineDate;
    }

    public void setDeadlineDate(String deadlineDate) {
        this.deadlineDate = deadlineDate;
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

    public String getGradingType() {
        return gradingType;
    }

    public void setGradingType(String gradingType) {
        this.gradingType = gradingType;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public Object getReturnedDate() {
        return returnedDate;
    }

    public void setReturnedDate(Object returnedDate) {
        this.returnedDate = returnedDate;
    }

    public Object getComment() {
        return comment;
    }

    public void setComment(Object comment) {
        this.comment = comment;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public int getStandardId() {
        return standardId;
    }

    public void setStandardId(int standardId) {
        this.standardId = standardId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public boolean isDeclared() {
        return declared;
    }

    public void setDeclared(boolean declared) {
        this.declared = declared;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
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

    public List<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(List<Chapter> chapters) {
        this.chapters = chapters;
    }

    public SubjectAssignmentTask getSubjectAssignmentTask() {
        return subjectAssignmentTask;
    }

    public void setSubjectAssignmentTask(SubjectAssignmentTask subjectAssignmentTask) {
        this.subjectAssignmentTask = subjectAssignmentTask;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }
}

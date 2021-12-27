package com.example.assignment.AssignmentApiPackage;

import java.util.List;

public class AssignmentGetChapterResponse {
    public List<GetChapter> chapters;
    public List<AllChapter> allChapters;

    public List<GetChapter> getChapters() {
        return chapters;
    }

    public void setChapters(List<GetChapter> chapters) {
        this.chapters = chapters;
    }

    public List<AllChapter> getAllChapters() {
        return allChapters;
    }

    public void setAllChapters(List<AllChapter> allChapters) {
        this.allChapters = allChapters;
    }
}



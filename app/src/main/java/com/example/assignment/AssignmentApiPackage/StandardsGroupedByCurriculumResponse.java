package com.example.assignment.AssignmentApiPackage;

import java.util.List;

public class StandardsGroupedByCurriculumResponse {
    public int id;
    public String name;
    public List<Standard> standards;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Standard> getStandards() {
        return standards;
    }

    public void setStandards(List<Standard> standards) {
        this.standards = standards;
    }
}



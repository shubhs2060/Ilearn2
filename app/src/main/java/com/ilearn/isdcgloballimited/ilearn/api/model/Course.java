package com.ilearn.isdcgloballimited.ilearn.api.model;

import java.util.List;

/**
 * Created by rubyeffect on 19/4/18.
 */

public class Course {

    private List<Course> courses = null;
    String name,webSource,webSourceUrl,trainerName,duration,rating;


    public String getName() {
        return name;
    }

    public String getWebSource() {
        return webSource;
    }

    public String getWebSourceUrl() {
        return webSourceUrl;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public String getDuration() {
        return duration;
    }

    public String getRating() {
        return rating;
    }

    public List<Course> getCourses() {
        return courses;
    }
}

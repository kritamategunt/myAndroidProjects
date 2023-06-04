package com.example.myandroidprojectudemy;

public class Project {
    String projectName;
    String description;

    // R.drawable.name_of_the_file(this will be some sort of number,an int)
    //e.g. 15238475
    int image;

    public Project(String projectName, String description, int image) {
        this.projectName = projectName;
        this.description = description;
        this.image = image;
    }


}

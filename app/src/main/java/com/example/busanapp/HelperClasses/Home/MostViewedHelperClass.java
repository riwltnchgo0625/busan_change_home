package com.example.busanapp.HelperClasses.Home;

public class MostViewedHelperClass {
    int image;
    String title, description;

    public MostViewedHelperClass(int image, String title, String description) {
        this.image = image;
        this.title = title;
        this.description = description;
    }

    public int getImageView() {
        return image;
    }

    public String getTextView() {
        return title;
    }

    public String getDescription() {
        return description;
    }

}

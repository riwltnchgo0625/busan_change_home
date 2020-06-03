package com.example.busanapp.HelperClasses.Home;

public class CategoriesHelperClass {
    int image;
    String title, gradient;

    public CategoriesHelperClass(int image, String title, String gradient) {
        this.image = image;
        this.title = title;
        this.gradient = gradient;
    }

    public int getImage() {
        return image;
    }

    public String getTitile() {
        return title;
    }

    public String getGradient() { return gradient; }

}

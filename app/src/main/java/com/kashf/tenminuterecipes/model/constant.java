package com.kashf.tenminuterecipes.model;

public class constant {

    int image;
    String title;
    String ejza;
    String tarqeeb;

    public constant(int image, String title, String ejza, String tarqeeb) {
        this.image = image;
        this.title = title;
        this.ejza = ejza;
        this.tarqeeb = tarqeeb;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getEjza() {
        return ejza;
    }

    public String getTarqeeb() {
        return tarqeeb;
    }
}

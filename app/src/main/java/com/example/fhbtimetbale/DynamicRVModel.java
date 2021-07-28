package com.example.fhbtimetbale;

public class DynamicRVModel {

    int image;
    String name;

    public DynamicRVModel(String name, int image) {
        this.name = name;
        this.image= image;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }
}

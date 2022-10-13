package com.example.ltmtk12tcustomizelistview.model;

public class Film {
    // id, name, description, imageURL, score
    private long id;
    private String name;
    private String description;
    private String imageURL;
    private double score;

    public Film() {
    }

    public Film(long id, String name, String description, String imageURL, double score) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imageURL = imageURL;
        this.score = score;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", imageURL='" + imageURL + '\'' +
                ", score=" + score +
                '}';
    }
}

package com.wildcodeschool.rest_quest.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String director;

    private String description;

    private String image;

   /* @OneToMany(mappedBy = "movie")
    private List<ToWatch> toWatch;

    public void setToWatch(List<ToWatch> toWatch) {
        this.toWatch = toWatch;
    }

    public List<ToWatch> getToWatch() {
        return toWatch;
    }

    @OneToMany(mappedBy = "movie")
    private List<Watched> watched;

    public List<Watched> getWatched() {
        return watched;
    }

    public void setWatched(List<Watched> watched) {
        this.watched = watched;
    }
*/
    public Movie() {
    }

    public Movie(String title, String director, String description, String image) {
        this.title=title;
        this.director=director;
        this.description= description;
        this.image=image;

    };

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

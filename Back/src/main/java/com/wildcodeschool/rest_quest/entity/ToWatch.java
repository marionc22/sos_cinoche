package com.wildcodeschool.rest_quest.entity;

import javax.persistence.*;
import java.util.List;


@Entity
public class ToWatch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String movie_title;

    private String user_name;
  /*  @ManyToOne
    @JoinColumn@JoinColumn(name = "movie_id", referencedColumnName = "MOVIE_ID", insertable = false, updatable = false)
    private Movie movie;

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Movie getMovie() {
        return movie;
    }
*/
    public ToWatch() {
    }

    public ToWatch(String movie_title, String user_name) {
        this.movie_title=movie_title;
        this.user_name=user_name;

    };

}

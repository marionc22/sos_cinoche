package com.wildcodeschool.rest_quest.controller;


import com.wildcodeschool.rest_quest.repository.WatchedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WatchedController {

    @Autowired
    WatchedRepository watchedRepository;


}

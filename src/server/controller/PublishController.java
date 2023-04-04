package server.controller;

import server.model.Story;
import server.service.PublishService;
import server.service.PublishServiceImpl;

public class PublishController {

    PublishService publishService = new PublishServiceImpl();

    public void publish(Story story) {
        publishService.publish(story);
    }
}

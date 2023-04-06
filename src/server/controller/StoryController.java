package server.controller;

import server.model.Project;
import server.service.StoryService;
import server.service.StoryServiceImpl;

public class StoryController {

    private StoryService storyService = new StoryServiceImpl();

    // The session is responsible for thing the user from the session
    public void createStory(Project project) {
    }

    public void edit(Project project) {
    }

    // Delete
    // Add story
    // Add plot
    // getStoryDetails
}
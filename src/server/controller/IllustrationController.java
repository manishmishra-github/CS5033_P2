package server.controller;

import server.model.Project;
import server.model.Story;
import server.service.IllustrationService;
import server.service.IllustrationServiceImpl;

public class IllustrationController {

    IllustrationService illustrationService = new IllustrationServiceImpl();

    public void requestIllustration(Project project, String request) {
        illustrationService.request(project, request);
    }

    public void requestIllustration(Story story, String request) {
        illustrationService.request(story, request);
    }
}

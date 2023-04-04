package server.service;

import server.model.Story;
import server.model.Project;

public interface IllustrationService {
    void request(Project project, String request);
    void request(Story story, String request);
}

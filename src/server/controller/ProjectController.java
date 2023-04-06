package server.controller;

import server.model.Project;
import server.service.ProjectService;
import server.service.ProjectServiceImpl;

/***
 * /project
 */
public class ProjectController {

    private ProjectService projectService = new ProjectServiceImpl();

    // The session is responsible for thing the user from the session
    public void createProject(Project project) {
    }

    public void edit(Project project) {
    }

    // Delete
    // Add story
    // Add plot
    // getProjectDetails
}

package server.controller;

import client.service.ChangeService;
import client.service.ChangeServiceImpl;
import server.model.Project;

public class ChangeController {
    private ChangeService changeService = new ChangeServiceImpl();

    public void push(Project project) {
    }

    public void pull(Project project) {
    }
}

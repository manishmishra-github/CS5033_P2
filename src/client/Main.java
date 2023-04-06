package client;

import client.gui.Application;
import client.service.ChangeService;
import client.service.ChangeServiceImpl;
import client.service.RequestService;
import client.service.RequestServiceImpl;

public class Main {
    public static void main(String[] args) {
        ChangeService changeService = new ChangeServiceImpl();
        RequestService requestService = new RequestServiceImpl();
        Application application = new Application();
    }
}
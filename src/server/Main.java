package server;

import server.controller.*;

public class Main {

    /***
     * Start server.
     */
    public static void main(String[] args) {
        ChapterController chapterController = new ChapterController();
        IllustrationController illustrationController = new IllustrationController();
        PaymentController paymentController = new PaymentController();
        PlotController plotController = new PlotController();
        ProjectController projectController = new ProjectController();
        PublishController publishController = new PublishController();
        StoryController storyController = new StoryController();
        UserController userController = new UserController();
        VersionControlController versionControlController = new VersionControlController();
    }
}
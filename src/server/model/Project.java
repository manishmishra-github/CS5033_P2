package server.model;

public class Project {
    private Story[] stories;
    private String title;
    private User chief;
    private User[] writers;

    public Project(Story[] stories, String title, User chief, User[] writers) {
        this.stories = stories;
        this.title = title;
        this.chief = chief;
        this.writers = writers;
    }

    public Story[] getStories() {
        return stories;
    }

    public void setStories(Story[] stories) {
        this.stories = stories;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getChief() {
        return chief;
    }

    public void setChief(User chief) {
        this.chief = chief;
    }

    public User[] getWriters() {
        return writers;
    }

    public void setWriters(User[] writers) {
        this.writers = writers;
    }
}

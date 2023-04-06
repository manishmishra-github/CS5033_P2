package client.model;

public class Story {

    private Chapter[] chapters;
    private String title;
    private User[] writers;

    public Story(Chapter[] chapters, String title, User[] writers) {
        this.chapters = chapters;
        this.title = title;
        this.writers = writers;
    }

    public Chapter[] getChapters() {
        return chapters;
    }

    public void setChapters(Chapter[] chapters) {
        this.chapters = chapters;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User[] getWriters() {
        return writers;
    }

    public void setWriters(User[] writers) {
        this.writers = writers;
    }
}

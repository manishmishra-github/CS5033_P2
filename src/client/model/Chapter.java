package client.model;

public class Chapter {
    private int index;
    private String summary;
    private Plot[] plots;

    public Chapter(int index, String summary, Plot[] plots) {
        this.index = index;
        this.summary = summary;
        this.plots = plots;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
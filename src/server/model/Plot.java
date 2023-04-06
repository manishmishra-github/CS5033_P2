package server.model;

import java.util.Date;

public class Plot {
    private Date startDate;
    private Date endDate;
    private String title;
    private String summary;

    public Plot(Date startDate, Date endDate, String title, String summary) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.title = title;
        this.summary = summary;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}

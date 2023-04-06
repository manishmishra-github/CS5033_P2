package server.model;

public class User {
    private String name;
    private String email;
    private String passwordHash;
    private boolean isSubscribed;
    private Project[] projects;

    public User(String name, String email, String passwordHash, boolean isSubscribed, Project[] projects) {
        this.name = name;
        this.email = email;
        this.passwordHash = passwordHash;
        this.isSubscribed = isSubscribed;
        this.projects = projects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public boolean isSubscribed() {
        return isSubscribed;
    }

    public void setSubscribed(boolean subscribed) {
        isSubscribed = subscribed;
    }

    public Project[] getProjects() {
        return projects;
    }

    public void setProjects(Project[] projects) {
        this.projects = projects;
    }
}

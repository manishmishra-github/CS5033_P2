package server;

import server.model.User;

import java.util.HashMap;

public class SessionHandler {

    public enum Status {
        AuthenticatedWriter(Role.Writer),
        AuthenticatedChiefWriter(Role.ChiefWriter),
        NotAuthenticated(null);

        private enum Role {
            Writer,
            ChiefWriter,
            PaidChiefWriter
        }

        final Role role;

        Status(Role role) {
            this.role = role;
        }
    }

    private final HashMap<User, Status> sessions = new HashMap<>();

    public void createSession(User user) {
    }

    public void verifySession(User user, Status status) {

    }
}

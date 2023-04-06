package server.auth;

import server.SessionHandler;
import server.model.User;

public class SessionAuthenticatorFilter {
    private SessionHandler sessionHandler = new SessionHandler();

    public void filterSessions(User user, SessionHandler.Status status) {
        sessionHandler.verifySession(user, status);
    }
}

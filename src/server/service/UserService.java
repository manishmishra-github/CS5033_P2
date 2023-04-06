package server.service;

import server.model.User;

public interface UserService {
    void register(User user);
    void login(User user);
}

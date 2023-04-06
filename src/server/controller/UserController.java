package server.controller;

import server.model.User;
import server.service.UserService;
import server.service.UserServiceImpl;

/***
 * /auth
 */
public class UserController {

    private UserService userService = new UserServiceImpl();

    /***
     * /register
     * @param user the user
     */
    public void register(User user) {
        userService.register(user);
    }

    /***
     * /login
     * @param user the user
     */
    public void login(User user) {
        userService.login(user);
    }
}

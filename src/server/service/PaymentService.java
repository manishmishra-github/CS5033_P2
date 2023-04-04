package server.service;

import server.model.User;

public interface PaymentService {
    String subscribe(User user);

    void makePayment(String output);
}

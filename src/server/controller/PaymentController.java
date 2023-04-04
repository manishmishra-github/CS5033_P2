package server.controller;

import server.model.User;
import server.service.PaymentService;
import server.service.PaymentServiceImpl;

public class PaymentController {

    PaymentService paymentService = new PaymentServiceImpl();

    public void subscribe(User user) {
        String output = paymentService.subscribe(user);
        paymentService.makePayment(output);
    }
}

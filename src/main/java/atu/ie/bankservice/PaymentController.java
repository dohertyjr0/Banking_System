package atu.ie.bankservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {
    private final PaymentServices paymentServices;
    public PaymentController(PaymentServices paymentServices) {
        this.paymentServices = paymentServices;
    }

    @GetMapping
    public List<Payment> getPayments() {
        return paymentServices.getPayments();
    }
}

package atu.ie.bankservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public Payment createPayment(@RequestBody Payment payment) {
        return paymentServices.createPayment(payment);
    }

    @PutMapping
    public List<Payment> updatePayment(@RequestBody Payment payment) {
        return paymentServices.updatePayment(payment);
    }
}

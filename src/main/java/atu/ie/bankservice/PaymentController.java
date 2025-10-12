package atu.ie.bankservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    private final PaymentServices paymentServices;

    public PaymentController(PaymentServices paymentServices) {
        this.paymentServices = paymentServices;
    }

    @GetMapping("/get")
    public List<Payment> getPayments() {
        return paymentServices.getPayments();
    }

    @PostMapping("/post")
    public List<Payment> createPayment(@RequestBody Payment payment) {
        return paymentServices.createPayment(payment);
    }

    @PutMapping("/update")
    public Payment updatePayment(@RequestBody Payment payment) {
        return paymentServices.updatePayment(payment);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePayment(@PathVariable String id) {
        boolean removed = paymentServices.deleteById(id);
    }
}

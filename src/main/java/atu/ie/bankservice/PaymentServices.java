package atu.ie.bankservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PaymentServices {
    private final List<Payment> payments;

    public PaymentServices(){
        payments = new ArrayList<>();
        payments.add(new Payment("IE", 300, "Matthew", "John"));
    }

    public List<Payment> getPayments(PaymentServices payment) {
        return payments;
    }

    public List<Payment> createPayment(@RequestParam Payment payment) {
        payments.add(payment);
        return payments;
    }

    public List<Payment> updatePayment(Payment payment) {
        payments.add(payment);
        return List.of(payment);
    }
}

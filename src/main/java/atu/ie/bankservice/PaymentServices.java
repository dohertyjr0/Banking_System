package atu.ie.bankservice;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaymentServices {
    private final List<Payment> payments = new ArrayList<>();

    public List<Payment> getPayments() {
        return payments;
    }

    public Payment createPayment(Payment payment) {
        payments.add(payment);
        return payment;
    }

    public List<Payment> updatePayment(Payment payment) {
        payments.add(payment);
        return List.of(payment);
    }
}

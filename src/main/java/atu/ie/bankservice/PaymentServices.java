package atu.ie.bankservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class PaymentServices {
    private final List<Payment> payments;

    public PaymentServices(){
        payments = new ArrayList<>();
        payments.add(new Payment("0", 300, "Matthew", "John"));
        payments.add(new Payment("1", 200, "Jack", "John"));
        payments.add(new Payment("2", 400, "David", "John"));
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public List<Payment> createPayment(Payment payment) {
        payments.add(payment);
        return payments;
    }

    public Payment updatePayment(Payment payment) {
        for(int i = 0; i < payments.size(); i++){
            if(payments.get(i).getId().equals(payment.getId())){
                payments.set(i, payment);
                return payment;
            }
        }
        payments.add(payment);
        return payment;
    }

    public Payment getById(String id){
        for(int i = 0; i < payments.size(); i++){
            Payment p =  payments.get(i);
            if(p.getId().equals(id)){
                return p;
            }
        }
        return null;
    }

    public boolean deleteById(String id){
        return payments.removeIf(p -> p.getId().equals(id));
    }
}

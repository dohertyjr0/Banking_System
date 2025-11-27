package atu.ie.bankservice;

import atu.ie.bankservice.payments.Payment;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaymentServiceTest {

    @Test
    void createTwoPayments_listContainsBoth() {
        // Arrange
        List<Payment> payments = new ArrayList<>();

        Payment p1 = Payment.builder()
                .amount(50.0)
                .sender("alice")
                .receiver("bob")
                .build();

        Payment p2 = Payment.builder()
                .amount(75.0)
                .sender("bob")
                .receiver("charlie")
                .build();

        // Act
        payments.add(p1);
        payments.add(p2);

        // Assert
        assertEquals(2, payments.size());
        assertEquals(50.0, payments.get(0).getAmount());
        assertEquals("alice", payments.get(0).getSender());
        assertEquals("bob",   payments.get(0).getReceiver());

        assertEquals(75.0, payments.get(1).getAmount());
        assertEquals("bob",     payments.get(1).getSender());
        assertEquals("charlie", payments.get(1).getReceiver());
    }

    @Test
    void builderSetsFieldsCorrectly() {
        Payment payment = Payment.builder()
                .amount(100.0)
                .sender("test-sender")
                .receiver("test-receiver")
                .build();

        assertEquals(100.0,        payment.getAmount());
        assertEquals("test-sender", payment.getSender());
        assertEquals("test-receiver", payment.getReceiver());
    }
}


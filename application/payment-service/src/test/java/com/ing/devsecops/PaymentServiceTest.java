package com.ing.devsecops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentServiceTest {

    private final PaymentService paymentService = new PaymentService();

    @Test
    void shouldProcessValidPayment() {
        assertTrue(paymentService.processPayment(100.00));
    }

    @Test
    void shouldRejectZeroPayment() {
        assertFalse(paymentService.processPayment(0));
    }

    @Test
    void shouldRejectNegativePayment() {
        assertFalse(paymentService.processPayment(-50.00));
    }
}
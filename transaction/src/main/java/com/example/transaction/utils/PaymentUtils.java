package com.example.transaction.utils;

import com.example.transaction.exception.InsufficientAmount;

import java.util.HashMap;

public class PaymentUtils {
    private static final HashMap<String, Double> paymentMap = new HashMap<>();
    static {
        paymentMap.put("acc1", 12000.0);
        paymentMap.put("acc2", 10000.0);
        paymentMap.put("acc3", 8000.0);
        paymentMap.put("acc4", 5000.0);
    }

    public static boolean validateCreditLimit(String accNo, double paidAmount){
        if(paidAmount > paymentMap.get(accNo)){
            throw new InsufficientAmount("insufficient fund!");
        } else {
            return true;
        }
    }
}

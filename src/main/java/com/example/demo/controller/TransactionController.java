package com.example.demo.controller;

import com.example.demo.model.Transaction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@RestController
public class TransactionController {

    @GetMapping("/transactions")
    public List<Transaction> getTransactions() {
        List<Transaction> transactions = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;

        String[] merchants = {
                "Jollibee", "SM Supermarket", "Grab Philippines", "Shopee Philippines", "Mercury Drug",
                "Lazada", "7-Eleven", "Robinsons Mall", "Watsons", "Mang Inasal",
                "Starbucks", "KFC", "Unilab", "Cebu Pacific", "Globe Telecom",
                "Smart Communications", "PhilHealth", "BDO Bank", "Metrobank", "Ayala Malls"
        };

        String[] customers = {
                "Maria Santos", "Juan dela Cruz", "Ana Reyes", "Roberto Garcia", "Lisa Gonzales",
                "Mark Villanueva", "Sophia Cruz", "Daniel Ramos", "Catherine Lim", "James Navarro",
                "Andrea Bautista", "Patrick Tan", "Melissa Ong", "George Salvador", "Paolo Mendoza",
                "Kristine Dela Rosa", "Miguel Gutierrez", "Ella Hernandez", "Victor Castillo", "Nicole Aquino"
        };

        String[] statuses = {"Success", "Processing", "Pending", "Failed"};

        for (int i = 1; i <= 20; i++) {
            Transaction t = new Transaction();
            t.setAmount(500 + (Math.random() * 5000)); // random amount
            t.setMerchant(merchants[i - 1]);
            t.setCustomer(customers[i - 1]);
            t.setMethod("GCash");
            t.setStatus(statuses[i % statuses.length]);
            t.setReference_number("pytm" + String.format("%03d", i));
            t.setTimestamp(LocalDateTime.now().minusMinutes(i * 5).format(formatter));
            t.setFee(i % 3 == 0 ? 5 : 0);
            if ("Failed".equals(t.getStatus())) {
                t.setError_message("Insufficient funds");
            }
            transactions.add(t);
        }

        return transactions;
    }
}

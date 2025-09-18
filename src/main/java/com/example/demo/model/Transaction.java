package com.example.demo.model;

public class Transaction {
    private double amount;
    private String merchant;
    private String customer;
    private String method;
    private String status;
    private String reference_number;
    private String timestamp;
    private double fee;
    private String error_message;

    // Getters and Setters
    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public String getMerchant() { return merchant; }
    public void setMerchant(String merchant) { this.merchant = merchant; }

    public String getCustomer() { return customer; }
    public void setCustomer(String customer) { this.customer = customer; }

    public String getMethod() { return method; }
    public void setMethod(String method) { this.method = method; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getReference_number() { return reference_number; }
    public void setReference_number(String reference_number) { this.reference_number = reference_number; }

    public String getTimestamp() { return timestamp; }
    public void setTimestamp(String timestamp) { this.timestamp = timestamp; }

    public double getFee() { return fee; }
    public void setFee(double fee) { this.fee = fee; }

    public String getError_message() { return error_message; }
    public void setError_message(String error_message) { this.error_message = error_message; }
}

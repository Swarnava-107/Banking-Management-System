package domain;

import java.time.LocalDateTime;

public class Transaction {
    private String id;
    private Type type;
    private double amount;
    private String accountNumber;
    private LocalDateTime transactionDate;
    private String note;

    public Transaction(String id, Type type, double amount, String accountNumber, LocalDateTime transactionDate, String note) {
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.accountNumber = accountNumber;
        this.transactionDate = transactionDate;
        this.note = note;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}

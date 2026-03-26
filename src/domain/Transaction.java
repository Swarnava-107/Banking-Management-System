package domain;

import java.time.LocalDateTime;

public class Transaction {
    private String id;
    private Type type;
    private double amount;
    private String accountNumber;
    private String transactionAmount;
    private LocalDateTime transactionDate;
    private String note;

    public Transaction(String id, Type type, double amount, String accountNumber, String transactionAmount, LocalDateTime transactionDate, String note) {
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.accountNumber = accountNumber;
        this.transactionAmount = transactionAmount;
        this.transactionDate = transactionDate;
        this.note = note;
    }
}

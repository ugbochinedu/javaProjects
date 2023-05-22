package Exceptions;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {
    private String reference;
    private BigDecimal amount;
    private LocalDateTime createAt;

    public Transaction(String reference, BigDecimal amount){
        this.reference = reference;
        this.amount = amount;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }
}

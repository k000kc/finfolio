package ru.github.apetrov.finfolio.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "assets")
public class Asset {

    @Id
    @Column(name = "ticker", length = 20)
    private String ticker;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "current_price", precision = 19, scale = 4)
    private BigDecimal currentPrice;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public Asset() {
    }

    public Asset(String ticker, String name, BigDecimal currentPrice, LocalDateTime updatedAt) {
        this.ticker = ticker;
        this.name = name;
        this.currentPrice = currentPrice;
        this.updatedAt = updatedAt;
    }

    public String getTicker() { return ticker; }
    public void setTicker(String ticker) { this.ticker = ticker; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public BigDecimal getCurrentPrice() { return currentPrice; }
    public void setCurrentPrice(BigDecimal currentPrice) { this.currentPrice = currentPrice; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
}
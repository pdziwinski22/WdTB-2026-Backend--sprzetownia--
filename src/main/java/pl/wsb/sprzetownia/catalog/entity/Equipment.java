package pl.wsb.sprzetownia.catalog.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "equipment")
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 80)
    private String name;

    @Column(name = "inventory_number", nullable = false, unique = true, length = 20)
    private String inventoryNumber;

    @Column(name = "daily_price", nullable = false, precision = 10, scale = 2)
    private BigDecimal dailyPrice;

    @Column(name = "deposit", nullable = false, precision = 10, scale = 2)
    private BigDecimal deposit;

    @Enumerated(EnumType.STRING)
    @Column(name = "condition", nullable = false, length = 20)
    private EquipmentCondition condition;

    @Column(name = "purchase_date")
    private LocalDate purchaseDate;

    protected Equipment() {
    }

    public Equipment(String name, String inventoryNumber, BigDecimal dailyPrice, BigDecimal deposit,
                     EquipmentCondition condition, LocalDate purchaseDate) {
        this.name = name;
        this.inventoryNumber = inventoryNumber;
        this.dailyPrice = dailyPrice;
        this.deposit = deposit;
        this.condition = condition;
        this.purchaseDate = purchaseDate;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getInventoryNumber() {
        return inventoryNumber;
    }

    public BigDecimal getDailyPrice() {
        return dailyPrice;
    }

    public BigDecimal getDeposit() {
        return deposit;
    }

    public EquipmentCondition getCondition() {
        return condition;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }
}

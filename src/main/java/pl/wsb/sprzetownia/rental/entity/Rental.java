package pl.wsb.sprzetownia.rental.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "rental")
public class Rental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false, length = 20)
    private RentalStatus status;

    @Column(name = "reserved_at", nullable = false)
    private LocalDateTime reservedAt;

    @Column(name = "start_date", nullable = false)
    private LocalDate startDate;

    @Column(name = "planned_return_date", nullable = false)
    private LocalDate plannedReturnDate;

    @Column(name = "returned_on")
    private LocalDate returnedOn; // puste, dopóki sprzęt nie wrócił

    protected Rental() {
    }

    public Rental(RentalStatus status, LocalDateTime reservedAt, LocalDate startDate,
                  LocalDate plannedReturnDate, LocalDate returnedOn) {
        this.status = status;
        this.reservedAt = reservedAt;
        this.startDate = startDate;
        this.plannedReturnDate = plannedReturnDate;
        this.returnedOn = returnedOn;
    }

    public Long getId() {
        return id;
    }

    public RentalStatus getStatus() {
        return status;
    }

    public LocalDateTime getReservedAt() {
        return reservedAt;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getPlannedReturnDate() {
        return plannedReturnDate;
    }

    public LocalDate getReturnedOn() {
        return returnedOn;
    }
}

package pl.wsb.sprzetownia.catalog.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "rental_point")
public class RentalPoint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, unique = true, length = 60)
    private String name;

    @Column(name = "phone", length = 20)
    private String phone;

    @Column(name = "capacity", nullable = false)
    private Integer capacity; // ile sztuk sprzętu mieści punkt

    @Column(name = "active", nullable = false)
    private Boolean active;

    @Embedded
    private Address address;

    protected RentalPoint() {
    }

    public RentalPoint(String name, String phone, Integer capacity, Boolean active, Address address) {
        this.name = name;
        this.phone = phone;
        this.capacity = capacity;
        this.active = active;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public Boolean getActive() {
        return active;
    }

    public Address getAddress() {
        return address;
    }
}

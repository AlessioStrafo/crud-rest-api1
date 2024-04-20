package co.develhope.crudrestapi.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false, name = "modelName")
    private String modelName;
    @Column(nullable = false, name = "serialNumber")
    private int serialNumber;
    @Column(nullable = true, name = "currentPrice")
    private double currentPrice;
}

package com.example.lab4_20202073.Entity;

import com.example.lab4_20202073.Entity.Aerolinea;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.cglib.core.Local;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "vuelo")
public class Vuelo {
    @Id
    @Column(name = "idvuelo", nullable = false)
    private Integer id;

    @Column(name = "origen", nullable = false, length = 45)
    private String origen;

    @Column(name = "destino", nullable = false, length = 45)
    private String destino;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "fecha_salida", nullable = false)
    private LocalDate fechaSalida;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "fecha_llegada", nullable = false)
    private LocalDate fechaLlegada;

    @Column(name = "duracion", nullable = false)
    private Integer duracion;

    @Column(name = "precio", nullable = false)
    private Double precio;

    @Column(name = "asientos_disponibles", nullable = false)
    private Integer asientosDisponibles;

    @Column(name = "descripcion", nullable = false, length = 500)
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "aerolinea_idaerolinea", nullable = false)
    private Aerolinea aerolinea;

}
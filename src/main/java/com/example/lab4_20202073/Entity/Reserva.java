package com.example.lab4_20202073.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "reserva")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idreserva", nullable = false)
    private Integer id;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "fecha_reserva", nullable = false)
    private LocalDate fechaReserva;

    @Column(name = "precio_total", nullable = false)
    private Double precioTotal;

    @Column(name = "estado_pago", nullable = false, length = 45)
    private String estadoPago;

    @ManyToOne
    @JoinColumn(name = "user_iduser", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "vuelo_idvuelo", nullable = false)
    private Vuelo vuelo;

}
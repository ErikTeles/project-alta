package br.com.alta.api.domain.occupationalrecords;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "occupational_records")
public class OccupationalRecords {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotBlank
    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "status")
    private String status;

    @Column(name = "performed_at")
    private LocalDate performedAt;

    @Column(name = "expiration_date")
    private LocalDate expirationDate;

    @Column(name = "user_id")
    private UUID userId;

    @Column(name = "record_type_id")
    private Long recordTypeId;
}
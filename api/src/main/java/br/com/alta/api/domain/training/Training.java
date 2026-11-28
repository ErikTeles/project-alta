package br.com.alta.api.domain.training;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "training")
public class Training {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotBlank
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "workload")
    private Integer workload;

    @Column(name = "validity_period")
    private Integer validityPeriod;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "record_type_id")
    private Long record_type_id;

}

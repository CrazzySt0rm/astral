package AstraLinux.astral.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "magic")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SomeMagic {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String special;

    @ManyToOne
    @JoinColumn(name = "world_id")
    private MyWorld myWorld;
}

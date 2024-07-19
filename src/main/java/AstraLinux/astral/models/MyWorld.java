package AstraLinux.astral.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.engine.transaction.jta.platform.internal.JBossAppServerJtaPlatform;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "world")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MyWorld {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;           //universe

    @OneToMany
    private Set<SomeMagic> myMagic = new HashSet<>();



}

package AstraLinux.astral.repositories;

import AstraLinux.astral.models.SomeMagic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SomeMagicRepository extends JpaRepository<SomeMagic, Long> {
}

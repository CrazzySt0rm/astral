package AstraLinux.astral.repositories;

import AstraLinux.astral.models.MyWorld;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyWorldRepository extends JpaRepository<MyWorld, Long> {
}

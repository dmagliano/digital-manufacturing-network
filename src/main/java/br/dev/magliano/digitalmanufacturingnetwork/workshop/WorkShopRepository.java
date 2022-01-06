package br.dev.magliano.digitalmanufacturingnetwork.workshop;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkShopRepository extends JpaRepository<Workshop, Long> {
}

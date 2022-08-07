package ufps.ukulima.infrastructure.driven_adapters.jpa.ClaseTextural;

import org.springframework.data.jpa.repository.JpaRepository;

import ufps.ukulima.infrastructure.db.springdata.entity.ClaseTextural.ClaseTexturalEntity;

public interface ClaseTexturalRepository extends JpaRepository<ClaseTexturalEntity, Integer> {
}

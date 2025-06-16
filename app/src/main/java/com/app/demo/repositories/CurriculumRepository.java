package com.app.demo.repositories;

import com.app.demo.models.Curriculum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurriculumRepository extends JpaRepository<Curriculum, Long> {
    // Aquí puedes añadir métodos personalizados si los necesitas
}

package com.app.demo.controllers;
import com.app.demo.models.Curriculum;
import com.app.demo.repositories.CurriculumRepository;
import jakarta.transaction.Transactional;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/curriculum")
@CrossOrigin(origins = "*")
public class CurriculumController {

    private final CurriculumRepository curriculumRepository;

    public CurriculumController(CurriculumRepository curriculumRepository) {
        this.curriculumRepository = curriculumRepository;
    }

    @Transactional
    @GetMapping("/{id}")
public ResponseEntity<Curriculum> getCurriculum(@PathVariable Long id) {
    return curriculumRepository.findById(id)
        .map(curriculum -> {
            curriculum.getAptitudes().size();
            curriculum.getFormacion().size();
            curriculum.getExperiencia().size();
            return ResponseEntity.ok(curriculum);
        })
        .orElse(ResponseEntity.notFound().build());
}

}

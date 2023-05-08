package com.argprog.proint.services;

import com.argprog.proint.models.Experiencia;
import com.argprog.proint.repository.ExperienciaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ExperienciaService {

    public final ExperienciaRepo experienciaRepo;

    @Autowired
    public ExperienciaService(ExperienciaRepo experienciaRepo) {
        this.experienciaRepo = experienciaRepo;
    }

    public Experiencia addExperience(Experiencia experiencia){
        return experienciaRepo.save(experiencia);
    }

    public List<Experiencia> findAllExperience(){
        return experienciaRepo.findAll();
    }

    public Experiencia updateExperience(Experiencia experiencia){
        return experienciaRepo.save(experiencia);
    }

    public void deleteExperience(Long id){
        experienciaRepo.deleteById(id);
    }
}

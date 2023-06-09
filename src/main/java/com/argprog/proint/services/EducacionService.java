package com.argprog.proint.services;

import com.argprog.proint.models.Educacion;
import com.argprog.proint.repository.EducacionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EducacionService {

    public final EducacionRepo educacionRepo;

    @Autowired
    public EducacionService(EducacionRepo educacionRepo) {
        this.educacionRepo = educacionRepo;
    }

    public Educacion addEducation(Educacion educacion){
        return educacionRepo.save(educacion);
    }

    public List<Educacion>findAllEducation(){
        return educacionRepo.findAll();
    }

    public Educacion updateEducation(Educacion educacion){
        return educacionRepo.save(educacion);
    }

    public void deleteEducation(Long id){
        educacionRepo.deleteById(id);
    }

}

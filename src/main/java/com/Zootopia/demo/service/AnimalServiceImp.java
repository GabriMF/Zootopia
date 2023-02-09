package com.Zootopia.demo.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.Zootopia.demo.entity.Animal;
import com.Zootopia.demo.repository.AnimalRepository;



@Service
public class AnimalServiceImp implements AnimalService {
    @Autowired
    private AnimalRepository animalRepository;
    @Override
    @Transactional(readOnly = true)
    public List<Animal> findAll() {
        return animalRepository.findAll();
    }
    @Transactional(readOnly = true)
    @Override
    public Page<Animal> findAll(Pageable pageable) {
        return animalRepository.findAll(pageable);
    }
    @Transactional(readOnly = true)
    @Override
    public Optional<Animal> findById(Long id) {
        return animalRepository.findById(id);
    }
    @Transactional
    @Override
    public Animal save(Animal animal) {
        return animalRepository.save(animal);
    }
    @Transactional
    @Override
    public void deleteById(Long id) {
         animalRepository.deleteById(id);
    }
}


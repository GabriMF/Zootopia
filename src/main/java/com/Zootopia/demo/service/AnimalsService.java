package com.Zootopia.demo.service;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.Zootopia.demo.entity.User;
public interface AnimalsService {
    public Iterable<User> findAll();
    public Page<User> findAll(Pageable pageable);
    public Optional<User> findById(Long id);
    public User save(User user);
    public void deleteById(Long id);
}

package br.com.farmacia.service;

import br.com.farmacia.model.ModelUser;
import br.com.farmacia.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class UserService {
    final UserRepository repository;
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    void saveUser() {
        repository.save(new ModelUser(1, "NomeTeste"));
    }

    public List<ModelUser> getAllUsers() {
        return repository.findAll();
    }
}

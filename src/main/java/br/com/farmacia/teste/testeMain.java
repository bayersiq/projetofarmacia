package br.com.farmacia.teste;

import org.h2.engine.User;
import org.hibernate.internal.build.AllowPrintStacktrace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@SpringBootApplication
public class testeMain {

    public static void main(String[] args) {
        SpringApplication.run(testeMain.class, args);
    }

    @RestController
    public static class UserController {
        @Autowired
        UserServices userServices;
        @GetMapping
        public List<ModelUser> getAllUsers() {
            return userServices.getAllUsers();
        }
    }

    @Service
    public static class UserServices {
        final H2repository h2repository;
        UserServices(H2repository h2repository) {
            this.h2repository = h2repository;
        };

        @PostConstruct
        void saveUser() {
            h2repository.save(new ModelUser(1, "NomeTeste"));
        }

        public List<ModelUser> getAllUsers() {
            return h2repository.findAll();
        }
    }

    @Repository
    public static interface H2repository extends JpaRepository <ModelUser, Long> {

    }

    @Entity
    public static class ModelUser {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        private String name;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public ModelUser(long id, String name) {
            this.id = id;
            this.name = name;
        }

        public ModelUser() {
        }

        @Override
        public String toString() {
            return "ModelUser{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

    }

}

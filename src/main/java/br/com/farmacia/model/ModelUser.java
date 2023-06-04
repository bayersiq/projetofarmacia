package br.com.farmacia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ModelUser {
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
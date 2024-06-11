package ch.zhaw.criminalcase.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Defendant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;

    @OneToMany(mappedBy = "defendant")
    private List<Indictment> indictments;

    // Getter und Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Indictment> getIndictments() {
        return indictments;
    }

    public void setIndictments(List<Indictment> indictments) {
        this.indictments = indictments;
    }
}

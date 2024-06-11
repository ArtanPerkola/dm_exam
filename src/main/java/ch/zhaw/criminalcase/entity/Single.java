package ch.zhaw.criminalcase.entity;

import javax.persistence.Entity;
import javax.persistence.DiscriminatorValue;

@Entity
@DiscriminatorValue("SINGLE")
public class Single extends Crime {
    private String location;

    // Getter und Setter
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

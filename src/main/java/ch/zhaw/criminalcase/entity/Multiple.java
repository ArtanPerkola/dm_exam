package ch.zhaw.criminalcase.entity;

import javax.persistence.Entity;
import javax.persistence.DiscriminatorValue;

@Entity
@DiscriminatorValue("MULTIPLE")
public class Multiple extends Crime {
    private int numberOfIncidents;

    // Getter und Setter
    public int getNumberOfIncidents() {
        return numberOfIncidents;
    }

    public void setNumberOfIncidents(int numberOfIncidents) {
        this.numberOfIncidents = numberOfIncidents;
    }
}

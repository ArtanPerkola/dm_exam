package ch.zhaw.criminalcase.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Indictment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date indictmentDate;

    @ManyToOne
    @JoinColumn(name = "defendant_id")
    private Defendant defendant;

    @ManyToOne
    @JoinColumn(name = "crime_id")
    private Crime crime;

    // Getter und Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getIndictmentDate() {
        return indictmentDate;
    }

    public void setIndictmentDate(Date indictmentDate) {
        this.indictmentDate = indictmentDate;
    }

    public Defendant getDefendant() {
        return defendant;
    }

    public void setDefendant(Defendant defendant) {
        this.defendant = defendant;
    }

    public Crime getCrime() {
        return crime;
    }

    public void setCrime(Crime crime) {
        this.crime = crime;
    }
}

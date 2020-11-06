package data;

import java.time.LocalDate;

public class Personne {
    private int ordre;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    public int getOdre() {
        return ordre;
    }

    public Personne(int ordre, String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.ordre = ordre;
    }

    @Override
    public String toString() {
        return String.format("(%d) %s %s né le %s", ordre, firstName , lastName , birthDate );
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Personne personne = (Personne) o;

        if (ordre != personne.ordre) return false;
        if (firstName != null ? !firstName.equals(personne.firstName) : personne.firstName != null) return false;
        if (lastName != null ? !lastName.equals(personne.lastName) : personne.lastName != null) return false;
        return birthDate != null ? birthDate.equals(personne.birthDate) : personne.birthDate == null;

    }

    @Override
    public int hashCode() {
        int result = ordre;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        return result;
    }
}

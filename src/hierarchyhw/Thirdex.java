package hierarchyhw;

import java.time.LocalDateTime;
import java.time.Period;

public class Thirdex extends Employee{
    private String person;

    public Thirdex(LocalDateTime dateOfEmployement, String position) {
        super(dateOfEmployement, position);
        this.person = person;
    }

    public String getFullName() {
        return getFirstName() + " " + getLastName();
    }
    public int getAge() {
        LocalDateTime today = LocalDateTime.now();
        LocalDateTime birthday = getBirthday();
        Period period = Period.between(birthday.toLocalDate(), today.toLocalDate());
        return period.getYears();
    }

}

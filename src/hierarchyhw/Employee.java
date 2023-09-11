package hierarchyhw;

import java.time.LocalDateTime;

public class Employee implements Person {
    public LocalDateTime dateOfEmployement;
    public String position;

    public Employee(LocalDateTime dateOfEmployement, String position) {
        this.dateOfEmployement = dateOfEmployement;
        this.position = position;
    }

    public String getFirstName() {
        return "Nimrod";
    }

    public String getLastName() {
        return "Kovacs";
    }

    public LocalDateTime getBirthday() {
        return LocalDateTime.of(2002, 8, 27, 12, 2);
    }

    public String getAddress() {
        return "Targu Mures";
    }
    public String getPosition() {
        return "junior";
    }

    public LocalDateTime getDateOfEmployement() {
        return LocalDateTime.now();
    }

}

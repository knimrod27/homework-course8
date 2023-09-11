package hierarchyhw;

import java.time.LocalDateTime;

public class Programmer extends Employee{
    private String language;

    public Programmer(LocalDateTime dateOfEmployement, String position, String language) {
        super(dateOfEmployement, position);
        this.language = language;
    }

    public String getPosition() {
        return "programmer";
    }


}

package hierarchyhw;

import java.time.LocalDateTime;

public class DatabaseAdmin extends Employee{
    private String dbTechnology;

    public DatabaseAdmin(LocalDateTime dateOfEmployement, String position, String dbTechnology) {
        super(dateOfEmployement, position);
        this.dbTechnology = dbTechnology;
    }


    @Override
    public String getAddress() {
        return "db admin " +super.getAddress();
    }

}

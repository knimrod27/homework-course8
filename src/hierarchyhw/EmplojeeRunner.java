package hierarchyhw;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class EmplojeeRunner {
    public static void main(String[] args) {
        //Programmer programmer = new Programmer(LocalDateTime.of(2015, 12,10, 2, 2 ), "junior", "java");
        //DatabaseAdmin dtb = new DatabaseAdmin(LocalDateTime.now(), "admin", "SK");
        //Employee employee = new Employee(LocalDateTime.now(), "junior");
       //System.out.println(programmer.getPosition());
        //System.out.println(programmer.getBirthday());
        //System.out.println(programmer.getAddress());

        //System.out.println(employee.getPosition());

        //System.out.println(dtb.getAddress());

        //System.out.println(dtb.getFirstName());
        Thirdex person = new Thirdex(LocalDateTime.now(), "programmer");
        System.out.println(person.getFullName());
        System.out.println(person.getAge());







    }

}

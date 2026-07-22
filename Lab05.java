import java.time.LocalDate;

public class Lab05 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        User user = new User("Alice", 2000, today.getMonthValue(), today.getDayOfMonth());
        Admin admin = new Admin("Nicolas", 1962, today.getMonthValue(), today.getDayOfMonth());


        System.out.println(user.getBirthdayGreeting());
        System.out.println(admin.getBirthdayGreeting());
    }
}
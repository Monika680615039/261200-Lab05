import java.time.LocalDate;

public class Admin extends User{
    public Admin(){
        super();
    }


    public Admin(String name, int year, int month, int date){
        super(name, year, month, date);
    }

    @Override
    public String getInfo(){
        return super.getInfo() + " | User type: admin";
    }

    public String getInfo(boolean full){
        if(full){
            return this.getInfo() + " | Today's Date: " + LocalDate.now();
        }else
            return "Name: " + this.name + " ,DOB: " + this.dob;
    }

 // calcu Age
    public int getAge() {
        LocalDate today = LocalDate.now();
        return today.getYear() - dob.getYear();
    }

    // wishes birthday

    @Override
    public String getBirthdayGreeting() {
        String baseGreeting = super.getBirthdayGreeting();
        if (isBirthday()) {
            return baseGreeting + " You are " + getAge() + " years old!";
        }
        return baseGreeting;
    }
}
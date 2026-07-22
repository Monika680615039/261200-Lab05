import java.time.LocalDate;
public class User {
    // #name: String
    protected String name;
    // #dob: LocalDate
    protected LocalDate dob;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public User(){
        this("Unknown", LocalDate.now().getYear(), LocalDate.now().getMonthValue(), LocalDate.now().getDayOfMonth());
    }

    private void setDob(int year, int month, int date) {
        LocalDate newDob = LocalDate.of(year, month, date);

        if(newDob.isAfter(LocalDate.now())){
            this.dob = LocalDate.now();
        }
        else
            this.dob = LocalDate.of(year, month, date);
    }

    public User(String name, int year, int month, int date){
        this.setName(name);
        this.setDob(year, month, date); //Fix
    }

    //+getInfo(): String
    public String getInfo(){
        return "Name: " + name + " ,DOB: " + dob;
    }

    //check birthday

    public boolean isBirthday() {
        LocalDate today = LocalDate.now();
        return today.getMonthValue() == dob.getMonthValue()
                && today.getDayOfMonth() == dob.getDayOfMonth();
    }

    // sending wishes back
    public String getBirthdayGreeting() {
        if (isBirthday()) {
            return "Happy birthday " + name + "!";
        } else {
            return "It is not " + name + "'s birthday today.";
        }
    }
}

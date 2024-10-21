public class Customer {

    private String firstName;
    private String lastName;
    private String userName;
    private int id;
    private static int counter =1;

    Customer(String firstName, String lastName, String userName){
        setFirstName(firstName);
        setLastName(lastName);
        setUserName(userName);
        setId(counter);
        counter = counter+1;

    }

    @Override
    public String toString() {
        return "Name: "+getFirstName()+ ", " + getLastName()+ ", Username " +getUserName() + ", ID:"+getId();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName(){
        return userName;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

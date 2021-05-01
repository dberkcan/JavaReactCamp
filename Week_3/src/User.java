import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String password;
    private String email;

    public User(int id, String firstName, String lastName, String password, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
    }

    public void infoOperation() {
        System.out.println("Full Name: " + getFirstName() + getLastName());
    }

    public void welcomeSystem() {
        System.out.println(getFirstName() + " " + getLastName() + ", welcome to the system");
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }









}

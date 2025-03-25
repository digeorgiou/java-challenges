package InputOutputStreams;

import java.io.Serializable;

public class User implements Serializable {

    private String fullName;
    private String username;
    private String password;
    private int role;

    public User(String fullname, String username, String password, int role) {
        this.fullName = fullname;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Ονοματεπώνυμο: " + getFullName() + "\n" +
                "Username: " + getUsername() + "\n" +
                "Password: " + getPassword() + "\n" +
                "Ρολος " + ((getRole()== 1)? "admin" : "user");
    }
}

package Entity;

public class User {
    private String idUser;
    private String userName;
    private String password;
    private boolean idRole;

    public User() {
    }

    public User(String idUser, String userName, String password, boolean idRole) {
        this.idUser = idUser;
        this.userName = userName;
        this.password = password;
        this.idRole = idRole;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isIdRole() {
        return idRole;
    }

    public void setIdRole(boolean idRole) {
        this.idRole = idRole;
    }
    
}

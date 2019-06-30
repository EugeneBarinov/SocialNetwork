package enities;

public class User {
    private String name;
    private String surname;
    private String birthday;
    private String photoUrl;
    private String login;
    private String password;

    public User(String name, String surname, String birthday, String photoUrl, String login, String password) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.photoUrl = photoUrl;
        this.login = login;
        this.password = password;
    }

    public User(String name, String surname, String birthday, String login, String password) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.login = login;
        this.password = password;
        this.photoUrl = "Images/AvaDefault.jpg";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

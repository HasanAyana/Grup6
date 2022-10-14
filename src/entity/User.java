package entity;

public class User {

    //----------------------Fields ---------------------------------------------------------------------
    // 5 adet private degisken tanimlayin... String cinsinden firstName, lastName, userName, password.. Address cinsinden address
    // Address sinifi ayri bir sinif olarak tanimlanmistir... Address sinifindaki odevlerinizi yapiniz..

    private String firsName;
    private String lastName;
    private String userName;
    private String password;
    private Address address;





    //----------------------Constructor ---------------------------------------------------------------------
    // Tum degiskenleri constructor ile initilize ediniz...

    public User(String firsName, String lastName, String userName, String password, Address address) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.address = address;
    }


    //----------------------Getter and Setter ---------------------------------------------------------------------


    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

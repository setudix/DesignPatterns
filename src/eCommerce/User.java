package eCommerce;

public class User {
    private final ECommerceMediator mediator;
    private String name;
    private String email;
    private String password;
    private String address;

    public User(ECommerceMediator eCommerceMediator, String name, String email, String password, String address) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;

        this.mediator = eCommerceMediator;
        mediator.addUser(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}

package net.javaguides.springboot.web.dto;

public class UserRegistrationDto {
    private String lastName;
    private String firstName;
    private String password;
    private String email;

    public String getLastName() {
        return lastName;
    }

    public UserRegistrationDto(String lastName, String firstName, String password, String email) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.password = password;
        this.email = email;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

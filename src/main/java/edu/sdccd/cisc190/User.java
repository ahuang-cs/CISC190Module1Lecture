package edu.sdccd.cisc190;

public class User {
    private String name;
    private String email;


    public static String getClassName() {
        return "User";
    }

    public void sendEmail(String subject, String body) {

        // TODO send an email to a user
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
}

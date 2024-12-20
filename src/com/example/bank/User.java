package com.example.bank;

public class User {
    private int Id;
    private String Email;
    private String Name;
    private String Password;

    public User(int Id, String Name, String Email, String Password) {
        this.Id = Id;
        this.Name = Name;
        this.Password = Password;
    }

    public int getId() {
        return Id;
    }

    public String getEmail() {
        return Email;
    }

    public String getName() {
        return Name;
    }

    public String getPassword() {
        return Password;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public static boolean validatePassword(String password) {
        if (password.length() < 8) {
            System.out.println("Hasło musi miec wiecej niz 8 liter! ");
            return false;
        }

        System.out.println("Hasło poprawne.");
        return true;
    }

    public static boolean validateName(String name) {
        if (name.length() < 3) {
            System.out.println("Imie musi miec wiecej niz 3 litery");
            return false;
        }

        System.out.println("Imie prawidlowe");
        return true;
    }



}

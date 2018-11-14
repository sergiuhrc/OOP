package com.company;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class User {
    private String name;
    private boolean isActive;
    private Enum<Roles> roles;
    private String email;
    private BigDecimal balance;
    private LocalDate date;

    public User(String name, boolean isActive, Enum<Roles> roles, String email, BigDecimal balance, LocalDate date) {
        this.name = name;
        this.isActive = isActive;
        this.roles = roles;
        this.email = email;
        this.balance = balance;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public Enum<Roles> getRoles() {
        return roles;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getEmail() {
        return email;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public boolean isActive() {
        return isActive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return isActive == user.isActive &&
                Objects.equals(name, user.name) &&
                Objects.equals(roles, user.roles) &&
                Objects.equals(email, user.email) &&
                Objects.equals(balance, user.balance) &&
                Objects.equals(date, user.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isActive, roles, email, balance, date);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", isActive=" + isActive +
                ", roles=" + roles +
                ", email='" + email + '\'' +
                ", balance=" + balance +
                ", date=" + date +
                '}';
    }
    public String toStringUserRegestrationDate(){
        return "User{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';

    }
    public String toStringMinMaxBalance(){
        return "User{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}

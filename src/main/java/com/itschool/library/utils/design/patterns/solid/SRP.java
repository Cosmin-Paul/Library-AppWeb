package com.itschool.library.utils.design.patterns.solid;

public class SRP {
}

//Before: violating SRP
class UserService {
    void addUser() {
    }

    void sendEmail() {
    }
}

//After: following SRP
class UserService2 {
    void addUser() {
    }
}

class EmailService {
    void sendEmail() {
    }
}
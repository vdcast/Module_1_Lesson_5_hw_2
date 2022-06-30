package com.example.modul_1_zaniatie_5_dom_2;

public class Worker extends Human{

    public String createSignature(){
        String firstName = super.firstName;
        String lastName = super.lastName;
        String space = " ";
        String fullName = firstName + space + lastName;
        return fullName;
    }
}

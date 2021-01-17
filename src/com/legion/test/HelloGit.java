package com.legion.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloGit {
    public static void main(String[] args) {
        System.out.println(HelloGit.class.getName()+"=======================");
        System.out.println(new HelloGit());
        System.out.println(new HelloGit2());
        System.out.println(new HelloGit3());
    }

    @Override
    public String toString() {
        return SimpleDateFormat.getDateTimeInstance().format(new Date());
    }


}

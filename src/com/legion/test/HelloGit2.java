package com.legion.test;

public class HelloGit2 {
    @Override
    public String toString() {
        System.out.println(this.getClass().getName()+"===========toString============");
        System.out.println(this.equals(new HelloGit2()));
        return "toString method of HelloGit2";
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println(this.getClass().getName()+"===============equals========");
        return super.equals(obj);
    }
}

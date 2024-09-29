package com.java.trangile.seralization;

import java.io.*;

public class Employee extends Person implements Externalizable {
    public Employee() {
        System.out.println("Employee default constructor is called..");
    }

    private String email;
    private String password;

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

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        //Writing parent class ClassA fields
       // out.writeInt(getId());
        //out.writeObject(getName());
       // out.writeInt(getAge());

        // Writing child class fields
        out.writeObject(getEmail());
        out.writeObject(getPassword());
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        // Setting parent class fields
        //setId(in.readInt());
       // setName((String)in.readObject());
       // setAge(in.readInt());

        // Setting child class fields
        setEmail((String)in.readObject());
        setPassword((String)in.readObject());
    }
}

package com.edu.portal.models;


import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "StudentLoginData")
public class StudentLoginData {

    @Id
    private ObjectId _id;

    private String email;
    private String password;
    private String phoneNumber;

    public StudentLoginData(ObjectId _id, String email, String password, String phoneNumber) {
        this._id = _id;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

package com.edu.portal.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Document(collection = "StudentData")
public class StudentData {

    @Id
    private ObjectId _id;

    private String firstName;
    private String middleName;
    private String lastName;

    @DateTimeFormat(iso= DateTimeFormat.ISO.DATE_TIME)
    private java.util.Date dateOfBirth;

    private String firstLanguage;
    private String citizen;
    private String passport;

    @DateTimeFormat(iso= DateTimeFormat.ISO.DATE_TIME)
    private java.util.Date passportExpiryDate;

    private String married;
    private String gender;

    private String address;
    private String city;
    private String country;
    private String state;
    private String zip;

    public StudentData(ObjectId _id, String firstName, String middleName, String lastName, Date dateOfBirth, String firstLanguage, String citizen, String passport, Date passportExpiryDate, String married, String gender, String address, String city, String country, String state, String zip) {
        this._id = _id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.firstLanguage = firstLanguage;
        this.citizen = citizen;
        this.passport = passport;
        this.passportExpiryDate = passportExpiryDate;
        this.married = married;
        this.gender = gender;
        this.address = address;
        this.city = city;
        this.country = country;
        this.state = state;
        this.zip = zip;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstLanguage() {
        return firstLanguage;
    }

    public void setFirstLanguage(String firstLanguage) {
        this.firstLanguage = firstLanguage;
    }

    public String getCitizen() {
        return citizen;
    }

    public void setCitizen(String citizen) {
        this.citizen = citizen;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public Date getPassportExpiryDate() {
        return passportExpiryDate;
    }

    public void setPassportExpiryDate(Date passportExpiryDate) {
        this.passportExpiryDate = passportExpiryDate;
    }

    public String getMarried() {
        return married;
    }

    public void setMarried(String married) {
        this.married = married;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}

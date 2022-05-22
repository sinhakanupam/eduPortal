package com.edu.portal.models;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class SchoolInfo {


    private String countryOfInstitute;
    private String nameOfInstitute;
    private String levelOfEducation;
    private String primaryLangOfEducation;

    @DateTimeFormat(iso= DateTimeFormat.ISO.DATE_TIME)
    private java.util.Date courseStartDate;

    @DateTimeFormat(iso= DateTimeFormat.ISO.DATE_TIME)
    private java.util.Date courseEndDate;

    private String degreeName;

    private Boolean graduatedStatus;

    private Boolean physicalGradCert;

    private String schoolAddress;
    private String schoolCity;
    private String schoolState;
    private String schoolCityPin;

    public SchoolInfo(String countryOfInstitute, String nameOfInstitute, String levelOfEducation, String primaryLevelOfEducation, Date courseStartDate, Date courseEndDate, String degreeName, Boolean graduatedStatus, Boolean physicalGradCert, String schoolAddress, String schoolCity, String schoolState, String schoolCityPin) {
        this.countryOfInstitute = countryOfInstitute;
        this.nameOfInstitute = nameOfInstitute;
        this.levelOfEducation = levelOfEducation;
        this.primaryLangOfEducation = primaryLevelOfEducation;
        this.courseStartDate = courseStartDate;
        this.courseEndDate = courseEndDate;
        this.degreeName = degreeName;
        this.graduatedStatus = graduatedStatus;
        this.physicalGradCert = physicalGradCert;
        this.schoolAddress = schoolAddress;
        this.schoolCity = schoolCity;
        this.schoolState = schoolState;
        this.schoolCityPin = schoolCityPin;
    }

    public String getCountryOfInstitute() {
        return countryOfInstitute;
    }

    public void setCountryOfInstitute(String countryOfInstitute) {
        this.countryOfInstitute = countryOfInstitute;
    }

    public String getNameOfInstitute() {
        return nameOfInstitute;
    }

    public void setNameOfInstitute(String nameOfInstitute) {
        this.nameOfInstitute = nameOfInstitute;
    }

    public String getLevelOfEducation() {
        return levelOfEducation;
    }

    public void setLevelOfEducation(String levelOfEducation) {
        this.levelOfEducation = levelOfEducation;
    }

    public String getPrimaryLangOfEducation() {
        return primaryLangOfEducation;
    }

    public void setPrimaryLangOfEducation(String primaryLangOfEducation) {
        this.primaryLangOfEducation = primaryLangOfEducation;
    }

    public Date getCourseStartDate() {
        return courseStartDate;
    }

    public void setCourseStartDate(Date courseStartDate) {
        this.courseStartDate = courseStartDate;
    }

    public Date getCourseEndDate() {
        return courseEndDate;
    }

    public void setCourseEndDate(Date courseEndDate) {
        this.courseEndDate = courseEndDate;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    public Boolean getGraduatedStatus() {
        return graduatedStatus;
    }

    public void setGraduatedStatus(Boolean graduatedStatus) {
        this.graduatedStatus = graduatedStatus;
    }

    public Boolean getPhysicalGradCert() {
        return physicalGradCert;
    }

    public void setPhysicalGradCert(Boolean physicalGradCert) {
        this.physicalGradCert = physicalGradCert;
    }

    public String getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
    }

    public String getSchoolCity() {
        return schoolCity;
    }

    public void setSchoolCity(String schoolCity) {
        this.schoolCity = schoolCity;
    }

    public String getSchoolState() {
        return schoolState;
    }

    public void setSchoolState(String schoolState) {
        this.schoolState = schoolState;
    }

    public String getSchoolCityPin() {
        return schoolCityPin;
    }

    public void setSchoolCityPin(String schoolCityPin) {
        this.schoolCityPin = schoolCityPin;
    }
}

package com.edu.portal.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;
import java.util.List;

@Document(collection = "SchoolProgramsData")
public class SchoolProgramsData {

    @Id
    private ObjectId _id;


    private String ProgramName;

    private String ProgramDescription;
    private String ProgramLength;

    private String currency;

    private String applicationFees;
    private String tuitionFees;
    private String costOfLiving;

    private String programCampusCity;

    private String minimumQualificationDegree;

    private Integer minimumQualificationIndex;

    private List<HashMap<String, Integer>> minimumMarks;


    private HashMap<String, String> intakeProgramYears;


    public SchoolProgramsData(ObjectId _id, String programName, String programDescription, String programLength, String currency, String applicationFees, String tuitionFees, String costOfLiving, String programCampusCity, String minimumQualificationDegree, Integer minimumQualificationIndex, List<HashMap<String, Integer>> minimumMarks, HashMap<String, String> intakeProgramYears) {
        this._id = _id;
        ProgramName = programName;
        ProgramDescription = programDescription;
        ProgramLength = programLength;
        this.currency = currency;
        this.applicationFees = applicationFees;
        this.tuitionFees = tuitionFees;
        this.costOfLiving = costOfLiving;
        this.programCampusCity = programCampusCity;
        this.minimumQualificationDegree = minimumQualificationDegree;
        this.minimumQualificationIndex = minimumQualificationIndex;
        this.minimumMarks = minimumMarks;
        this.intakeProgramYears = intakeProgramYears;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getProgramName() {
        return ProgramName;
    }

    public void setProgramName(String programName) {
        ProgramName = programName;
    }

    public String getProgramDescription() {
        return ProgramDescription;
    }

    public void setProgramDescription(String programDescription) {
        ProgramDescription = programDescription;
    }

    public String getProgramLength() {
        return ProgramLength;
    }

    public void setProgramLength(String programLength) {
        ProgramLength = programLength;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getApplicationFees() {
        return applicationFees;
    }

    public void setApplicationFees(String applicationFees) {
        this.applicationFees = applicationFees;
    }

    public String getTuitionFees() {
        return tuitionFees;
    }

    public void setTuitionFees(String tuitionFees) {
        this.tuitionFees = tuitionFees;
    }

    public String getCostOfLiving() {
        return costOfLiving;
    }

    public void setCostOfLiving(String costOfLiving) {
        this.costOfLiving = costOfLiving;
    }

    public String getProgramCampusCity() {
        return programCampusCity;
    }

    public void setProgramCampusCity(String programCampusCity) {
        this.programCampusCity = programCampusCity;
    }

    public String getMinimumQualificationDegree() {
        return minimumQualificationDegree;
    }

    public void setMinimumQualificationDegree(String minimumQualificationDegree) {
        this.minimumQualificationDegree = minimumQualificationDegree;
    }

    public Integer getMinimumQualificationIndex() {
        return minimumQualificationIndex;
    }

    public void setMinimumQualificationIndex(Integer minimumQualificationIndex) {
        this.minimumQualificationIndex = minimumQualificationIndex;
    }

    public List<HashMap<String, Integer>> getMinimumMarks() {
        return minimumMarks;
    }

    public void setMinimumMarks(List<HashMap<String, Integer>> minimumMarks) {
        this.minimumMarks = minimumMarks;
    }

    public HashMap<String, String> getIntakeProgramYears() {
        return intakeProgramYears;
    }

    public void setIntakeProgramYears(HashMap<String, String> intakeProgramYears) {
        this.intakeProgramYears = intakeProgramYears;
    }
}

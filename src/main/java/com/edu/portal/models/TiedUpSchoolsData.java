package com.edu.portal.models;


import org.bson.types.Binary;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "TiedUpSchoolsData")
public class TiedUpSchoolsData {

    @Id
    private ObjectId _id;

    private String schoolName;
    private String schoolCountry;
    private String schoolCity;
    private String schoolType;

    private List<SchoolProgramsData> schoolProgramsDataList;

    private String schoolLogoPath;

    public TiedUpSchoolsData(ObjectId _id, String schoolName, String schoolCountry, String schoolCity, String schoolType, List<SchoolProgramsData> schoolProgramsDataList, String schoolLogoPath) {
        this._id = _id;
        this.schoolName = schoolName;
        this.schoolCountry = schoolCountry;
        this.schoolCity = schoolCity;
        this.schoolType = schoolType;
        this.schoolProgramsDataList = schoolProgramsDataList;
        this.schoolLogoPath = schoolLogoPath;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolCountry() {
        return schoolCountry;
    }

    public void setSchoolCountry(String schoolCountry) {
        this.schoolCountry = schoolCountry;
    }

    public String getSchoolCity() {
        return schoolCity;
    }

    public void setSchoolCity(String schoolCity) {
        this.schoolCity = schoolCity;
    }

    public String getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(String schoolType) {
        this.schoolType = schoolType;
    }

    public List<SchoolProgramsData> getSchoolProgramsDataList() {
        return schoolProgramsDataList;
    }

    public void setSchoolProgramsDataList(List<SchoolProgramsData> schoolProgramsDataList) {
        this.schoolProgramsDataList = schoolProgramsDataList;
    }

    public String getSchoolLogoPath() {
        return schoolLogoPath;
    }

    public void setSchoolLogoPath(String schoolLogoPath) {
        this.schoolLogoPath = schoolLogoPath;
    }
}

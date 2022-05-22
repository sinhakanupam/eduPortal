package com.edu.portal.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "StudentEducationData")
public class StudentEducationData {

    @Id
    private ObjectId _id;

    private String countryOfEducation;
    private String highestLevelOfEdu;
    private String gradingScheme;
    private String gradeAverage;

    private List<SchoolInfo> schoolList;

    //English Score
    private String englishExamType;
    private String englishDateExam;

    private Integer engReadScore;
    private Integer engListenScore;
    private Integer engWritingScore;
    private Integer engSpeakScore;


    //GRE Score

    private String greDateExam;

    private Integer greVerbalScore;
    private Integer grePercentVerbalScore;
    private Integer greQuantitativeScore;
    private Integer grePercentQuantitativeScore;
    private Integer greWritingScore;
    private Integer grePercentWritingScore;


    //GMAT Score

    private String gmatDateExam;

    private Integer gmatVerbalScore;
    private Integer percentGmatVerbalScore;
    private Integer gmatQuantitativeScore;
    private Integer percentGmatQuantitativeScore;
    private Integer gmatWritingScore;
    private Integer percentGmatWritingScore;
    private Integer gmatTotalScore;
    private Integer getPercentGmatTotalScore;


    //visa Status
    private Boolean visaRefusalState;
    private String visaType;
    private String visaDetail;

    //StudentDocument
    private String bucketName;

    //highestQualificationIndex

    private Integer qualificationIndex;

    public StudentEducationData(ObjectId _id, String countryOfEducation, String highestLevelOfEdu, String gradingScheme, String gradeAverage, List<SchoolInfo> schoolList, String englishExamType, String englishDateExam, Integer engReadScore, Integer engListenScore, Integer engWritingScore, Integer engSpeakScore, String greDateExam, Integer greVerbalScore, Integer grePercentVerbalScore, Integer greQuantitativeScore, Integer grePercentQuantitativeScore, Integer greWritingScore, Integer grePercentWritingScore, String gmatDateExam, Integer gmatVerbalScore, Integer percentGmatVerbalScore, Integer gmatQuantitativeScore, Integer percentGmatQuantitativeScore, Integer gmatWritingScore, Integer percentGmatWritingScore, Integer gmatTotalScore, Integer getPercentGmatTotalScore, Boolean visaRefusalState, String visaType, String visaDetail, String bucketName, Integer qualificationIndex) {
        this._id = _id;
        this.countryOfEducation = countryOfEducation;
        this.highestLevelOfEdu = highestLevelOfEdu;
        this.gradingScheme = gradingScheme;
        this.gradeAverage = gradeAverage;
        this.schoolList = schoolList;
        this.englishExamType = englishExamType;
        this.englishDateExam = englishDateExam;
        this.engReadScore = engReadScore;
        this.engListenScore = engListenScore;
        this.engWritingScore = engWritingScore;
        this.engSpeakScore = engSpeakScore;
        this.greDateExam = greDateExam;
        this.greVerbalScore = greVerbalScore;
        this.grePercentVerbalScore = grePercentVerbalScore;
        this.greQuantitativeScore = greQuantitativeScore;
        this.grePercentQuantitativeScore = grePercentQuantitativeScore;
        this.greWritingScore = greWritingScore;
        this.grePercentWritingScore = grePercentWritingScore;
        this.gmatDateExam = gmatDateExam;
        this.gmatVerbalScore = gmatVerbalScore;
        this.percentGmatVerbalScore = percentGmatVerbalScore;
        this.gmatQuantitativeScore = gmatQuantitativeScore;
        this.percentGmatQuantitativeScore = percentGmatQuantitativeScore;
        this.gmatWritingScore = gmatWritingScore;
        this.percentGmatWritingScore = percentGmatWritingScore;
        this.gmatTotalScore = gmatTotalScore;
        this.getPercentGmatTotalScore = getPercentGmatTotalScore;
        this.visaRefusalState = visaRefusalState;
        this.visaType = visaType;
        this.visaDetail = visaDetail;
        this.bucketName = bucketName;
        this.qualificationIndex=qualificationIndex;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getCountryOfEducation() {
        return countryOfEducation;
    }

    public void setCountryOfEducation(String countryOfEducation) {
        this.countryOfEducation = countryOfEducation;
    }

    public String getHighestLevelOfEdu() {
        return highestLevelOfEdu;
    }

    public void setHighestLevelOfEdu(String highestLevelOfEdu) {
        this.highestLevelOfEdu = highestLevelOfEdu;
    }

    public String getGradingScheme() {
        return gradingScheme;
    }

    public void setGradingScheme(String gradingScheme) {
        this.gradingScheme = gradingScheme;
    }

    public String getGradeAverage() {
        return gradeAverage;
    }

    public void setGradeAverage(String gradeAverage) {
        this.gradeAverage = gradeAverage;
    }

    public List<SchoolInfo> getSchoolList() {
        return schoolList;
    }

    public void setSchoolList(List<SchoolInfo> schoolList) {
        this.schoolList = schoolList;
    }

    public String getEnglishExamType() {
        return englishExamType;
    }

    public void setEnglishExamType(String englishExamType) {
        this.englishExamType = englishExamType;
    }

    public String getEnglishDateExam() {
        return englishDateExam;
    }

    public void setEnglishDateExam(String englishDateExam) {
        this.englishDateExam = englishDateExam;
    }

    public Integer getEngReadScore() {
        return engReadScore;
    }

    public void setEngReadScore(Integer engReadScore) {
        this.engReadScore = engReadScore;
    }

    public Integer getEngListenScore() {
        return engListenScore;
    }

    public void setEngListenScore(Integer engListenScore) {
        this.engListenScore = engListenScore;
    }

    public Integer getEngWritingScore() {
        return engWritingScore;
    }

    public void setEngWritingScore(Integer engWritingScore) {
        this.engWritingScore = engWritingScore;
    }

    public Integer getEngSpeakScore() {
        return engSpeakScore;
    }

    public void setEngSpeakScore(Integer engSpeakScore) {
        this.engSpeakScore = engSpeakScore;
    }

    public String getGreDateExam() {
        return greDateExam;
    }

    public void setGreDateExam(String greDateExam) {
        this.greDateExam = greDateExam;
    }

    public Integer getGreVerbalScore() {
        return greVerbalScore;
    }

    public void setGreVerbalScore(Integer greVerbalScore) {
        this.greVerbalScore = greVerbalScore;
    }

    public Integer getGrePercentVerbalScore() {
        return grePercentVerbalScore;
    }

    public void setGrePercentVerbalScore(Integer grePercentVerbalScore) {
        this.grePercentVerbalScore = grePercentVerbalScore;
    }

    public Integer getGreQuantitativeScore() {
        return greQuantitativeScore;
    }

    public void setGreQuantitativeScore(Integer greQuantitativeScore) {
        this.greQuantitativeScore = greQuantitativeScore;
    }

    public Integer getGrePercentQuantitativeScore() {
        return grePercentQuantitativeScore;
    }

    public void setGrePercentQuantitativeScore(Integer grePercentQuantitativeScore) {
        this.grePercentQuantitativeScore = grePercentQuantitativeScore;
    }

    public Integer getGreWritingScore() {
        return greWritingScore;
    }

    public void setGreWritingScore(Integer greWritingScore) {
        this.greWritingScore = greWritingScore;
    }

    public Integer getGrePercentWritingScore() {
        return grePercentWritingScore;
    }

    public void setGrePercentWritingScore(Integer grePercentWritingScore) {
        this.grePercentWritingScore = grePercentWritingScore;
    }

    public String getGmatDateExam() {
        return gmatDateExam;
    }

    public void setGmatDateExam(String gmatDateExam) {
        this.gmatDateExam = gmatDateExam;
    }

    public Integer getGmatVerbalScore() {
        return gmatVerbalScore;
    }

    public void setGmatVerbalScore(Integer gmatVerbalScore) {
        this.gmatVerbalScore = gmatVerbalScore;
    }

    public Integer getPercentGmatVerbalScore() {
        return percentGmatVerbalScore;
    }

    public void setPercentGmatVerbalScore(Integer percentGmatVerbalScore) {
        this.percentGmatVerbalScore = percentGmatVerbalScore;
    }

    public Integer getGmatQuantitativeScore() {
        return gmatQuantitativeScore;
    }

    public void setGmatQuantitativeScore(Integer gmatQuantitativeScore) {
        this.gmatQuantitativeScore = gmatQuantitativeScore;
    }

    public Integer getPercentGmatQuantitativeScore() {
        return percentGmatQuantitativeScore;
    }

    public void setPercentGmatQuantitativeScore(Integer percentGmatQuantitativeScore) {
        this.percentGmatQuantitativeScore = percentGmatQuantitativeScore;
    }

    public Integer getGmatWritingScore() {
        return gmatWritingScore;
    }

    public void setGmatWritingScore(Integer gmatWritingScore) {
        this.gmatWritingScore = gmatWritingScore;
    }

    public Integer getPercentGmatWritingScore() {
        return percentGmatWritingScore;
    }

    public void setPercentGmatWritingScore(Integer percentGmatWritingScore) {
        this.percentGmatWritingScore = percentGmatWritingScore;
    }

    public Integer getGmatTotalScore() {
        return gmatTotalScore;
    }

    public void setGmatTotalScore(Integer gmatTotalScore) {
        this.gmatTotalScore = gmatTotalScore;
    }

    public Integer getGetPercentGmatTotalScore() {
        return getPercentGmatTotalScore;
    }

    public void setGetPercentGmatTotalScore(Integer getPercentGmatTotalScore) {
        this.getPercentGmatTotalScore = getPercentGmatTotalScore;
    }

    public Boolean getVisaRefusalState() {
        return visaRefusalState;
    }

    public void setVisaRefusalState(Boolean visaRefusalState) {
        this.visaRefusalState = visaRefusalState;
    }

    public String getVisaType() {
        return visaType;
    }

    public void setVisaType(String visaType) {
        this.visaType = visaType;
    }

    public String getVisaDetail() {
        return visaDetail;
    }

    public void setVisaDetail(String visaDetail) {
        this.visaDetail = visaDetail;
    }

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public Integer getQualificationIndex() {
        return qualificationIndex;
    }

    public void setQualificationIndex(Integer qualificationIndex) {
        this.qualificationIndex = qualificationIndex;
    }
}

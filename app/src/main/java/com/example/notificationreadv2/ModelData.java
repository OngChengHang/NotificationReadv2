package com.example.notificationreadv2;

public class ModelData {
    private String UserID;
    private String competitionResult;
    private String competitionDesc;

    public ModelData(String UserID, String competitionResult, String competitionDesc) {
        this.UserID = UserID;
        this.competitionResult = competitionResult;
        this.competitionDesc = competitionDesc;
    }

    public String getUSERID() {
        return UserID;
    }

    public void setUSERID(String UserID) {
        this.UserID = UserID;
    }

    public String getCompetitionResult() {
        return competitionResult;
    }

    public void setCompetitionResult(String competitionResult) {
        this.competitionResult = competitionResult;
    }

    public String getCompetitionDesc() {
        return competitionDesc;
    }

    public void setCompetitionDesc(String competitionDesc) {
        this.competitionDesc = competitionDesc;
    }
}

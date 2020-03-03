package com.zhh.v1;

/**
 * @author zhh
 * @description 事假请求实体类
 * @date 2020-03-03 14:50
 */
public class PersonalLeaveRequest {

    /**
     * 申请人
     */
    private String applicant;

    /**
     * 天数
     */
    private Integer days;

    /**
     * 开始时间
     */
    private String startTime;

    /**
     * 理由
     */
    private String reason;

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * 天数常量
     */
    public interface Days {
        Integer ONE = 1;
        Integer SEVEN = 7;
    }
}

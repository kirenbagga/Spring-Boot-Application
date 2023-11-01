package com.garedesystems.grade;

public class Grade {
    private String studentName;
    private String subject;
    private double mark;

    public Grade(String studentName, String subject, double mark) {
        this.studentName = studentName;
        this.subject = subject;
        this.mark = mark;
    }
    public Grade(Grade source){
              this.studentName = source.studentName;
        this.subject = source.subject;
        this.mark = source.mark;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getMark() {
        return this.mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }




    
}

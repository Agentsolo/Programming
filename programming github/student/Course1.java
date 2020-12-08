/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author George Athanasatos
 */
public class Course1 {
   // data members
   private String courseName ;
   private double credit ;
   private double examScore ;
   private double assignmentScore ;
   // default constructor
   public Course1() {
       this.courseName = null ;
       this.credit = 0 ;
       this.examScore = 0 ;
       this.assignmentScore = 0 ;
   }
   public Course1(String courseName, double credit) {
      
       this.courseName = courseName;
       this.credit = credit;
       this.examScore = 0 ;
       this.assignmentScore = 0 ;
      
   }
   // constructor with all the data members
   public Course1(String courseName, double credit, double examScore, double assignmentScore) {
      
       this.courseName = courseName;
       this.credit = credit;
       this.examScore = examScore;
       this.assignmentScore = assignmentScore;
   }
   // copy constructor
   public Course1(Course c) {
       this.courseName = c.courseName;
       this.credit = c.credit;
       this.examScore = c.examScore;
       this.assignmentScore = c.assignmentScore;
   }
   public String getCourseName() {
       return courseName;
   }
   public void setCourseName(String courseName) {
       this.courseName = courseName;
   }
   public double getCredit() {
       return credit;
   }
   public void setCredit(double credit) {
       this.credit = credit;
   }
   public double getExamScore() {
       return examScore;
   }
   public void setExamScore(double examScore) {
       this.examScore = examScore;
   }
   public double getAssignmentScore() {
       return assignmentScore;
   }
   public void setAssignmentScore(double assignmentScore) {
       this.assignmentScore = assignmentScore;
   }
   public Object clone() {
       return this.clone() ;
   }
  
   public boolean equals(Object obj) {
       if (this == obj)
           return true;
       if (obj == null)
           return false;
       if (getClass() != obj.getClass())
           return false;
       Course other = (Course) obj;
       if (Double.doubleToLongBits(assignmentScore) != Double.doubleToLongBits(other.assignmentScore))
           return false;
       if (courseName == null) {
           if (other.courseName != null)
               return false;
       } else if (!courseName.equals(other.courseName))
           return false;
       if (Double.doubleToLongBits(credit) != Double.doubleToLongBits(other.credit))
           return false;
       if (Double.doubleToLongBits(examScore) != Double.doubleToLongBits(other.examScore))
           return false;
       return true;
   }
   public double calcFinalScore() {
       double finalScore = this.examScore * 0.6 + this.assignmentScore * 0.4 ;
       return finalScore ;
   }
   public boolean isPassed() {
       return this.calcFinalScore() >= 60 ;
   }
   public String toString() {
       return "Course1 Name\t : " + this.courseName + "\nCredit\t : " + this.credit + "\nExam Score\t: " + this.examScore + "\nAssignment Score\t: " + this.assignmentScore + "\nFinal Score\t: " + this.calcFinalScore();
   }
}
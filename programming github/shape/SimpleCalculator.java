/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author George Athanasatos
 */
public class SimpleCalculator {
    public static void pmain(String[] args) {
      
    //creating scanner object to get user input
    Scanner sc1=new Scanner(System.in);
    Scanner sc2=new Scanner(System.in);
    //asking the user to enter data
    System.out.print("Please enter two numbers, seprated by space: ");
    double num1=sc1.nextDouble();
    double num2=sc1.nextDouble();
    System.out.print("Please enter the operator (+, -, *, or /): ");
    String op=sc2.nextLine();
    System.out.print("Please enter a formular, e.g.: \"3.14 * 2\": ");
    String formula=sc2.nextLine();
    //using all three method
    double result1=caclResult(num1,num2);
    double result2=caclResult(num1,num2,op.charAt(0));
    double result3=caclResult(formula);
    System.out.println();
    //split formula based on operator
    String []data=formula.split("(?<=[-+*/])|(?=[-+*/])");
    //displaying result
    System.out.printf("Calling the first method : %2.2f + %2.2f = %2.2f\n",num1,num2,result1);
    System.out.printf("Calling the second method : %2.2f %s %2.2f = %2.2f\n",num1,op,num2,result2);
    System.out.printf("Calling the third method : %s %s %s = %2.2f\n",data[0],data[1],data[2],result3);
   }
   //method to add two numbers
   public static double caclResult(double num1,double num2) {
       return num1+num2;
   }
   //method to perform operation on number based on operator
   public static double caclResult(double num1,double num2,char oper) {
    //checking operator
       if(oper=='+')
           return num1+num2;
       if(oper=='-')
           return num1-num2;
       if(oper=='*')
           return num1*num2;
       else
           return num1/num2;
   }
   //method to parse string and perform operation
   public static double caclResult(String formula) {
    //removing space from string
    String clearFormula=formula.replaceAll("\\s","");
    //split formula based on operator
    String []data=clearFormula.split("(?<=[-+*/])|(?=[-+*/])");
    //finding operands and operator
    double num1=Double.parseDouble(data[0]);
    char op=data[1].charAt(0);
    double num2=Double.parseDouble(data[2]);
    //calling method 2
    double result=caclResult(num1,num2,op);
    //return result
    return result;}}
   


    
    
    
    
    
    
    
    
   
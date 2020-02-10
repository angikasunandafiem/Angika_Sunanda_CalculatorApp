package CalculatorApplication;


import java.util.*;

public class Calculator {
	
    public double addition(double x,double y)
    {
        double add = x+y;
        return add;
    }
    public double substraction(double x,double y)
    {
        double sub = x-y; 
        return sub;
    }
    public double multiplication(double x,double y)
    {
        double mul = x*y;
        return mul;
    }
    public double division(double x,double y)
    {
        double div = x/y;
        return div;
    }
    public static void main(String args[])
    {
        System.out.println("Welcome to our Calculator ");
        char ch;
        Calculator obj = new Calculator();
        do
        {
            Scanner sc = new Scanner(System.in);
            System.out.println(" Enter the First Operand : ");
            double op1 = sc.nextDouble();
            System.out.println(" Enter the Second Operand : ");
            double op2 = sc.nextDouble();
            System.out.println(" Enter the Operator : + , - , * , / ");
            char c = sc.next().charAt(0);
            if(c=='+')
            {
                double a=obj.addition(op1,op2);
                System.out.println("Your Result is  :  " + a);
            }
            else if (c=='-')
            {
                double s=obj.substraction(op1,op2);
                System.out.println("Your Result is :  " + s);
            }
            else if (c=='*')
            {
                double m=obj.multiplication(op1,op2);
                System.out.println("Your Result is :  " + m);
            }
            else if (c=='/')
            {
                double d=obj.division(op1,op2);
                System.out.println("Your Result is :  " + d);
            }
            else
            {
                System.out.println("Sorry your input is invalid ");
            }
            System.out.println("Press Y/y to continue using calculator else enter any key : Thank You :) ");
            ch = sc.next().charAt(0);
        }while(ch=='Y'||ch=='y');
    }

}

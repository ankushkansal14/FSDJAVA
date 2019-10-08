package com.cg.eis.exception;

import java.io.IOException;

class SalaryException extends Exception
{
    public SalaryException(String s)
    {
        
        super(s);
    }
}
 
  public class EmployeeException
{
   void salaryCheck(int salary) throws SalaryException{
	if(salary < 3000){
		throw new SalaryException(" Invalid");
	}
    else 
    {
        System.out.println("Valid");
    }
   }
   
    public static void main(String args[])
    {
    	EmployeeException obj = new EmployeeException();
        try
        {
            obj.salaryCheck(25000);
        }
        catch (SalaryException ex)
        {
            System.out.println("Caught the exception");
            System.out.println(ex.getMessage());
        }
    }
}
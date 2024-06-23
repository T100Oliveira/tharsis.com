package project;

import java.util.Scanner;

public class impostometro {
public static void main(String[]args) {
	
	Scanner input = new Scanner(System.in);
	
    System.out.println("digite seu salario");
    float salario = input.nextFloat();
    
    if(salario>2112.00f && salario<2826.665f)	{
	  System.out.println("o deconto sera de "+ (salario/100*7.5));
  }
    if(salario>2826.66 && salario<3751.05) {
    		System.out.println("o desconto sera de "+(salario/100*15));
    }
    if(salario>3751.06 && salario<4664.68) {
		System.out.println("o desconto sera de "+(salario/100*17.5));
    }	
    if(salario>3751.06 && salario<4664.68) {
  		System.out.println("o desconto sera de "+(salario/100*22.5));
      }	
    if(salario>4664.68) {
  		System.out.println("o desconto sera de "+(salario/100*27.5));
      }	
  		
		
		
		
		
}}
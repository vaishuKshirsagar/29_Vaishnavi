package javaproject;

import javaproject.Static;

public class Test1 {
	
      static int class = 2;
      static Float char  = 4.5;
      Static String var = "Hey";
      static Char int = 56; //Syntax error on token "int", invalid VariableDeclaratorId
  	public static void main(String[] args) {
		
        System.out.println(class); //Syntax error on token "class", invalid Expression
        System.out.println(char); //Syntax error, insert ". class" to complete Expression
        System.out.println(var);
        System.out.println(int); //Syntax error, insert ". class" to complete Expression
        
        }

}

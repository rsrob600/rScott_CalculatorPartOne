package com.codingdojo.calculatorpartone;

public class CalculatorTest {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		System.out.println("--------------------Addition Result: 15.7--------------------");
		calc.setOperandOne(10.5);
		calc.setOperation("+");
		calc.setOperandTwo(5.2);
		calc.performOperation();
		calc.getResults();
		
		System.out.println("--------------------Subtraction Result: 5.3--------------------");
		calc.setOperandOne(10.5);
		calc.setOperation("-");
		calc.setOperandTwo(5.2);
		calc.performOperation();
		calc.getResults();
		
		System.out.println("--------------------Operator of '*' Result: Error--------------------");
		calc.setOperandOne(10.5);
		calc.setOperation("*");
		calc.setOperandTwo(55.2);
		calc.performOperation();
		calc.getResults();

	}

}

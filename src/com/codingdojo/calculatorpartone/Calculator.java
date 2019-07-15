package com.codingdojo.calculatorpartone;

// Java Bean Setup with private member variables, zero arg constructor and serializable interface
public class Calculator implements java.io.Serializable {
	
	// member instance variables
	private Double operandOne;
	private String operation;
	private Double operandTwo;
	private Double results;
	private Boolean isValid;
	
	// default no arg constructor
	public Calculator() {
	}
	
	// constructor class to set the operand-1, operator, operand-2
	public Calculator(Double operandOne, String operation, Double operandTwo) {
		
		setOperandOne(operandOne);
		setOperation(operation);
		setOperandTwo(operandTwo);
		
	}
	
	// ------------------------------Getters and Setters--------------------------------->
	
	
	// ------------OperandOne Getters & Setters-------------->>
	// OperandOne Getter
	public Double getOperandOne() {
		return operandOne;
	}
	
	// OperandOne Setter
	public void setOperandOne(Double operandOne) {
		this.operandOne = operandOne;
	}


	// ------------OperandTwo Getters & Setters-------------->>
	// OperandTwo Getter
	public Double getOperandTwo() {
		return operandTwo;
	}
	
	// OperandTwo Setter
	public void setOperandTwo(Double operandTwo) {
		this.operandTwo = operandTwo;
	}


	// ------------Operation Getters & Setters-------------->>
	// They only need adding "+" and subtracting "-" functionality right now. 
	
	// Operation Getter
	public String getOperation() {
		return operation;
	}
	
	
	// Operation Setter
	public void setOperation(String operation) {
		
		
		if(operation == "+" || operation == "-") {
			this.operation = operation;
			this.isValid = true;
		}
		else {
			this.isValid = false;
			System.out.println("Error: Please enter either '+' or '-' as your operation");
		}
		
	}


	// ------------Results Getters & Setters-------------->>
	// Get Results
	public void getResults() {
		System.out.println(this.results);
		setResults();
	}
	
	// Set Results
	public void setResults() {
		this.results = 0.00;
	}
	
	
	// ------------------------------Operational Methods--------------------------------->
	
	// Perform Operation
	public void performOperation() {
		
		if(this.isValid == true) {
			if(getOperation() == "+") {
				this.results = getOperandOne() + getOperandTwo();
			}
			else if(getOperation() == "-") {
				this.results = getOperandOne() - getOperandTwo();
			}
		}
		else if(this.isValid == false) {
			System.err.println("System Error: ");
		}
	
		
	}

	

	
}

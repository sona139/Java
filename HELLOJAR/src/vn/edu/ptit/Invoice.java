package vn.edu.ptit;

import java.util.ArrayList;

public class Invoice {
	private int id;
	private Rule rule;
	private Student st;
	private ArrayList<Subject> alSubject;
	private double amount;

	public Invoice(Rule rule) {
		this.rule = rule;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Rule getRule() {
		return this.rule;
	}

	public void setRule(Rule rule) {
		this.rule = rule;
	}

	public Student getSt() {
		return this.st;
	}

	public void setSt(Student st) {
		this.st = st;
	}

	public ArrayList<Subject> getAlSubject() {
		return this.alSubject;
	}

	public void setAlSubject(ArrayList<Subject> alSubject) {
		this.alSubject = alSubject;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
}

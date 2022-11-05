package vn.edu.ptit;

public class Subject {
	private String name;
	private String code;
	private int credit;

	public Subject() {
	}

	public Subject(String name, String code, int credit) {
		this.name = name;
		this.code = code;
		this.credit = credit;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getCredit() {
		return this.credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public String toString() {
		return "Subject{name=" + this.name + ", code=" + this.code + ", credit=" + this.credit + '}';
	}
}
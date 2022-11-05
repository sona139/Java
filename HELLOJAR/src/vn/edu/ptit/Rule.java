package vn.edu.ptit;

public class Rule {
	private String code;
	private String name;
	private double creditPrice;

	public Rule(String code, String name, double creditPrice) {
		this.code = code;
		this.name = name;
		this.creditPrice = creditPrice;
	}

	public Rule() {
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCreditPrice() {
		return this.creditPrice;
	}

	public void setCreditPrice(double creditPrice) {
		this.creditPrice = creditPrice;
	}
}
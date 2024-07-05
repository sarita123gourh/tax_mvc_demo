package com.db.model;

public class TaxModel
{
      private int income;
      private int age;
      private int tax;
      private int rebate;
      private int netTax;
      
      
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	public int getRebate() {
		return rebate;
	}
	public void setRebate(int rebate) {
		this.rebate = rebate;
	}
	public int getNetTax() {
		return netTax;
	}
	public void setNetTax(int netTax) {
		this.netTax = netTax;
	}
	@Override
	public String toString() {
		return "TaxModel [income=" + income + ", age=" + age + ", tax=" + tax + ", rebate=" + rebate + ", netTax="
				+ netTax + "]";
	}
      
      
      
}

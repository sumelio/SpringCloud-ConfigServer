package com.assesoftware.spring.cloud.limitsservice.bean;


public class LimitConfiguration {
	private int minimum;
	 private int maximum;

	protected LimitConfiguration(){
		
	}
	
	 public LimitConfiguration(int minimo, int maximo) {
		super();
		this.minimum = minimo;


		this.maximum = maximo;  
	}

	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimo) {
		this.minimum = minimo;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximo) {
		this.maximum = maximo;
	}
		 
}

package com.naren;

public final class MathOperation {

	private String a;
	private String b;
	
	

	MathOperation(String a, String b) {
		this.a = a;
		this.b = b;
	}

	public String geta() {
		return a;
	}

	public String getb() {
		return b;
	}


	public String summary() {
		return a + b;
	}
}
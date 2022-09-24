package com.objects;

public class CostCenter {
	String cc_code;
	String cc_description;
	String cc_owner;

	public CostCenter(String cc_code, String cc_description, String cc_owner) {

		this.cc_code = cc_code;
		this.cc_description = cc_description;
		this.cc_owner = cc_owner;

	}

	public String getCc_code() {
		return cc_code;
	}

	public String getCc_description() {
		return cc_description;
	}

	public String getCc_owner() {
		return cc_owner;
	}

	public String toString() {
		return "[" + this.getCc_code() + "=>" + this.getCc_description() + "=>" + this.getCc_owner() + "]";
	}
}

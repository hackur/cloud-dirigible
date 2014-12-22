package com.sap.dirigible.runtime.flow;


public class FlowStep extends FlowBase {
	
	private String type;
	
	private String module;
	
	private FlowCase[] cases;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public FlowCase[] getCases() {
		return cases;
	}
	
	public void setCases(FlowCase[] cases) {
		this.cases = cases;
	}
}

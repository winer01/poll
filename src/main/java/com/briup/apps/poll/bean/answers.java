package com.briup.apps.poll.bean;

public class answers {
	private Long id;
	private String selections;
	private String checks;
	private String content;
	private Long survey_id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSelections() {
		return selections;
	}
	public void setSelections(String selections) {
		this.selections = selections;
	}
	public String getChecks() {
		return checks;
	}
	public void setChecks(String checks) {
		this.checks = checks;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Long getSurvey_id() {
		return survey_id;
	}
	public void setSurvey_id(Long survey_id) {
		this.survey_id = survey_id;
	}

}

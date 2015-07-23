package com.src.html.validator.seo;

public class ValidationResult {

	private TagEnum tag;
	private int score;
	
	
	public ValidationResult(TagEnum tag, int score) {
		super();
		this.tag = tag;
		this.score = score;
	}
	public TagEnum getTag() {
		return tag;
	}
	public void setTag(TagEnum tag) {
		this.tag = tag;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "ValidationResult [tag=" + tag + ", score=" + score + "]";
	}
	
	
}

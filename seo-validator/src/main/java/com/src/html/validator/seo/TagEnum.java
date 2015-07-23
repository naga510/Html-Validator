package com.src.html.validator.seo;

public enum TagEnum {

	TITLE(1,"title", "Include <title> tag element"),
	METADESC(2, "meta", " Include meta description tag");
	
	private String tag;
	private int id;
	private String message;
	private TagEnum(int id,String tag, String message) {
		this.id=id;		
		this.tag=tag;
		this.message=message;
	}

	public String getTag() {
		return tag;
	}	
	
	public int getId() {
		return id;
	}
	public String getMessage() {
		return message;
	}

	public static TagEnum fromId(int id) {
	      for (TagEnum b : TagEnum.values()) {
	        if (id==b.id) {
	          return b;
	        }
	      }	    
	    return null;
	  }
	
	@Override
	public String toString() {		
		return getTag();
	}	
}

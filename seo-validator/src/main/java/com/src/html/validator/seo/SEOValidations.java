package com.src.html.validator.seo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class SEOValidations implements Validations{

	@Override
	public List<ValidationResult> validate(String url) {
		try {
		final Document document=Jsoup.connect("http://www.w3schools.com/tags/tag_meta.asp").get();		
		final List<ValidationResult> results=new ArrayList();
		results.add(validateTitle(document));
		System.out.println(results);
		return results;
		}
		catch(Exception ex) {
			return Collections.emptyList();
		}
	}

	private ValidationResult validateTitle(final Document document) {
		Elements elements=document.getElementsByTag(TagEnum.TITLE.getTag());
		if(elements==null||elements.text()==null||elements.text().isEmpty()) {
    		return new ValidationResult(TagEnum.TITLE, 0);
    	}
		return new ValidationResult(TagEnum.TITLE, 100);
		
	}


}

package com.src.html.validator.seo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Test {

	 private static ExecutorService executor = Executors.newFixedThreadPool(3);
	public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
		
		  
		
		  final List<String> urls=new ArrayList<String>();
		  urls.add("http://www.w3schools.com/tags/tag_meta.asp");
		  urls.add("http://stackoverflow.com/questions/29432354/how-to-open-wildfly-8-2-jmx-port-for-monitoring");
		  urls.add("http://stackoverflow.com/questions/29432354/how-to-open-wildfly-8-2-jmx-port-for-monitoring");
		  urls.add("http://stackoverflow.com/questions/29432354/how-to-open-wildfly-8-2-jmx-port-for-monitoring");
		  urls.add("http://stackoverflow.com/questions/29432354/how-to-open-wildfly-8-2-jmx-port-for-monitoring");
		final Validations validations=new SEOValidations();
		final String id=UUID.randomUUID().toString();
		for(final String url: urls) {
			executor.submit(new Callable<Void>() {

				@Override
				public Void call() throws Exception {
					 validations.validate(url);
					return null;				
				}
			});			
		}				
		executor.shutdown();
		System.out.println("reference Id is:"+id);
	}
	
	
}

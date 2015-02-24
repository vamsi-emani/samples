package com.imaginea.apps;

/**
 * @author vamsi emani
 * 
 * Mail seed object represents the mail link on the maven page 
 * that is to be extracted and downloaded.
 */

public class MailSeed {
	
	String id, urlSuffix;
	
	public MailSeed(String id, String urlSuffix){
		this.id = id;
		this.urlSuffix = urlSuffix;
	}
	
	public String getId(){
		return id;
	}
	
	public String getDownloadUrl(){
		return StringConstants.BASEURL + urlSuffix + "/raw/"+id;	
	}
	
	public String getUrlSuffix(){
		return urlSuffix;
	}
	
	@Override
	public String toString() {	
		if(this.id != null && this.urlSuffix != null)
			return getDownloadUrl();
		return super.toString();
	}
}

package com.furkankara;

import java.util.*;

public class Ogrenci {

	List<?> ogrencilist;
	Set<?> ogrenciSet;
	Map<?,?> ogrenciMap;
	Properties	ogrenciProperties;
	
	//----------------------------------------------
	
	public List<?> getOgrenclist() {
		System.out.println("List elemanlari :" + ogrencilist);
		return ogrencilist;
	}
	public void setOgrenclist(List<?> ogrenclist) {
		this.ogrencilist = ogrenclist;
	}
	
	//----------------------------------------------
	
	public Set<?> getOgrenciSet() {
		System.out.println("Set elemanlari :"+ogrenciSet);
		return ogrenciSet;
	}
	public void setOgrenciSet(Set<?> ogrenciSet) {
		this.ogrenciSet = ogrenciSet;
	}
	
	//----------------------------------------------
	
	public Map<?, ?> getOgrenciMap() {
		System.out.println("Map elemanlari :"+ogrenciMap);
		return ogrenciMap;
	}
	public void setOgrenciMap(Map<?, ?> ogrenciMap) {
		this.ogrenciMap = ogrenciMap;
	}
	
	//----------------------------------------------
	
	public Properties getOgrenciProperties() {
		System.out.println("Properties elemanlari :"+ ogrenciProperties);
		return ogrenciProperties;
	}
	public void setOgrenciProperties(Properties ogrenciProperties) {
		this.ogrenciProperties = ogrenciProperties;
	}
	
}

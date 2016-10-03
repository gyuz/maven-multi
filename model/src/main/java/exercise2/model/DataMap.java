package exercise2.model;

import java.util.*;

public class DataMap{
	private static LinkedHashMap<String,String> dataMap;
	private static LinkedHashMap<String, String> tableFormatMap;
	private static LinkedHashMap<String, String> originalDataMap;	
	private static LinkedHashMap<String, String> originalFormatMap;

	public DataMap(){
		 dataMap = new LinkedHashMap<String,String>();
		 tableFormatMap = new LinkedHashMap<String,String>();
		 originalDataMap = new LinkedHashMap<String,String>();
		 originalFormatMap = new LinkedHashMap<String,String>();
	}
	
	public void setDataMap(Map<String,String> newMap){
		dataMap.clear();			
		dataMap.putAll(newMap);
	}

	public void setTableFormatMap(Map<String,String> newMap){
		tableFormatMap.clear();
		tableFormatMap.putAll(newMap);
	}

	public void setOriginalDataMap(Map<String,String> newMap){
		originalDataMap.clear();
		originalDataMap.putAll(newMap);
	}

	public void setOriginalFormatMap(Map<String,String> newMap){
		originalFormatMap.clear();
		originalFormatMap.putAll(newMap);
	}

	public LinkedHashMap<String,String> getDataMap(){
		return dataMap;
	}

	public LinkedHashMap<String,String> getTableFormatMap(){
		return tableFormatMap;
	}

	public LinkedHashMap<String,String> getOriginalDataMap(){
		return originalDataMap;
	}

	public LinkedHashMap<String,String> getOriginalFormatMap(){
		return originalFormatMap;
	}

	public void addDataMap(String key, String value){
		dataMap.put(key, value);	
	}
	
	public void addTableFormat(String key, String value){
		tableFormatMap.put(key, value);	
	}

	public void removeDataMap(String key){
		dataMap.remove(key);	
	}

	public void editDataMapValue(String index, String newValue){
		dataMap.put(tableFormatMap.get(index), newValue);	
	}

	public void editFormatValue(String key, String value){
		tableFormatMap.put(key, value);	
	}
	
}


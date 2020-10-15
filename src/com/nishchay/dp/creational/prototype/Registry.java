package com.nishchay.dp.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

	private Map<String, Item> items = new HashMap<>();
	
	public Registry(){
		loadItems();
	}
	
	private void loadItems(){
		
		Movie m = new Movie();
		m.setTitle("Basic Movie");
		m.setPrice(500.00);
		m.setUrl("abc");
		m.setDuration("2 - 3.30Hr");
		items.put("movie", m);
		
		Book b = new Book();
		b.setTitle("Basic Book");
		b.setPrice(1000.00);
		b.setUrl(null);
		b.setNoOfPage("500 - 1000 Pages ");
		items.put("book", b);
	}
	
	
	public void showData(){
		System.out.println( items);
	}
	
	public Item createItem(String type){
		Item newItem=null, oldItem;
		oldItem =  items.get(type);
		
		try {
			newItem = (Item) oldItem.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return newItem;
	}
}

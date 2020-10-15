package com.nishchay.dp.creational.prototype;

public class Book extends Item {

	private String noOfPage;

	public void setNoOfPage(String noOfPage) {
		this.noOfPage = noOfPage;
	}

	@Override
	public String toString() {
		return "Book{"  + super.toString() +
				", noOfPage='" + noOfPage + '\'' +
				'}';
	}

}

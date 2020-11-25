package com.xworkz.oops;

public class Novel {
	String name;
	String AuthorName;
	String jauner;
	int price;
	int noOfchapters;
	String bindingType;
	String Publisher;
	
	public void CoverPage() {
		System.out.println("book Name:"+name +" Author of the book is: "+AuthorName);
	}
	public void BackCover() {
		System.out.println("this part gives us brief about what the book is all about "+" jauner: "+jauner+" cost of the book is "+price+"binfing type is: "+bindingType);
	}
	public void Prologue() {
		System.out.println("This gives us the introduction or summery of literature work"+" the publishing house is: "+Publisher);
	}
	public void Contents() {
		System.out.println("All chapter titles and corresponding page numbers are given "+" total chapters present n the book are: "+noOfchapters);
	}
	public void epilogue() {
		System.out.println("This gives us the author's summarized comment on what is happening in the book");
	}
}

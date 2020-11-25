package com.xworkz.oops;

public class BookStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Novel novel1= new Novel();
		novel1.name= "IKIGAI";
		novel1.AuthorName="Hector Gargia & Francesc Miralles";
		novel1.jauner="Self help";
		novel1.bindingType="Hard cover";
		novel1.Publisher="Penguine random house";
		novel1.price= 150;
		novel1.noOfchapters=9;
		
		Novel novel2= new Novel();
		novel2.name= "THE RUDEST BOOK EVER";
		novel2.AuthorName="SHWETHAB GANGWAR";
		novel2.jauner="Self help";
		novel2.bindingType="Soft cover";
		novel2.Publisher="Westland publications";
		novel2.price= 200;
		novel2.noOfchapters=15;
		
		Novel novel3= new Novel();
		novel2.name= "Fault In our Stars";
		novel2.AuthorName="John Green";
		novel2.jauner="Realistic Fiction";
		novel2.bindingType="Hard cover";
		novel2.Publisher="Dutton Books";
		novel2.price= 200;
		novel2.noOfchapters=20;
		
		novel1.CoverPage();
		novel1.BackCover();
		novel1.Contents();
		novel1.Prologue();
		novel1.epilogue();
		
		System.out.println("------Novel2-------");
		
		novel2.CoverPage();
		novel2.BackCover();
		novel2.Contents();
		novel2.Prologue();
		novel2.epilogue();
		
		System.out.println("------Novel3------");
		
		novel3.CoverPage();
		novel3.BackCover();
		novel3.Contents();
		novel3.Prologue();
		novel3.epilogue();
	}

}

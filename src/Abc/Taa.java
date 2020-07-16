package Abc;

class GrandFather{
	GrandFather(){
		System.out.println("GrandFather");
	}
}

class Book{
	Book(){
		System.out.println("Book");
	}
}

class Father extends GrandFather{
	Father(){
		System.out.println("Father");
	}
}


public class Taa extends Father{
	private Book b = new Book();
	public Taa() {
		System.out.println("GrandFather**");
	}
	public static void main(String[] args) {
		new Taa();
	}
}

class stringBulid
{
	public static void main(String[] args) 
	{
		StringBuilder sb=new StringBuilder("Karrena");
		sb.append("Kapoor");
		System.out.println(sb);

		StringBuilder greet=new StringBuilder("Hello");
		for(int i=0;i<5;i++)
			greet.append("Guys");

		System.out.println(greet);

		StringBuilder sr=new StringBuilder();
		System.out.println("Capacity "+sr.capacity());
		StringBuilder sr1=new StringBuilder("Hello");
		System.out.println("Capacity "+sr.capacity());
		StringBuilder fruit=new StringBuilder();
		System.out.println("Capacity "+fruit.capacity());
		//StringBuilder fruit=new StringBuilder("Apple");
		fruit.append("Apple");
		System.out.println("Capacity "+fruit.capacity());
		fruit.append("Mangoes Grapes Orange");
		System.out.println("Capacity "+fruit.capacity());
		

	}

}
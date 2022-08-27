class Test
{
	public static void main(String[] args) 
	{
		/*String str="Ashutosh";
		str=str.concat("kalaskar");
		System.out.println(str);*/
		String str="Hello";
		char alpha=str.charAt(3);
		System.out.println("Char at 4 "+alpha);
		//str=str.concat(" Bye");
		System.out.println(str);
		String var="Hello";
		System.out.println("Compare To "+str.compareTo(var)); //return 0 Both String equal
		String otr="Bbye";
		System.out.println("compare to "+str.compareTo(otr)); // return no zero
		String prayer="i Love india";
		System.out.println("i th index at start position "+prayer.indexOf('o'));
		System.out.println("i th index at End position "+prayer.indexOf('i'));
		System.out.println("Substring "+prayer.substring(2,6));   //start=2 end=6
		String Pattern="Hello-Bye-cool-Done";
		String word[]=Pattern.split("-");
		for(int i=0; i<word.length;i++ )
		{
			System.out.print(word[i]);
		}
		System.out.println("Length "+Pattern.length());
		String fruit="Apple";
		System.out.println("A replace M"+fruit.replace('A','M'));
		String movie="kGF 2";
		//String to Char
		char film[]=movie.toCharArray();
		for(int i=0;i<film.length;i++)
		{
			System.out.print(film[i]);
		}
		System.out.println();
		String mobile="Samsung";
		System.out.println("Lower "+mobile.toLowerCase());
		System.out.println("Upper "+mobile.toUpperCase());
		String laptop="     Dell       ";
		System.out.println("Laptop "+laptop.trim());//removing spaces from leading and trailing
		int num=123456; //Primitive type
		//Primitive to Referce type object --->Boxing
		String number=String.valueOf(num);
		System.out.println("Number "+number);
		 // public static String valueOf(boolean b)
 		 // public static String valueOf(byte b)
  		// public static String valueOf(int  b)
 		 // public static String valueOf(double b)
 		 // rest type
		String country="India is my counrty";
		System.out.println("Start with "+country.startsWith("India"));
		System.out.println("Start with "+country.startsWith("china"));
		String remote="";
		System.out.println("isEmpty "+remote.isEmpty());





	}
}

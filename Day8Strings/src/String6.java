
public class String6 {

	public static void main(String[] args) {
		String str1="Swetha";
		String str2="Nadella";
		System.out.println(str1+str2);
		//Below we get telusko only as strings are immutable once it is created.To explain it more clearly I have written notes with memory map
		//Below example first telusko will be pointing to str3 but once I try to concat with channel during runtime in java this telusko channel will
		//be created in heap memory and there is no reference so we have only Telusko printed
		String str3="Telusko";
		System.out.println(str3); //Telusko
		str3.concat("Channel");
		System.out.println(str3);//Telusko
		
		//But in below example once str4 is having telusko we will concatenate taht with channel which will be created in heap area as telusko channel
		//butthe reference will be pointed to str5 so only we are getting telusko channel
		
		String str4="Telusko";
		System.out.println(str4); //Telusko
		String str5=str4.concat("Channel");
		System.out.println(str5);//Telusko Channel
		
		//In the below first str6 will have telsuko and when we try to use buitln in mehtod channel to create telusko channel in heap area then the
		//reference tha tis pointing to teluso in str6 will be  pointing to now heap area . so we get telusko channel
		
		String str6="Telusko";
		System.out.println(str6); //Telusko
		str6=str6.concat("Channel");
		System.out.println(str6);//Telusko Channel
		
		//here If I use new keywrod first it directly creates in heap area and then it concatenates with channel and print the full name
		String str7=new String("Telusko");
		System.out.println(str7); //Telusko
		str7=str7.concat("Channel");
		System.out.println(str7);//Telusko Channel
		//One more way of concatenating. we are using refereces str8 to concatenate. so string is by default immutable but we are just pointing to new address
		String str8=new String("Telusko");
		System.out.println(str8); //Telusko
		str8=str8+"Channel";
		System.out.println(str8);//Telusko Channel
		
		//Below we are not using any references directly we are trying to change the value stored in the string. 
		String str9=new String("Telusko");
		System.out.println(str9); //Telusko
		str9="Telusko"+"Channel";
		System.out.println(str9);//Telusko Channel
		
		String str10="TeluskoBengaluru";
		System.out.println(str10); //Telusko
		str10="Telusko"+"Bengaluru";
		System.out.println(str10);//Telusko Bengaluru
		
		//In below pgm first we str11 gets created in scp and have reference pointing. then we have same value present in scp and it is also referering.
		//as the vlaues are same one more copy will not be created in scp and str12 will be pointing to the previousl one. so when I compare them which
		//are references here it will be true
		String str11="TeluskoBengaluru";
		System.out.println(str11); //Telusko
		String str12="Telusko"+"Bengaluru";
		System.out.println(str12);
	
		System.out.println(str11==str12);//true
		
		String str13=new String("TeluskoBengaluru1");
		System.out.println(str13); //Telusko
		String str14=new String("Telusko"+"Bengaluru1");
		System.out.println(str14);
	
		System.out.println(str13==str14);//false because it gets created in heap area and it will not check for duplicates so a new string is created and referred accordingly
		
		
		
		

	}

} 

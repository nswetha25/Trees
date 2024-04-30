package com.telusko.Learning;
//I can apply generics to class or interface also like below. Because we are seeing in this class how the collectio part is accepting the generic of our own class
class Gen<T>{     //Here if I dont have <T>
	T ref;
	public Gen(T ref) {
		
		this.ref=ref;
		
		
	}
	public void disp() {
		System.out.println(ref.getClass().getName());
	}
	public T getRef() {
		return ref;
	}
	
}
public class LaunchGenerics3 {

	public static void main(String[] args) {
		
		Gen<Integer> gen= new Gen<>(10); //Then having <Integer> here will throw an error
		gen.disp();
		System.out.println(gen.getRef());
		

	}

}

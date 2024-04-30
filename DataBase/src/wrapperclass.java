import java.util.ArrayList;
import java.util.List;

public class wrapperclass {

	public static void main(String[] args) {
		
		int age=10; // Here this is not a complete object oriented programming - Here we are using primitive data type
		//TO make it complete object oriented progming
		
		Integer i=new Integer(10);// 10 is an object not primitive. This apporach of creating object using wrapper class is deprecated.
		
		Character ch=new Character('c');
		
		System.out.println(ch);
		
		// Instead of writing those deprecated ways we can write like below
		
		Integer it=Integer.valueOf(10);// thisis a static method becasuse we are calling valueOf using the class name Integer directly
		
		int num=it;//Here object is stored in primitive which means object is getting converted to primitve called Auto Unboxing as it is done automatically
		
		int n1=it.intValue();//Unboxing
		double ab=10.4;//Primitive data
		//Lets store it as an object
		
		Double d=new Double(ab);
		Double dd=Double.valueOf(ab);
		
		
		System.out.println(it);
		
		//Converting primitive data in to object==> Boxing
		
		//Converting object in to primitive==> Unboxing
		
		ArrayList arr=new ArrayList();
		arr.add(10);// It is getting stored as an object- THis is autoboxing
		
		//From chatgpt
		
		/*Certainly! In Java, a wrapper class is a class that encapsulates, or wraps, the functionality of a primitive data type into an object. Java provides wrapper classes for each of the primitive data types, allowing them to be used as objects. The wrapper classes are part of the java.lang package.

Here are the wrapper classes for primitive data types:

Integer: java.lang.Integer
Long: java.lang.Long
Short: java.lang.Short
Byte: java.lang.Byte
Float: java.lang.Float
Double: java.lang.Double
Character: java.lang.Character
Boolean: java.lang.Boolean
Why Use Wrapper Classes?
Object Representation:

Primitive data types in Java are not objects; they are basic data types with limited functionality. Wrapper classes provide an object representation for these primitive types.
Generics:

Wrapper classes are often used in the context of generics, as generics require the use of objects rather than primitive types.
Compatibility with Collections:

Many collection classes (like ArrayList, LinkedList, etc.) in Java work with objects. Using wrapper classes allows you to use primitive types in these collections.
Null Values:

Wrapper classes can represent null values, while primitive types cannot. This is useful in scenarios where you need to represent the absence of a value.
Methods for Conversions and Operations:

Wrapper classes provide useful methods for converting between primitive types and performing various operations on the wrapped values.*/
		
		// Using Integer wrapper class
		Integer intValue = 42;  // Autoboxing - primitive to object
		int primitiveValue = intValue;  // Unboxing - object to primitive

		// Working with collections
		List<Integer> integerList = new ArrayList<>();
		integerList.add(10);
		integerList.add(20);

		// Null values
		Integer nullableValue = null;

		// Conversion methods
		String intString = Integer.toString(123);
		int parsedInt = Integer.parseInt("456");

		// Performing operations
		int sum = Integer.sum(2, 3);  // Returns 5	


		
		/* Collections and Generics:

Wrapper classes are extensively used in collections (e.g., List, Set, Map) and when working with generics. These classes provide a way to store and manipulate primitive data types within collections and generic classes.
Nullable Values:

When a variable needs to represent a nullable value, a wrapper class can be used. This is particularly useful when a primitive type is part of an object, and the absence of a value needs to be explicitly represented.

JDBC (Java Database Connectivity):

When interacting with databases using JDBC, the wrapper classes are often used to retrieve and set values from/to the database. JDBC methods typically return or expect objects, not primitives.
Serialization and Deserialization:

When objects need to be serialized or deserialized, wrapper classes can be helpful. Serialization frameworks often work with objects, and using wrapper classes allows you to serialize and deserialize primitive data types.
Mathematical Operations:

When performing complex mathematical operations or using libraries that expect objects, wrapper classes are useful. For example, the Math class methods often operate on Double and Float objects.
Web Development:

In web development frameworks, when working with request parameters or form data, wrapper classes are used to convert string inputs to the desired primitive type.
		*/
		
		
		
	}

}
 
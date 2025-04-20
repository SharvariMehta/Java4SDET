package a1_java_fundamentals;

public class Hello_World_Program_Breakdown {
/*
 * public: Access modifier — this class is accessible from anywhere in the project.
 * class: Keyword to define a class in Java.
 * HelloWorld: Name of the class. In Java, the filename must match the public class name.
 */
	public static void main(String[] args) {
/*
 * This is the entry point of any standalone Java application.
 * public: The method must be accessible by the JVM to start execution.
 * static: No object is required to invoke this method — it belongs to the class, not instances.
 * void: This method does not return any value.
 * main: Predefined method name used as the entry point.
 * String[] args: Used to receive command-line arguments. args is an array of String type.		
 */
		System.out.println("Hello, World!");
/* 
 * System: A built-in class from java.lang package.
 * out: A static member of System class, representing the standard output stream.
 * println(): Method used to print the message followed by a newline.
 */
	}

}

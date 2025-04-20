package b2_input_output;

	import java.util.Scanner;

	public class input_output_p  {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Take input for byte
	        System.out.print("Enter a byte value: ");
	        byte byteValue = scanner.nextByte();

	        // Take input for short
	        System.out.print("Enter a short value: ");
	        short shortValue = scanner.nextShort();

	        // Take input for int
	        System.out.print("Enter an int value: ");
	        int intValue = scanner.nextInt();

	        // Take input for long
	        System.out.print("Enter a long value: ");
	        long longValue = scanner.nextLong();

	        // Take input for float
	        System.out.print("Enter a float value: ");
	        float floatValue = scanner.nextFloat();

	        // Take input for double
	        System.out.print("Enter a double value: ");
	        double doubleValue = scanner.nextDouble();

	        // Take input for char
	        System.out.print("Enter a char value: ");
	        char charValue = scanner.next().charAt(0);

	        // Take input for boolean
	        System.out.print("Enter a boolean value (true/false): ");
	        boolean booleanValue = scanner.nextBoolean();

	        // Display the outputs
	        System.out.println("\nYou entered:");
	        System.out.println("byte: " + byteValue);
	        System.out.println("short: " + shortValue);
	        System.out.println("int: " + intValue);
	        System.out.println("long: " + longValue);
	        System.out.println("float: " + floatValue);
	        System.out.println("double: " + doubleValue);
	        System.out.println("char: " + charValue);
	        System.out.println("boolean: " + booleanValue);

	        scanner.close();
	    }
	

}

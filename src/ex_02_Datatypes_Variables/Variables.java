package ex_02_Datatypes_Variables;

public class Variables {

    // Static variable (shared by all objects of the class)
    static int staticCount = 0;

    // Instance variable (unique to each object)
    int instanceCount = 0;

    // Method to demonstrate variables
    public void showCounts() {
        // Local variable (exists only inside this method)
        int localCount = 0;

        // Increase all counts
        localCount++;
        instanceCount++;
        staticCount++;

        // Print all variables
        System.out.println("Local Variable: " + localCount);     // resets every time
        System.out.println("Instance Variable: " + instanceCount); // belongs to the object
        System.out.println("Static Variable: " + staticCount);     // shared across all objects
        System.out.println("-----");
    }

    public static void main(String[] args) {
        // Create two objects of VariableDemo
        Variables obj1 = new Variables();
        Variables obj2 = new Variables();

        // Call method on both objects
        obj1.showCounts();  // local = 1, instance = 1, static = 1
        obj1.showCounts();  // local = 1, instance = 2, static = 2
        obj2.showCounts();  // local = 1, instance = 1, static = 3
    }
}

/*
OUTPUT:
Local Variable: 1
Instance Variable: 1
Static Variable: 1
-----
Local Variable: 1
Instance Variable: 2
Static Variable: 2
-----
Local Variable: 1
Instance Variable: 1
Static Variable: 3
-----
 */

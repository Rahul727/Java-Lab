
package generic;

public class test {

    public static void main(String[] args) {

        double avg;
        generic ops = new generic();

        // Test generic method avg
        Integer a[] = {1, 2, 3};
        avg = ops.avg(a);
        System.out.println("Avg: " + avg);

        Float f[] = {1.0f, 2.0f, 3.0f};
        avg = ops.avg(f);
        System.out.println("Avg: " + avg);
        
        
        
        System.out.println("");
       
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println( "Array integer contains:" );
        ops.printArray( intArray  ); 
       
        System.out.println( "\nArray double contains:" );
        ops.printArray( doubleArray ); 

        System.out.println( "\nArray character contains:" );
        ops.printArray( charArray ); 
        
        System.out.println("");
       
        System.out.printf("Max of %d, %d and %d is %d\n\n",
                3, 4, 5, ops.maximum(3, 4, 5));

        System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n",
                6.6, 8.8, 7.7, ops.maximum(6.6, 8.8, 7.7));

        System.out.printf("Max of %s, %s and %s is %s\n", "pear",
                "apple", "orange", ops.maximum("pear", "apple", "orange"));
    }
}
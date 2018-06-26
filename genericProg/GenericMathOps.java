
package genericProg_27;

public class GenericMathOps {

    public <E extends Number> Double avg(E nums[]) {

        double sum = 0.0;
        for (E e : nums) {
            sum += e.doubleValue();
        }

        return sum / nums.length;
    }

    // generic method printArray                         
    public < E> void printArray(E[] inputArray) {
        
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public <T extends Comparable<T>> T maximum(T x, T y, T z) {

        T max = x; 
        if (y.compareTo(max) > 0) {
            max = y; 
        }
        if (z.compareTo(max) > 0) {
            max = z; 
        }
        return max;
    }
}

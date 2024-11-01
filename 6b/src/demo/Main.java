package demo;

import java.util.Arrays;
import java.util.Comparator;


public class Main {
 public static void main(String[] args) {
   
     Integer[] intArray = {3, 5, 7, 2, 8};
     ArrayMinMax<Integer> intMinMax = new ArrayMinMax<>(Comparator.naturalOrder());
     System.out.println("Integer Array: " + Arrays.toString(intArray));
     System.out.println("Min: " + intMinMax.min(intArray));
     System.out.println("Max: " + intMinMax.max(intArray));

     // String array
     String[] strArray = {"apple", "orange", "banana", "pear"};
     ArrayMinMax<String> strMinMax = new ArrayMinMax<>(Comparator.naturalOrder());
     System.out.println("\nString Array: " + Arrays.toString(strArray));
     System.out.println("Min: " + strMinMax.min(strArray));
     System.out.println("Max: " + strMinMax.max(strArray));

     // Character array
     Character[] charArray = {'a', 'z', 'e', 'r', 'b'};
     ArrayMinMax<Character> charMinMax = new ArrayMinMax<>(Comparator.naturalOrder());
     System.out.println("\nCharacter Array: " + Arrays.toString(charArray));
     System.out.println("Min: " + charMinMax.min(charArray));
     System.out.println("Max: " + charMinMax.max(charArray));

     // Float array
     Float[] floatArray = {3.5f, 5.2f, 7.1f, 2.8f, 8.3f};
     ArrayMinMax<Float> floatMinMax = new ArrayMinMax<>(Comparator.naturalOrder());
     System.out.println("\nFloat Array: " + Arrays.toString(floatArray));
     System.out.println("Min: " + floatMinMax.min(floatArray));
     System.out.println("Max: " + floatMinMax.max(floatArray));
 }
}

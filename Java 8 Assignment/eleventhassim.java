package wiprofirst.javaeightassiment;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class eleventhassim {
    public static void main(String[] args) {
       
        List<String> names = Arrays.asList("Anita", "Amit", "Rita", "Ravi", "Akasha", "Aruna");

        Predicate<String> startsWithA = name -> name.startsWith("A");

    
        Predicate<String> endsWithA = name -> name.endsWith("a");

       
        Predicate<String> combined = startsWithA.and(endsWithA);

  
        List<String> filtered = names.stream()
                                     .filter(combined)
                                     .collect(Collectors.toList());

        // Print result
        System.out.println("Filtered names: " + filtered);
    }
}

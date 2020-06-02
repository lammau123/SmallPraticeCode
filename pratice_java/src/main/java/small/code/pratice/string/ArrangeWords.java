package small.code.pratice.string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ArrangeWords {
    public String arrangeWords(String text) {
    	String result = Arrays.stream(text.split(" "))
    								 .sorted(Comparator.comparingInt(String::length))
    								 .collect(Collectors.joining(" "));
    	return Character.toUpperCase(result.charAt(0)) + result.substring(1).toLowerCase();
    	
    }
}

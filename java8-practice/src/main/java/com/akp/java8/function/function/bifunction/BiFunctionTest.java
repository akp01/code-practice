package com.akp.java8.function.function.bifunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionTest {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, String> biFunction = (num1, num2) -> "Result:" +(num1 + num2);
        System.out.println(biFunction.apply(20,25));
        
        // 2
        BiFunction<String, String,String> bi = (x, y) -> {      
            return x + y;
          };

          System.out.println(bi.apply("java2s.com", " tutorial"));
          
          // 3
          Calculator calculator = new Calculator();
          String result = calculator.calc((a, b) -> ": " + (a * b),3,  5);

          System.out.println(result);
          
          // 4
          List<Integer> _numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

          Function<Integer, Integer> lambda = value -> value * 2;
          List<Integer> doubled = _numbers.stream()
                  .map(lambda)
                  .collect(java.util.stream.Collectors.toList());
          
          System.out.println(doubled);
          
          
          // 5
          List<Double> numbers = Arrays.asList(1D, 25D, 100D);
          System.out.println(transformNumbers(numbers, Math::sqrt));
          
          
          // 6
          BiFunction<String, String, String> function1 = (s1, s2) -> {
  			String s3 = s1 + s2;
  			return s3;
  		};
  		System.out.println(function1.apply("BORAJI", ".COM"));

  		BiFunction<Integer, Integer, Integer> function2 = (a, b) -> a + b;
  		System.out.println(function2.apply(100, 200));
  		
  		// 7
  		BiFunction<Integer, Integer, Integer> function11 = (a, b) -> a + b;
		Function<Integer, Integer> function21 = (n) -> n*n;
		
		//Using andThen()
		System.out.println(function11.andThen(function21).apply(5, 3));
		System.out.println(function11.andThen(function21).apply(12, 2));
		
		// 8
		

	}
	
	private static List<String> transformNumbers(List<Double> numbers, Function<Double, Double> fx) {
	     List<String> appliedNumbers = new ArrayList<>();
	     for (Double n : numbers) {
	        appliedNumbers.add(String.valueOf(fx.apply(n)));
	     }
	     return appliedNumbers;
	  }  

}

class Calculator {
	  public String calc(BiFunction<Integer, Integer, String> bi, Integer i1, Integer i2) {
	      return bi.apply(i1, i2);
	  }
	}
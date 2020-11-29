package questions;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
    IMPORTANT:
	The aim of this exercise is to showcase your coding skills. Please do not think that we expect you to deliver the minnimun ammount of code required for this exercise to work.
	You are allowed to modify all the provided code. Do not think that provided classes have to remain untouched.
	Things that We take into consideration: Use of design patterns, clean code, testing.

    The Problem:
    Write a program that prints the numbers from 1 to 100.
    But for multiples of three print "Fizz" instead of the number
    and for the multiples of five print "Buzz".
    For numbers which are multiples of both three and five print "FizzBuzz".

 */
public class FizzBuzz {

    public static void main(String... args) {
    	
    	List<String> list = listNumbersFizzesAndBuzzes(1, 100);
    	
    	System.out.println(list);

    }

	public static List<String> listNumbersFizzesAndBuzzes(int init, int end) {
		Predicate<Integer> isThreeMultiple = e -> e%3==0;
    	Predicate<Integer> isFiveMultiple = e -> e%5==0;
 
		return IntStream.rangeClosed(init, end).boxed().map(e -> {
			if (isThreeMultiple.and(isFiveMultiple).test(e))
				return "FizzBuzz";
			if (isThreeMultiple.test(e))
				return "Fizz";
			if (isFiveMultiple.test(e))
				return "Buzz";
			else
				return e.toString();

		}).collect(Collectors.toList());

	}
}

/**
 * 
 */

/**
 * @author james k
 *
 */
public class FizBuzzMain {
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		/* Write a program that prints the numbers from 1 to 100. But for multiples of three print "Fizz" instead of

		* the number and for the multiples of five, print "Buzz"

		* For numbers which are multiples of both three and five, print "FizzBuzz"

		* */



		for (int i = 1; i < 101; i++){

		if(i % 3 == 0 && i % 5 == 0 ){

		print("FizzBuzz");

		}else if (i % 3 == 0){

		print("Fizz");

		}else if (i % 5 == 0){ // % gives reminder after division

		print("Buzz");

		}else{

		//System.out.println(i);

		print(Integer.toString(i));//casting integer into string

		}

		}//end for

		}// end main



		private static void print(String s){ // private, instead of public means only this class can see this method

		System.out.println(s);

		}

}

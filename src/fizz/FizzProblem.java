package fizz;

import java.util.Iterator;

/*Pour les nombres entre 1 et 20 :

si le nombre est divisible par 3 : on écrit Fizz
si le nombre est divisible par 5 : on écrit Buzz
si le nombre est divisible par 3 et par 5 : on écrit Fizzbuzz
sinon : on écrit le nombre*/


public class FizzProblem {

	public static void FindFizzBuzz(int n) {

		//boucle for pour parcourrir les nombres de 1 jusqu'à n
		for (int i = 1; i <= n; i++) {

			if ((i % 3 == 0) && (i % 5 == 0)) {

				System.out.println("FizzBuzz");

			} else if (i % 3 == 0) {

				System.out.println("Fizz");

			}else if (i % 5 == 0) {

				System.out.println("Buzz");
			}else {
				System.out.println(i);
			}

		}
	}

}

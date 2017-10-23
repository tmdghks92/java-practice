package next.fp;

import java.util.List;

public class Lambda {
	public static void printAllOld(List<Integer> numbers) {
		System.out.println("printAllOld");

		for (int number : numbers) {
			System.out.println(number);
		}
	}

	public static void printAllLambda(List<Integer> numbers) {
		System.out.println("printAllLambda");

		numbers.forEach(System.out::println);
	}

	public static void runThread() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello from thread");
			}
		}).start();
	}

	public static int sumAll(List<Integer> numbers) {
		// 익명 클래
		// return sum(new Numbers() {
		// @Override
		// public boolean isNumber(Integer number) {
		// return true;
		// }
		// }, numbers);
		// 람다 1단계
		// return sum((Integer number) -> true, numbers);
		// 람다 2단계
		// return sum(number -> true, numbers);
		// 람다 3단계
		return sum(n -> true, numbers);

	}

	public static int sumAllEven(List<Integer> numbers) {
		return sum(number -> number % 2 == 0, numbers);
	}

	public static int sumAllOverThree(List<Integer> numbers) {
		return sum(number -> number > 3, numbers);
	}

	public static int sum(Numbers n, List<Integer> numbers) {
		int total = 0;
		for (Integer number : numbers) {
			if (n.isNumber(number)) {
				total += number;
			}
		}
		return total;
	}
}

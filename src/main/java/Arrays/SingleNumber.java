package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SingleNumber {
	public static List getNonDblicate(Integer[] mas) {
		Arrays.asList(mas).sort(Comparator.naturalOrder());
		List<Integer> list = new ArrayList<>(Arrays.asList(mas));
		List<Integer> list1 = IntStream
				.range(0, mas.length)
				.filter(i -> i % 2 != 0)
				.mapToObj(i -> mas[i])
				.collect(Collectors.toList());
		  list.removeAll(list1);
		return list;
	}

	public static void main(String[] args) {
		Integer[] mas = {5, 8, 1, 5, 8};
		getNonDblicate(mas);
	}
}


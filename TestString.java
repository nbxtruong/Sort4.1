import java.util.Comparator;

import sort.Comparators;
import sort.QuickSort;
import sort.Sort;
import sort.SortableDataWithComparator;
import sort.SwapableArray;

public class TestString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Comparator<String> comp = Comparators.reverse(Comparators
				.<String> trivialComparator());
		Sort qs = new QuickSort();
		qs.doSort(new SortableDataWithComparator<String>(
				new SwapableArray<String>(args), comp));
		for (String s : args)
			System.out.print(s + " ");
		System.out.println();
	}
}

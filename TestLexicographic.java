import java.util.Comparator;

import sort.Comparators;
import sort.QuickSort;
import sort.SortableDataWithComparator;
import sort.SwapableArray;

public class TestLexicographic {
	public static void main(String[] args) {
		People[] peoples = { new People("Dupont", "Jean"),
				new People("Durand", "Jean"), new People("Martin", "Malin"),
				new People("Dupont", "Marcel"), new People("Martin", "Roger"),
				new People("Zebluz", "Agathe") };

		new QuickSort().doSort(new SortableDataWithComparator<People>(
				new SwapableArray<People>(peoples), Comparators.lexicographic(
								new Comparator<People>() {
									public int compare(People p1, People p2) {
										return p1.familyName().compareTo(p2.familyName());
									}
								}, new Comparator<People>() {
									public int compare(People p1, People p2) {
										return p1.firstName().compareTo(
												p2.firstName());
									}
								})));
		for (People p : peoples) {
			System.out.println(p);
		}
	}
}
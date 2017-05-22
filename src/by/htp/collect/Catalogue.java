package by.htp.collect;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Catalogue {

	public static void main(String[] args) {

		/*
		 * #5 ������� ��������� ������ HashMap, ���������� � �� ���������
		 * ����������: � �������� ����� - ��������� ������ � ��������
		 * (catalog.onliner.by) � �������� �������� - ���������� ������� �
		 * ������ ���������. ����������� ��������� �� ���������� ������� �
		 * ������ ���������, ����� ��������� � ������� ���������� ������������
		 * ���������� �������, ������� ��� ��������� � ������� ��� �� ������
		 * ������ (������������� ����� ��������� ��� ���������� ���������)
		 */
		Map<String, Integer> catalogue = new HashMap<String, Integer>();

		ValueComparator vc = new ValueComparator(catalogue);
		TreeMap<String, Integer> sortedCatalogue = new TreeMap<String, Integer>(vc);

		catalogue.put("Iphone7", 126);
		catalogue.put("Samsung GS7", 0);
		catalogue.put("Samsung GS7+", 100);
		catalogue.put("Vacuum Cleaner 45", 15);
		catalogue.put("Samsung Note7Plus", 10);
		catalogue.put("Samsung GS2", 0);

		System.out.println("unsorted Onliner catalogue: " + catalogue);

		Set<Entry<String, Integer>> set = catalogue.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
		while (it.hasNext()) {
			Entry<String, Integer> ent = it.next();
			if (ent.getValue().intValue() == 0) {
				it.remove();
			} else {
			}
		}

		int maxCount = 0;
		Entry<String, Integer> maxCat = null;
		Iterator<Entry<String, Integer>> it2 = set.iterator();
		while (it2.hasNext()) {
			Entry<String, Integer> ent = it2.next();
			if (ent.getValue().intValue() > maxCount) {
				maxCount = ent.getValue().intValue();
				maxCat = ent;
			}
		}
		System.out.println("Category with max number of items: " + maxCat);

		sortedCatalogue.putAll(catalogue);
		sortedCatalogue.descendingMap();
		System.out.println("sorted Onliner catalogue " + sortedCatalogue);

	}
}
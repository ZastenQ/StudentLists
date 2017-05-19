package by.htp.collect;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

public class StudentList {

	public static void main(String[] args) {

		/*
		 * Создать экземпляр класса LinkedList, разместить в нём 3 ссылки на
		 * объекты класса Student (name, dateBirth).Вывести информацию о всех
		 * студентах. Программно удалить из коллекции второго студента, вывести
		 * на экран информацию о оставшихся студентах.
		 */
		List<Student> list = new LinkedList<Student>();
		list.add(new Student("Joshua", "10-01-2000"));
		list.add(new Student("Andres", "08-05-2000"));
		list.add(new Student("Katrin", "13-08-2000"));

		for (int i = 0; i < list.size(); i++) {
			list.get(i).printInfo();
		}

		list.remove(1);

		for (int i = 0; i < list.size(); i++) {
			list.get(i).printInfo();
		}

		/*
		 * Создать экземпляр класса HashSet, добавить в него 25 ссылок на
		 * экземпляры класса Student, предусмотреть не менее 6 одинаковых по
		 * значению экземпляров класса Student. Вывести на экран информацию о
		 * студентах (содержащихся в коллекции HashSet), имя которых начинается
		 * с гласной буквы
		 */

		Set<Student> set = new HashSet<Student>();

		set.add(new Student("John", "11-02-1999"));
		set.add(new Student("Patric", "04-09-2001"));
		set.add(new Student("Anna", "12-07-2000"));
		set.add(new Student("John", "11-02-1999"));
		set.add(new Student("Patric", "04-09-2001"));
		set.add(new Student("Anna", "12-07-2000"));
		set.add(new Student("John", "11-02-1999"));
		set.add(new Student("Patric", "04-09-2001"));
		set.add(new Student("Anna", "12-07-2000"));
		set.add(new Student("John", "11-02-1999"));
		set.add(new Student("Patric", "04-09-2001"));
		set.add(new Student("Anna", "12-07-2000"));
		set.add(new Student("John", "11-02-1999"));
		set.add(new Student("Patric", "04-09-2001"));
		set.add(new Student("Anna", "12-07-2000"));
		set.add(new Student("John", "11-02-1999"));
		set.add(new Student("Patric", "04-09-2001"));
		set.add(new Student("Anna", "12-07-2000"));
		set.add(new Student("Eliza", "28-04-2001"));
		set.add(new Student("Elizabeth", "29-09-2001"));
		set.add(new Student("Milo", "27-11-2001"));
		set.add(new Student("Luisa", "23-11-2001"));
		set.add(new Student("Zachary", "19-12-2001"));
		set.add(new Student("Monica", "07-06-2001"));
		set.add(new Student("Lucas", "27-04-2001"));

		Pattern pattern = Pattern.compile("^[AEIOUY]+");
		for (Student st : set) {
			if (pattern.matcher(st.getName()).find()) {
				st.printInfo();
			}
		}
	}

}

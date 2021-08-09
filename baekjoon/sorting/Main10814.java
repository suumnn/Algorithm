import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

public class Main10814 { // 나이순 정렬

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Person[] p = new Person[n];
		
		for (int i = 0; i < n; i++) {
			p[i] = new Person(sc.nextInt(), sc.next());
		}
		
		Arrays.sort(p, Comparator.comparingInt(Person::getAge));
		
		for (int i = 0; i < n; i++) {
			System.out.println(p[i].age + " " + p[i].name);
		}
	}
}

class Person {
	int age;
	String name;
	
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}
}
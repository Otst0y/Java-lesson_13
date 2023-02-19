package lesson_13;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Fraction {

	String name;
	ArrayList<Deputy> deputies = new ArrayList();

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	void addDeputy() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter deputy's name:");
		String depName = scan.next();
		System.out.print("Enter deputy's last name:");
		String depLastName = scan.next();
		System.out.print("Enter deputy's age:");
		int depAge = scan.nextInt();
		System.out.print("Enter is the deputy a briber? (true/false):");
		boolean depBriber = scan.nextBoolean();

		Deputy dep = new Deputy(depName, depLastName, depAge, depBriber);

		deputies.add(dep);
	}

	void removeDeputy() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter deputy's name.");
		String depName = scan.next();
		System.out.println("Enter deputy's last name.");
		String depLastName = scan.next();

		Iterator<Deputy> it = deputies.iterator();

		while (it.hasNext()) {
			Deputy deputy = it.next();
			if (deputy.getName().equals(depName) && deputy.getLastName().equals(depLastName)) {
				it.remove();
			}
		}
	}

	void showBribers() {
		for (Deputy key : deputies) {
			if (key.isBriber() == true) {
				System.out.println(key.toString());
			}
		}
	}

	void showBiggestBriber() {
		int biggestBribe = 0;
		Deputy biggestBriber = null;
		for (Deputy key : deputies) {
			if (key.isBriber) {
				if (key.bribeAmount > biggestBribe) {
					biggestBribe = key.bribeAmount;
					biggestBriber = key;
				}
			}
		}
		System.out.println(biggestBriber);
	}

	void showDeputies() {
		for (Deputy deputy : deputies) {
			System.out.println(deputy);
		}
	}

	void clearFraction() {
		deputies.clear();
	}

}

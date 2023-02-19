package lesson_13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Parliament {

	ArrayList<Fraction> parliament = new ArrayList();

	void addFraction() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter fraction name:");
		String fractionName = scan.next();
		Fraction fraction = new Fraction();
		fraction.setName(fractionName);
		parliament.add(fraction);
	}

	void removeFraction() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter fraction name:");
		String fractionName = scan.next();
		Iterator<Fraction> it = parliament.iterator();

		while (it.hasNext()) {
			Fraction fractionNext = it.next();
			if (fractionNext.getName().equals(fractionName)) {
				it.remove();
			}
		}
	}

	void displayAllFractions() {
		Iterator<Fraction> it = parliament.iterator();
		
		while(it.hasNext()) {
			Fraction fractionNext = it.next();
			System.out.println(fractionNext.getName());
		}
	}

	void displayFraction() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter fraction name:");
		String fractionName = scan.next();
		Fraction fraction = new Fraction();

		for (Fraction key : parliament) {
			if (key.getName().equals(fractionName)) {
				System.out.println(key.getName());
			}
		}
	}

	void addDeputyToFraction() {
		Scanner scan = new Scanner(System.in);
		String fractionName = scan.next();
		Fraction fraction = new Fraction();
		System.out.println("Enter fraction name to add a deputy.");

		for (Fraction key : parliament) {
			if (key.getName().equalsIgnoreCase(fractionName)) {
				fraction.addDeputy();
			}
		}

	}

	void removeDeputyFromFraction() {
		Scanner scan = new Scanner(System.in);
		String fractionName = scan.next();
		Fraction fraction = new Fraction();
		System.out.println("Enter fraction name to remove a deputy.");

		for (Fraction key : parliament) {
			if (key.getName().equals(fractionName)) {
				key.removeDeputy();
			}
		}
	}

	void showAllBribers() {
		Scanner scan = new Scanner(System.in);
		String fractionName = scan.next();
		Fraction fraction = new Fraction();
		System.out.println("Enter fraction name to display all bribers.");

		for (Fraction key : parliament) {
			if (key.getName().equals(fractionName)) {
				key.showBribers();
			}
		}
	}

	void showBiggestBriber() {
		Scanner scan = new Scanner(System.in);
		String fractionName = scan.next();
		Fraction fraction = new Fraction();
		System.out.println("Enter fraction name to display the biggest briber.");

		for (Fraction key : parliament) {
			if (key.getName().equals(fractionName)) {
				key.showBiggestBriber();
			}
		}
	}

	void showAllDeputies() {
		Scanner scan = new Scanner(System.in);
		String fractionName = scan.next();
		Fraction fraction = new Fraction();
		System.out.println("Enter fraction name to display all deputies.");

		for (Fraction key : parliament) {
			if (key.getName().equals(fractionName)) {
				key.showDeputies();
			}
		}

	}
	
	void clearFraction() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter fraction name to clear.");
		String fractionName = scan.next();
		
		for (Fraction fraction : parliament) {
			if(fraction.getName().equals(fractionName)) {
				fraction.clearFraction();
			}
		}
	}

}

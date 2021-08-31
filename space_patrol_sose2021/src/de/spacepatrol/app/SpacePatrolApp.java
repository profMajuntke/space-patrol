package de.spacepatrol.app;

import java.util.Scanner;
import java.util.Set;

/**
 * @author vemaj
 *
 */
public class SpacePatrolApp {

	private static Scanner scanner = new Scanner(System.in);

	/**
	 * @param args mainklasse
	 */
	public static void main(String[] args) {

		while (true) {
			showStandardMenu();
			int choice = readUserInput();
			handle(choice);
			System.out.println("====================");
		}
	}

	/**
	 * 
	 * @return
	 */
	private static int readUserInput() {
		System.out.print("\nBitte, geben Sie die Nummer des gewaehlten Menueeintrags ein:\t");
		int choiceInternal = scanner.nextInt();

		return choiceInternal;
	}

	/**
	 * 
	 * @param choice
	 */
	private static void handle(int choice) {
		switch (choice) {
		case 1:
			createSpaceShip();
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			showPatrolMenu();
			break;
		case 5:
			break;
		case 6:
			break;
		default: {
			System.out.println("Ungueltige Eingabe. Bitte ueberpruefen Sie Ihre Eingabe");
			showStandardMenu();
		}
			break;

		}
	}

	/**
	 * 
	 */
	private static void showStandardMenu() {

		String menuItems[] = { "", "(1)\t Raumschiff anlegen", "(2)\t Daten eines Raumschiffs anzeigen",
				"(3)\t Daten aller Raumschiffe anzeigen", "(4)\t Raumschiff aus der Flotte nehmen" , "(5)\t Patrouillen-Flug starten", 
				"(5)\t Beenden"};

		System.out.println("\nSPACE PATROL 1.0\n");
		for (int i = 1; i < menuItems.length; i++) {
			System.out.println(menuItems[i]);
		}
	

	}

	private static void showPatrolMenu() {
		

			String menuItems[] = { "", "(1)\t Patrouillieren", "(2)\t Regenerieren",
					"(3)\t Patrouille beenden"};

			System.out.println("\n------ Patrouille Menu ------\n");
			for (int i = 1; i < menuItems.length; i++) {
				System.out.println(menuItems[i]);
			}
			
		
	}

	private static void createSpaceShip() {
		System.out.println(
				"\nLeider hat die Methode noch keinen Code. Aber Du kannst hoffentlich nachvollziehen wie der Ablauf ist. Hier sollst Du ein neues Raumschiff anlegen.\n");
	}

}

import java.util.Scanner;
public class Choose {
	public static void main(String [] args) {
		System.out.println("You see a scary house. You are with your friends. Do you investigate? Y or N");
		Scanner inputChoice = new Scanner(System.in);
		String choice = inputChoice.nextLine();
		String upchoice = choice.toUpperCase();
		if (upchoice.equals("Y")) {
			System.out.println("You are very brave. You sneak in the side door.");
		} else {
			System.out.println("Chicken. See ya");
			return;
		}
		
		System.out.println("The side door creaks! Zombies awake. Continue Y or leave N?");
		//Scanner inputChoice = new Scanner(System.in);
		choice = inputChoice.nextLine();
		upchoice = choice.toUpperCase();
		
		if (upchoice.equals("Y")) {
			System.out.println("You find a cricket bat and destroy the first zombie! Run upstairs");
		} else {
			System.out.println("Zombie eats your brain. You die scum");
			return;
		}
		
		System.out.println("You hear a creak from the door to the bedroom. Do you open the door Y or N?");
		choice = inputChoice.nextLine();
		upchoice = choice.toUpperCase();
		
		if (upchoice.equals("Y")) {
			System.out.println("You open the door to find a room filled with weapons. You arm yourself.");
		} else {
			System.out.println("You hesitate to open the door and the stairs behind you swarms with zombies. You are surrounded and die");
			return;
		}
		
		System.out.println("Do you hide in the room Y or leave to find and kill zombies N?");
		choice = inputChoice.nextLine();
		upchoice = choice.toUpperCase();
		
		if (upchoice.equals("Y")) {
			System.out.println("Zombies trap you in the room and although you are armed, you are no match for the overwhelming swarm of zombies and you die.");
		} else {
			System.out.println("You search through the house, cutting down zombies wherever you find them. Finally the last zombie is killed and you are free.");
		}
		
		System.out.println("Do you stay and live in the house Y or leave N?");
		choice = inputChoice.nextLine();
		upchoice = choice.toUpperCase();
		
		if (upchoice.equals("Y")) {
			System.out.println("You live a long,happy and fulfilling life in the house. GG you won!");
		} else {
			System.out.println("You leave the house to find a huge swarm of zombies waiting for you in ambush. You die.");
			return;
		}
	}
}
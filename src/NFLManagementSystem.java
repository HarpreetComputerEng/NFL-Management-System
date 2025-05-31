
/**
 * Program: Computer Engineering Technology - Computing Science [Academic Level: 2 ]
 * Course: CST8132 Object Oriented Programming 
 * Student Name: HarpreetSingh
 * Student Number: 041127993
 * Section #: 312
 * Professor: Dr. JamesMwangi
 * Assignment - 2 : NFL Management System
 * Due Date: 30th March 2025 
 */

/**
 *
 *
 * NFL Management System
 * This program manages NFL teams, players, and games. It provides options to 
 * display, add, and search for teams and players while ensuring object persistence.
 *
 * @author Harpreet Singh
 */
import java.util.Scanner;

/**
 * Main class for the NFL Management System.
 */
public class NFLManagementSystem {
    /**
     * Main method to initialize managers and display the menu.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        TeamManager Manager1 = new TeamManager(); // Instantiate managers for Teams
        PlayerManager Manager2 = new PlayerManager();  // Instantiate managers for Players
        GameManager Manager3 = new GameManager(); // Instantiate managers for Games
        
     // Load teams, players, and games from CSV files
        Manager1.loadTeams("teams.csv");
        Manager2.loadPlayers("players.csv", Manager1);
        Manager3.loadGames("games.csv");

        showMenu(Manager1, Manager2, Manager3); // Display the main menu for the user to interact with
    }

    /**
     * Displays the main menu and handles user input.
     *
     * @param teamManager   Manages NFL teams.
     * @param playerManager Manages NFL players.
     * @param gameManager   Manages NFL games.
     */
    public static void showMenu(TeamManager teamManager, PlayerManager playerManager, GameManager gameManager) { // calling all classes in this project
        Scanner keyboard = new Scanner(System.in); // Scanner object for driver class
        while (true) {
            System.out.println("\nNFL Operations Management System");
            System.out.println("1. Display Teams");
            System.out.println("2. Display Players");
            System.out.println("3. Display Scheduled Games");
            System.out.println("4. Add Team");
            System.out.println("5. Add Player to Team");
            System.out.println("6. Find Team");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            String input = keyboard.nextLine();
            try {
                int choice = Integer.parseInt(input);
                switch (choice) { // Switch Case for user input options from 1-7
                    case 1:
                        teamManager.displayTeams();
                        break;

                    case 2:
                        playerManager.displayPlayers();
                        break;

                    case 3:
                        gameManager.displayGames();
                        break;

                    case 4: {  
                        System.out.print("Enter team name: ");
                        String teamName = keyboard.nextLine();
                        System.out.print("Enter city: ");
                        String city = keyboard.nextLine();
                        System.out.print("Enter coach name: ");
                        String coach = keyboard.nextLine();
                        System.out.print("Enter years of experience: ");
                        int years = Integer.parseInt(keyboard.nextLine());
                        teamManager.addTeam(teamName, city, coach, years);// Calling addteam method to add a team
                        System.out.println("Team added successfully!");
                    }
                    break;

                    case 5: {
                  
                    	System.out.print("Enter player ID: ");
                        String id = keyboard.nextLine();
                        System.out.print("Enter player name: ");
                        String name = keyboard.nextLine();
                        System.out.print("Enter player age: ");
                        int age = Integer.parseInt(keyboard.nextLine());
                        System.out.print("Enter team name: ");
                        String tName = keyboard.nextLine();
                        System.out.print("Enter player position: ");
                        String pos = keyboard.nextLine();
                        playerManager.addPlayer(id, name, age, tName, pos, teamManager); //calling addplayer method from PLyer manger class
                        System.out.println("Player added successfully!");
                    }
                    break;

                    case 6: {
                        System.out.print("Enter team name to search: ");
                        String search = keyboard.nextLine();
                        Team teams = teamManager.findTeam(search);//Calling Team Manager method with teams object to search the team
                        if (teams != null)
                            System.out.println("Team found: " + teams);
                        else
                            System.out.println("Sorry Team not found!");
                    }
                    break;

                    case 7: { // last Case
                        System.out.println("\n*******************************************");
                        System.out.println("...Exiting the program by Harpreet Singh...");
                        System.out.println("*********************************************");
                        return; // return instead of break 
                    }

                    default:
                        System.out.println("**Invalid choice. Try again**"); // 
                        break;
                }
            } catch (Exception e) { // catch for invalid option exception 
                System.out.println("**Invalid input. Try again**");
            }
           
            }
        }
    }

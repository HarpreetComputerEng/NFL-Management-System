
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
 * The PlayerManager class handles the management of NFL players.
 * It allows loading player data from a file, displaying player details, and adding players to teams.
 * 
 * @author Harpreet Singh
 */
import java.io.*;
import java.util.*;

/**
 * Manages a list of NFL players, including loading players from a file, displaying their details, and adding them to teams.
 */
public class PlayerManager {
    /**
     * A list to store the loaded players.
     */
    private List<Player> players = new ArrayList<>();

    /**
     * Loads player data from a specified file and associates them with teams.
     * Uses a for-each loop instead of a while loop.
     *
     * @param fileName    The name of the file containing player details.
     * @param teamManager The TeamManager instance used to associate players with teams.
     */
    public void loadPlayers(String fileName, TeamManager teamManager) {
        try (BufferedReader reader1 = new BufferedReader(new FileReader(fileName))) {
            List<String> lines = reader1.lines().toList(); // Read all lines into a list
            for (String line : lines) { // Iterate through each line using an enhanced for-loop  
                String[] data = line.split(","); // Split the line by commas to extract data fields  
                if (data.length < 5) continue; // Ensure the line contains at least 4 values

                Player p = new Player(data[0], data[1], Integer.parseInt(data[2]), data[3], data[4]); // Create a new Player object using data from the CSV file
                players.add(p);
                Team t = teamManager.findTeam(p.getTeamName());
                if (t != null) {
                    t.addPlayer(p);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading players file: " + e.getMessage());
        }
    }

    /**
     * Displays the list of players in a formatted table.
     */
    public void displayPlayers() {
        System.out.println("-------------------------------------------------------------------");
        System.out.printf("%-5s %-15s %-5s %-10s %-20s\n", "ID", "Player", "Age", "Team", "Position");
        System.out.println("-------------------------------------------------------------------");
        for (Player p : players) {
            System.out.println(p);
        }
    }

    /**
     * Adds a new player and associates them with a team.
     *
     * @param playerId    The unique identifier for the player.
     * @param name        The name of the player.
     * @param age         The age of the player.
     * @param teamName    The team the player is associated with.
     * @param position    The position the player plays in.
     * @param teamManager The TeamManager instance used to associate the player with a team.
     */
    public void addPlayer(String playerId, String name, int age, String teamName, String position, TeamManager teamManager) {
        Player p = new Player(playerId, name, age, teamName, position);   // Create a new Player object
        players.add(p);
        Team t = teamManager.findTeam(teamName);
        if (t != null) t.addPlayer(p);  // If the team exists, add the player to that team
    }
}

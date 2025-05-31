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
 * The GameManager class handles the management of NFL games.
 * It allows loading game data from a file and displaying the scheduled games.
 * 
 * @author Harpreet Singh
 */
import java.io.*;
import java.util.*;

/**
 * Manages a list of NFL games, providing functionality to load games from a file and display them.
 */
public class GameManager {
    /**
     * A list to store the loaded games.
     */
    private List<Game> games = new ArrayList<>();

    /**
     * Loads game data from a specified file and populates the games list.
     *
     * @param fileName The name of the file containing game details.
     */
    public void loadGames(String fileName) {
        try (BufferedReader reader0 = new BufferedReader(new FileReader(fileName))) {
            List<String> lines = reader0.lines().toList(); // Read all lines into a list
            for (String line : lines) { // Iterate through each line using an enhanced for-loop  
                String[] data = line.split(","); // Split the line by commas to extract data fields  
                if (data.length < 5) continue; // Ensure the line contains at least 5 values
                games.add(new Game(data[0], data[1], data[2], data[3], data[4]));
            }
        } catch (IOException e) {
            System.out.println("Error reading games file: " + e.getMessage());
        }
    }


    /**
     * Displays the list of scheduled games in a formatted table.
     */
    public void displayGames() { // to display games in the format
        System.out.println("-------------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-12s %-20s %-10s\n", "Home", "Visitor", "Date", "Location", "Score");
        System.out.println("-------------------------------------------------------------------");
        for (Game g : games) {
            System.out.println(g);
        }
    }
}

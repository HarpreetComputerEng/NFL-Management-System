
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
import java.io.*;
import java.util.*;

/**
 * The TeamManager class manages a list of NFL teams.
 * It allows loading teams from a file, displaying team details, adding teams, and finding a team by name.
 * 
 * @author Harpreet Singh
 */
public class TeamManager {
    /** The list of teams managed by the TeamManager */
    private List<Team> teams = new ArrayList<>();

    /**
     * Loads teams from a specified file and adds them to the list of teams.
     * Uses a for-each loop instead of a while loop.
     *
     * @param fileName The name of the file containing team details.
     */
    public void loadTeams(String fileName) {
        try (BufferedReader reader2 = new BufferedReader(new FileReader(fileName))) {
            List<String> L = reader2.lines().toList(); // Read all lines from the file into a List
            for (String line : L) {   // Iterate through each line using an enhanced for-loop  
                String[] data = line.split(",");  // Split the line by commas to extract data fields  
                if (data.length < 4) continue; // Ensure the line contains at least 4 values

                String teamName = data[0];
                String city = data[1];
                String coachName = data[2];
                int years = Integer.parseInt(data[3]);// Convert years of experience to integer  

                Coach c = new Coach(coachName, years);// Create a new Coach object using extracted values 
                teams.add(new Team(teamName, city, c));// Create a new team object using extracted values 
            }
        } catch (IOException e) {
            System.out.println("Error in reading teams file: " + e.getMessage());
        }
    }

    /**
     * Displays the list of teams in a formatted table.
     */
    public void displayTeams() {
        System.out.println("-------------------------------------------------------------------");
        System.out.printf("%-10s %-15s %-30s %-10s\n", "Team", "City", "Coach", "Players");
        System.out.println("-------------------------------------------------------------------");
        for (Team team : teams) {
            System.out.println(team);
        }
    }

    /**
     * Adds a new team to the list.
     *
     * @param teamName The name of the team.
     * @param city The city the team is based in.
     * @param coachName The name of the coach.
     * @param years The years of experience of the coach.
     */
    public void addTeam(String teamName, String city, String coachName, int years) {
        Coach c = new Coach(coachName, years);
        teams.add(new Team(teamName, city, c));
    }

    /**
     * Finds and returns a team by its name.
     *
     * @param teamName The name of the team to be found.
     * @return The team with the given name, or null if not found.
     */
    public Team findTeam(String teamName) {
        for (Team T : teams) { // enhanced for loop and if statement 
            if (T.getTeamName().equalsIgnoreCase(teamName)) return T;
        }
        return null; // null as a return value
    }
}

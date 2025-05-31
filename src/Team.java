

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
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * The Team class represents an NFL team, including its name, city, coach, and the list of players.
 * It allows adding players, retrieving the list of players, and displaying team details.
 * 
 * @author Harpreet Singh
 */
public class Team implements Serializable {
    private static final long serialVersionUID = 1L;

    /** The name of the team */
    private String teamName;

    /** The city the team is based in */
    private String city;

    /** The coach of the team */
    private Coach coach;

    /** The list of players in the team */
    private List<Player> players;

    /**
     * Constructs a new Team object with the specified name, city, and coach.
     *
     * @param teamName The name of the team.
     * @param city The city the team is based in.
     * @param coach The coach of the team.
     */
    public Team(String teamName, String city, Coach coach) {
        this.teamName = teamName;
        this.city = city;
        this.coach = coach;
        this.players = new ArrayList<>();
    }

    /**
     * Adds a player to the team's player list.
     *
     * @param player The player to be added to the team.
     */
    public void addPlayer(Player player) {
        players.add(player);
    }

    /**
     * Returns the list of players in the team.
     *
     * @return A list of players in the team.
     */
    public List<Player> getPlayers() {
        return players;
    }

    /**
     * Returns the name of the team.
     *
     * @return The team's name.
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * Returns the city of the team.
     *
     * @return The team's city.
     */
    public String getCity() {
        return city;
    }

    /**
     * Returns the coach of the team.
     *
     * @return The team's coach.
     */
    public Coach getCoach() {
        return coach;
    }

    /**
     * Returns a string representation of the team, including its name, city, coach, and number of players.
     *
     * @return A string representing the team.
     */
    @Override
    public String toString() {  // to string method to return string values
        return String.format("%-10s %-15s %-30s %-5d",  // Format the output using String.format() for proper alignment
            teamName, city, coach.toString(), players.size());
    }
}

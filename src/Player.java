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
 * The Player class represents an NFL player.
 * It implements the Serializable interface to support object persistence.
 * 
 * @author Harpreet Singh
 */
import java.io.Serializable;

/**
 * Represents an NFL player with details such as player ID, name, age, team, and position.
 * Implements Serializable to allow object persistence.
 */
public class Player implements Serializable {
    /**
     * Serial version UID for ensuring compatibility during deserialization.
     */
    private static final long serialVersionUID = 1L;

    private String playerId;
    private String name;
    private int age;
    private String teamName;
    private String position;

    /**
     * Constructs a new Player with the given details.
     *
     * @param playerId  The unique identifier of the player.
     * @param name      The name of the player.
     * @param age       The age of the player.
     * @param teamName  The name of the team the player belongs to.
     * @param position  The position the player plays in.
     */
    public Player(String playerId, String name, int age, String teamName, String position) {
        this.playerId = playerId;
        this.name = name;
        this.age = age;
        this.teamName = teamName;
        this.position = position;
    }

    /**
     * Gets the player's unique ID.
     *
     * @return The player ID.
     */
    public String getPlayerId() { return playerId; }

    /**
     * Gets the player's name.
     *
     * @return The name of the player.
     */
    public String getName() { return name; }

    /**
     * Gets the player's age.
     *
     * @return The age of the player.
     */
    public int getAge() { return age; }

    /**
     * Gets the name of the team the player belongs to.
     *
     * @return The team name.
     */
    public String getTeamName() { return teamName; }

    /**
     * Gets the position of the player.
     *
     * @return The player's position.
     */
    public String getPosition() { return position; }

    /**
     * Returns a formatted string representation of the player's details.
     *
     * @return A formatted string containing player ID, name, age, team, and position.
     */
    @Override
    public String toString() { // to string method to return string values
        return String.format("%-5s %-15s %-5d %-10s %-20s", playerId, name, age, teamName, position);
    }
}

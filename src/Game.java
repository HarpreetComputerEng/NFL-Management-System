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
 * The Game class represents a scheduled NFL game.
 * It implements the Serializable interface to support object persistence.
 * 
 * @author Harpreet Singh
 */
import java.io.Serializable;

/**
 * Represents an NFL game between two teams, including details like date, location, and score.
 * Implements Serializable to allow object persistence.
 */
public class Game implements Serializable {
    /**
     * Serial version UID for ensuring compatibility during deserialization.
     */
    private static final long serialVersionUID = 1L; // default serialVersionUID number

    private String team1;
    private String team2;
    private String date;
    private String location;
    private String score;

    /**
     * Constructs a new Game with the given details.
     *
     * @param team1    The first team playing the game.
     * @param team2    The second team playing the game.
     * @param date     The date of the game.
     * @param location The location where the game is held.
     * @param score    The final score of the game.
     */
    public Game(String team1, String team2, String date, String location, String score) {
        this.team1 = team1;
        this.team2 = team2;
        this.date = date;
        this.location = location;
        this.score = score;
    }

    /**
     * Returns a formatted string representation of the game details.
     *
     * @return A formatted string containing team names, date, location, and score.
     */
    @Override
    public String toString() { // Format the output string using left-aligned spacing
        return String.format("%-10s %-10s %-12s %-20s %-10s", team1, team2, date, location, score);
    }
}
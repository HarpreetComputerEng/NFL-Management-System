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
 * The Coach class represents a coach in the NFL Management System.
 * It implements the Serializable interface to allow object persistence.
 * 
 * @author Harpreet Singh
 */
import java.io.*;

/**
 * Represents a coach with a name and years of experience.
 * Implements Serializable to support object persistence.
 */
public class Coach implements Serializable {
    /**
     * Serial version UID for ensuring compatibility during deserialization.
     */
    private static final long serialVersionUID = 1L;
     // Instance Variables for coach class
    private String name;
    private int yearsOfExperience;

    /**
     * Constructs a new Coach with the given name and years of experience.
     *
     * @param name              The name of the coach.
     * @param yearsOfExperience The number of years of coaching experience.
     */
    public Coach(String name, int yearsOfExperience) {
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
    }

    /**
     * Gets the name of the coach.
     *
     * @return The name of the coach.
     */
    public String getName() { // getter for the coach class
        return name;
    }

    /**
     * Gets the number of years of coaching experience.
     *
     * @return The years of coaching experience.
     */
    public int getYearsOfExperience() { // getter for the coach class
        return yearsOfExperience;
    }

    /**
     * Returns a string representation of the Coach.
     *
     * @return A formatted string containing the coach's name and experience.
     */
    @Override
    public String toString() { // toString method to convert for exception
        return String.format("%s (%d years)", name, yearsOfExperience);
    }
}

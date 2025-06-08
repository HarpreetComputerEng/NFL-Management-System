# 🏈 NFL Management System – Java Console Application

## 📌 Overview

This Java console application simulates a simplified NFL (National Football League) management system. It provides functionality to load, manage, and display teams, players, coaches, and scheduled games using object-oriented principles and file input/output (I/O). Designed as a modular, menu-driven system, it allows users to perform real-time updates such as adding new teams or players and associating them with each other dynamically during runtime.

The application emphasizes:

- **Object-Oriented Design** – Encapsulation of player, coach, team, and game entities using distinct Java classes.
- **Composition and Relationships** – Teams have coaches and players, which demonstrates "has-a" relationships.
- **File I/O** – Data is loaded from CSV files to populate the system without manual hardcoding.
- **Java Collections and Enhanced Loops** – Efficient handling and iteration through lists of data.
- **Exception Handling** – Handles file errors and malformed input gracefully.
- **Formatted Output** – Clear tabular views for all data presented to the user.

Whether you're a coach manager, team owner, or just a student learning Java, this system provides a foundational example of how to organize and manage sports data in a clean, scalable way.

---

## 💡 Key Features

- ✅ **Display Teams**: List all NFL teams, including coach information and players.
- ✅ **Display Players**: Show all registered players with ID, name, age, team, and position.
- ✅ **Display Games**: View scheduled games with date, location, and score.
- ➕ **Add Teams**: Add a new team with city, coach name, and years of experience.
- ➕ **Add Players**: Register new players and assign them to teams.
- 📂 **Load from Files**: Load teams, players, and games from CSV files.
- 🎮 **Interactive Menu**: Easy-to-use text-based interface for performing all operations.

---

## 🗂️ File Structure

| File                  | Description                                               |
|-----------------------|-----------------------------------------------------------|
| `NFLManagementSystem.java` | Main class with the user menu and program loop          |
| `TeamManager.java`    | Loads, manages, and displays team data                    |
| `PlayerManager.java`  | Loads, manages, and displays player data                  |
| `GameManager.java`    | Loads and displays scheduled NFL games                    |
| `Team.java`           | Represents a team and maintains a list of players         |
| `Player.java`         | Represents a football player                              |
| `Game.java`           | Represents a game between two teams                       |
| `Coach.java`          | Represents a coach with name and experience               |

---

## 📥 Input File Format (CSV)

Place CSV files like `teams.csv`, `players.csv`, and `games.csv` in your project directory.

### ✅ `teams.csv`

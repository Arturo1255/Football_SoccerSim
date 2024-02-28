# Football/Soccer Simulator in Java

This Java application simulates a football (soccer) league, allowing for the simulation of matches between teams, tracking their wins, losses, ties, and overall points to determine the standings within a league.

## Features

- Simulates a football league with 10 teams.
- Supports match simulation between teams, taking into account player positions and randomness in scoring.
- Calculates and displays the season overview, including wins, losses, ties, and points for each team.
- Displays a league table with teams ordered by points, including goals for (GF), goals against (GA), goal difference (GD), and total points (PTS).

## Files
- Main.java
- League.java
- Player.java
- Team.java

## How to Run

Ensure you have a Java Development Kit (JDK) installed to compile and run this application. Follow these steps:

1. 1. Save the `Main.java`, `League.java`, `Player.java`, and `Team.java` files in the same directory.
2. Open a terminal or command prompt.
3. Navigate to the directory containing `Main.java`.
4. Compile the Java program:
5. Run the compiled program:

## How It Works

1. **League Initialization**: The program starts by creating a league with a specified name and initializing teams within the league.
2. **Season Simulation**: The `season` method simulates a round-robin tournament where each team plays against every other team.
3. **Match Simulation**: The `match` method simulates a match between two teams, with the outcome (win, draw, loss) determined by the simulated scores.
4. **Score Calculation**: The `play` method simulates scoring based on player positions (Forward, Midfielder, Defender) and random factors.
5. **League Table**: After the season simulation, the `table` method displays the final standings of the teams in the league.

## Classes

### League Class

The `League` class is responsible for managing the league's details, including its name and the teams that participate in it. It provides functionality to create the league with predefined team names and access team information.

### Key Features of the League Class:

- Initializes a league with a given name and a fixed number of teams.
- Supports operations to get and set the league's name.
- Allows retrieval and modification of the teams within the league.
- Facilitates creating the league with predefined team names.

### Player Class

The `Player` class represents individual players within the teams. It includes details such as the player's name, position, overall rating, and the number of goals scored.

### Key Features of the Player Class:

- Initializes a player with an overall rating, jersey number, and position.
- Allows setting and getting player details, including name, number, position, and goals scored.
- Provides a method to print player details to the console.

### Team Class

The `Team` class encapsulates the operations and details of a team, including its name, roster of players, and match statistics such as wins, losses, ties, goals scored, and goals allowed.

### Key Features of the Team Class:

- Initializes a team with a given name and an empty roster of players.
- Allows adding and retrieving players from the team's roster.
- Tracks team performance statistics, including wins, losses, ties, goals for, and goals against.
- Automatically generates a team with players assigned random overall ratings and positions when creating a new team.

## League Table Format

The league table is displayed with the following columns:

- **Team**: The name of the team.
- **W**: Wins.
- **D**: Draws (Ties).
- **L**: Losses.
- **GF**: Goals For.
- **GA**: Goals Against.
- **GD**: Goal Difference (GF - GA).
- **PTS**: Points (3 points for a win, 1 point for a draw).

## Conclusion

This football/soccer simulator provides a comprehensive framework for simulating a football/soccer league season, including match simulations, scoring, league standings, and detailed management of teams and players. It demonstrates object-oriented programming principles in Java, with the `Main`, `League`, `Player`, and `Team` classes working together to simulate a football/soccer league.

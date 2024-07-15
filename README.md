# Magical Arena
	This is a simple Java implementation of the Magical Arena game.

## Introduction
	The Magical Arena is a turn-based battle game where two players engage in combat until one of them loses all their health points.
	
## Features

	- Players have attributes such as health, strength, and attack.
	- Players take turns attacking and defending using dice rolls.
	- Damage calculation is based on attack and defense rolls.
	- The game ends when one player's health reaches 0.
	
## Requirements
	- Java Development Kit (JDK)
	- Eclipse IDE
	- JUnit 4
	
## Project Structure
	- src/main/java (App.java): Contains the main source code files which is inside org.swiggy_assignment package. 
	- src/test/java (PlayerTest.java and MagicalArenaTest.java: Contains the test source code files which is inside org.swiggy_assignment package. 
	- pom.xml: Maven project configuration file.

## How to Build and Run
	=> To import the project into Eclipse:
		1. Open Eclipse IDE.
		2. Select "File" -> "Import" -> "Existing Maven Projects".
		3. Browse to the project directory and select it.
		4. Click "Finish".
		
## How to Run
	To run the game, follow these steps:
		-Run the 'App.java'(src/main/java) file as a Java application to start the game.
		-Right click on App.java class => Run as => select Java Application
		
## How to Play
	1. Two players are created with initial attributes (health, strength, and attack).
	2. Players take turns attacking and defending.
	3. Each player rolls a 6-sided die for attack and defense.
	4. Damage is calculated based on the dice rolls and player attributes.
	5. The game continues until one player's health reaches 0.
	
## Unit Tests
	Unit tests are provided to ensure the correctness of the code. JUnit 3.8.1 are used for testing.
	
## Steps to do Unit Testing:
	Right click on Testing class Name => Run as => select Junit Test Case =>It will show Unit Test cases

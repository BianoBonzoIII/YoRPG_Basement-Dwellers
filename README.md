# Project's CoffeeConverters
George Liang 
Brian Lin 
Kendrick Liang

# YoRPG_Basement-Dwellers
This is going to be the birth of the greatest RPG Metacritic and IGN will ever see

# Latest Update: 
v3, Protaganist Subclasses, Monster Subclasses 

# Character.java 
The superclass of both Monster.java and Protaganist.java. It contains all of the methods and attributes that are necessary for the basic functionality of a protagonist and a monster in the game. For example, both contain attack() and attributes like Health or Strength

# Protaganist.java 
The class that operates the hero, what the player controls. It contains a unique method named special() where some of its stats increase at the cost of the decrease of one other attribute's value. This is a superclass of the "classes" that the player can choose.  

# Monster.java 
The class that operates the enemies in the game. The stats are generally lower than the protaganist. This is a superclass of the types of enemies that can be encountered in the game

# Swordsman.java 
A subclass of Protagnist.java and a class that the player can choose. Its attack rate stat is 0.4 points greater than the attack rate stat in Protaganist.java

# Archer.java 
A subclass of Protagnist.java and a class that the player can choose. Its strength stat is 75 points greater than the strength stat in Protaganist.java

# Mage.java 
A subclass of Protagnist.java and a class that the player can choose. Its defense stat is 40 points greater than the defense stat in Protaganist.java

# Slime.java
A subclass of Monster.java and an enemy that the player can fight. Its defense stat is 5 points lower than the defense stat in Monster.java

# Ogre.java
A subclass of Monster.java and an enemy that the player can fight. Its strength stat is 20 points higher than the strength stat in Monster.java

# Dragon.java
A subclass of Monster.java and an enemy that the player can fight. Its health stat is 150 points higher than the health stat in Monster.java


# ARMY CHALLENGE
## Difficulty: PRE-INTERMEDIATE
##### Remember to write readable, clean code with object oriented principles. The goal of this challenge is to practice Java OOP concepts while maintaining simplicity.
##### Beware of over engineering. The hardest thing is to find balance.

### Army description:
_Create an army of soldiers with special abilities. Execute commands._

You are going to create an Army with at least 3 different soldiers (i.e. offensive, defensive and adaptable).
Soldiers have some common properties like name and damage. 

Issue commands to an army. Make defensive soldiers defend and offensive soldiers attack. 
Have a command which makes everyone reports itself. (Everyone just prints his name). Have any other commands you want.
React on each command in your army with different soldiers.

**You are going to practice inheritance and polymorphism.**

##### Constrains:
- Have at least 3 types of soldiers
- Each soldier has a special ability which your army can use (i.e. Knights can flank an enemy) 
- Have at least 3 different commands
- Have a command - report - which makes everyone just reports itself

###### Important part of this challenge is how are you going to create classes, interfaces and abstract classes. Commands and soldiers doesn't have to do actually anything, just print something for example.

**Bonus A:**

Create [class diagram](https://www.uml-diagrams.org/class-diagrams-overview.html) of your application, which shows structure of the designed system at the level of classes and relationships. Class diagram is type of UML diagram, which are used in software development.

**Special creative bonus:**

Create an enemy army which yours army attacks or defends. Your army can actually destroy enemies army or vice versa. This is a really creative bonus and not necessary OOP related, but if you want to have some fun, do this and don't forget to send it to us. We would very much want to see it. (info@streetofcode.sk) 


`You can choose any bonus, all of them or neither.`


#### Program output example:
````
-------REPORT--------
Soldier Swordsman 1 here. Type - ADAPTABLE
Soldier Swordsman 2 here. Type - ADAPTABLE
Soldier Archer 1 here. Type - DEFENSIVE
Soldier Archer 2 here. Type - DEFENSIVE
Soldier Archer 3 here. Type - DEFENSIVE
Soldier Spearman 1 here. Type - DEFENSIVE
Soldier Spearman 2 here. Type - DEFENSIVE
Soldier berserk 1 here. Type - DEFENSIVE
Soldier Knight 1 here. Type - OFFENSIVE
Soldier Knight 2 here. Type - OFFENSIVE
Soldier Knight 3 here. Type - OFFENSIVE


-------ATTACK--------
Swordsman Swordsman 1 deals 3 damage.
Swordsman Swordsman 2 deals 3 damage.
Berserk berserk 1 deals 3 damage.
Knight Knight 1 deals 5 damage.
Knight Knight 2 deals 5 damage.
Knight Knight 3 deals 5 damage.


-------DEFEND--------
Swordsman Swordsman 1 deals 3 damage.
Swordsman Swordsman 2 deals 3 damage.
Archer Archer 1 deals 2 damage.
Archer Archer 2 deals 2 damage.
Archer Archer 3 deals 2 damage.
Spearman Spearman 1 deals 4 damage.
Spearman Spearman 2 deals 4 damage.


-------FURY ATTACK--------
Swordsman Swordsman 1 deals 3 damage.
Swordsman Swordsman 2 deals 3 damage.
Berserk berserk 1 deals 6 damage.
Knight Knight 1 deals 5 damage.
Knight Knight 2 deals 5 damage.
Knight Knight 3 deals 5 damage.


-------FIRE DEFEND--------
Swordsman Swordsman 1 deals 3 damage.
Swordsman Swordsman 2 deals 3 damage.
Archer Archer 1 deals 4 damage.
Archer Archer 2 deals 4 damage.
Archer Archer 3 deals 4 damage.
Spearman Spearman 1 deals 4 damage.
Spearman Spearman 2 deals 4 damage.


-------FLANK--------
Knight Knight 1 is flanking
Knight Knight 2 is flanking
Knight Knight 3 is flanking

Process finished with exit code 0


````



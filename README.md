# Monty Hall Problem

The Monty Hall problem is a situa!on in the game show Let’s Make A Deal where the contestant is given the op!on of picking 1 of 3 doors. The host, Monty Hall, would then open one of the remaining doors, revealing one of the losing op!on. The contestant would then be given the choice of keeping the door that they originally chose or switching to the other, unrevealed door.

*******************
Description
*******************
Here, are the investigation results for Monty Hall Problem based on the probability.
We have run the program 1,000,000 times for each simulation to smoothen out the curve and get some concrete results.

*******************
Simulation 1
*******************
-	100 doors, where 1 is chosen and 98 are revealed
-	Here, 98.99% out of 100% switching doors helps you win Monty Hall’s Game.

![alt text](https://github.com/prerakpatelca/monty-hall-problem/blob/master/Picture1.png)

*******************
Simulation 2
*******************
-	10 doors, where 1 is chosen and 8 are revealed
-	Here, 89.98% out of 100% switching doors helps you win Monty Hall’s Game.

![alt text](https://github.com/prerakpatelca/monty-hall-problem/blob/master/Picture2.png)

*******************
Simulation 3
*******************
-	4 doors, where 1 is chosen and 2 are revealed, where 4 is the last digit of my student number: 000331374
-	Here, 74.96% out of 100% switching doors helps you win Monty Hall’s Game.

![alt text](https://github.com/prerakpatelca/monty-hall-problem/blob/master/Picture3.png)

******************************
Analysis on Monty Hall Problem
******************************
-	In simulation 1 we can see that switching doors helps you win 98.99% of the time due to the fact that as at the last we have 100 doors at the beginning each door has probability of winning 1/100

![alt text](https://github.com/prerakpatelca/monty-hall-problem/blob/master/Picture4.png)

Let’s say you chose door 1.
Probability of winning on the door 1 would be 1/100.
Probability of winning on the door 2 would be 1/100.
Probability of winning on the door 3 would be 1/100.
…..
Probability of winning on the door 100 would be 1/100.

But after we revealed 98 doors 
Probability of winning on the door 1 would be 1/100.
Probability of winning on the door 2 would be 99/100.

99/100 = 0.99 * 100 = 99% (winning rate for switching)
1/100 = 0.01 * 100 = 1% (winning rate for staying)


As we now figured that out of 98 doors revealed none of them was the winner.

Hence, switching the doors would help you win 98.99% of the time. 

-	In simulation 2 we can see that switching doors helps you win 89.98% of the time due to the fact that as at the last we have 10 doors at the beginning each door has probability of winning 1/10

Let’s say you chose door 1.
Probability of winning on the door 1 would be 1/10.
Probability of winning on the door 2 would be 1/10.
Probability of winning on the door 3 would be 1/10.
…..
Probability of winning on the door 10 would be 1/10.

But after we revealed 8 doors 
Probability of winning on the door 1 would be 1/10.
Probability of winning on the door 2 would be 9/10.
As we now figured that out of 8 doors revealed none of them was the winner.

Hence, switching the doors would help you win 89.98% of the time. If you see now switching the doors probability came down by 10% as the number of doors decreases.

This happened because the denominator for the formula of probability decreased by 1/10. This resulted in the winning probability of switching the door drop by 10%.
	
9/10 = 0.9 * 100 = 90% (winning rate for switching)
1/10 = 0.1 * 100 = 10% (winning rate for staying)

-	In simulation 3 we can see that switching doors helps you win 74.96% of the time due to the fact that as at the last we have 10 doors at the beginning each door has probability of winning 1/10

Let’s say you chose door 1.
Probability of winning on the door 1 would be 1/4.
Probability of winning on the door 2 would be 1/4.
Probability of winning on the door 3 would be 1/4.
Probability of winning on the door 4 would be 1/4.

But after we revealed 2 doors 
Probability of winning on the door 1 would be 1/4.
Probability of winning on the door 2 would be 3/4.
As we now figured that out of 2 doors revealed none of them was the winner.


3/4 = 0.75 * 100 = 75% (winning rate for switching)
1/4 = 0.25 * 100 = 25% (winning rate for staying)

Therefore, after seeing the concrete results and confirming those results with the probability and numbers we can conclude that switching the doors helps you win most of the time as oppose to staying with the door.

# Assignment 2

### Q1

##### Assignment:
Given the code for craps we already created, write the application so that it runs 1,000,000 times and counts the wins and losses as well as the percentage of times the user wins and loses.

##### Additional Questions:
- How many games are won on the first roll, second roll, ... , twentieth roll and after the twentieth roll?
- How many games are lost on the first roll, second roll, ... , twentieth roll and after the twentieth roll?
- What are the chances of winning at craps? [Note: You should discover that craps is one of the fairest casino games. What do you suppose this means?]
- What is the average length of a game of craps?
- Do the chances of winning improve with the length of the game?

Submit your source code & test-run screenshots (JPG/PNG) to support your answers for the questions a through e.

### Q2

##### Assignment:
In this problem, you'll recreate the classic race of the tortoise and the hare. You'll use random-number generation to develop a simulation of this memorable event. Our contenders begin the race at position 1 of 70 positions. Each position represents a possible location along the racecourse. The finish line is at position 70. The first contender to reah or pass position 70 is rewarded with a paoil of fresh carrots and lettuce. The course weaves its way up the side of a slippery mountain, so occasionally the contenders lose ground. A clock ticks once per second. With each tick of the clock, your application should adjust the position of the animals according to the rules in the Fig. Use variables to keep track of the positions of the animals (i.e., position numbers are 1-70). Start each animal at position 1 (the "starting gate"). If an animal slip left before square 1, move it back to square 1.

| Animal | Move type | Percentage of the time | Actual move |
| :--: | :--: | :--: | :--: |
| Tortoise | Fast plod | 50% | 3 squares to the right |
| | Slip | 20% | 6 squares to the left |
| | Slow plod | 30% | 1 square to the right |
| Hare | Sleep | 20% | No move at all |
| | Big hop | 20% | 9 squares to the right |
| | Big slip | 10% | 12 squares to the left |
| | Small hop | 30% | 1 square to the right |
| | Small slip | 20% | 2 squares to the left |

Generate the percentages in Fig by producing a random integer i in the range 1 <= x <= 10.

Begin the race by displaying: BANG!!! AND THEY'RE OFF!!! Then, for each tick of the clock (i.e., each repetition of a loop or sleep timer-timing out every second), display a 70-position line showing the letter T in the position of the tortoise and the letter H in the position of the hare. Occasionally, the contenders will land on the same square and in this case, the tortoise bites the hare, and your application should display OUCH!!! beginning at that position. All output positions other than the T, the H or the OUCH!!! (in case of a tie) should be blank (could be represented by a hyphen or underscore). After each line is displayed, test for whether either animal has reached or passed position 70. If so, display the winner and terminate the simulation. If the tortoise wins, display TORTOISE WINS!!! YAY!!! If the hare wins, display HARE WINS. YUCH. If both animals win on the same tick of the clock, you may want to favor the tortoise (the “underdog”), or you may want to display It's a tie. If neither animal wins, perform the loop again to simulate the next tick of the clock. When you’re ready to run your application, assemble a group of fans to watch the race. You’ll be amazed at how involved your audience gets!

Submit source code and test run screenshots for the game simulation run.
# Lesson 10

### Topics
- Use of “break” and “continue” using “Collatz Conjecture”.

    $f(n)=\frac{n}{2}$ when $n$ is even, $3n+1$ when $n$ is odd
    
    For example, the output for number 9 would show like
    
    `9 -> 28 -> 14 -> 7 -> 22 -> 11 -> 34 -> 17 -> 52 -> 26 -> 13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1`
    
    Write a program that prints the Collatz Conjecture for a number “n” (or all the numbers from 3 through n), counts how many steps it took to get to 1, and also counts how many primes were encountered.

- Enum type and comparison to its implementation in Java internals.
- Game of craps
    
    You roll two dice. Each die has six faces, which contain one, two, three, four, five and six spots, respectively. After the dice have come to rest, the sum of the spots on the two upward faces is calculated. If the sum is 7 or 11 on the first throw, you win. If the sum is 2, 3 or 12 on the first throw (called “craps”), you lose (i.e., the “house” wins). If the sum is 4, 5, 6, 8, 9 or 10 on the first throw, that sum becomes your “point.” To win, you must continue rolling the dice until you “make your point” (i.e., roll that same point value). You lose by rolling a 7 before making your point.

### Learning Objectives
- Demonstrate the implementation of methods and returned value.
- Discuss the user defined enum type and its applications.
- Show the declaration, usage, and comparison of enum type.

### Review
- Chapter 6 from Slide# 1 up to the end.
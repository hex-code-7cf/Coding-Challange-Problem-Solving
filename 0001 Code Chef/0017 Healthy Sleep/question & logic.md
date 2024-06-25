# Healthy Sleep

At IIITA, students have diverse sleep patterns, and there isn't a fixed duration for their daily sleep. Typical scientific recommendations suggest that the duration of a healthy sleep is 8 hours per day.

## Problem Statement
Write a program that takes as input the number of hours a student sleeps per day, and judges how good their sleep schedule is.

Specifically:
- If the student sleeps for strictly less than 8 hours, the program should output `LESS`.
- If the student sleeps for exactly 8 hours, the program should output `PERFECT`.
- If the student sleeps for strictly more than 8 hours, the program should output `MORE`.

## Input Format
The only line of input contains a single integer \( H \), denoting the number of hours a student sleeps per day.

## Output Format
Output a single string containing the answer:
- `LESS` if the student doesn't get enough sleep.
- `PERFECT` if the student sleeps the perfect amount of time.
- `MORE` if the student sleeps too much.

Each character of the output may be printed in either uppercase or lowercase, i.e., the strings `LESS`, `less`, `LeSs`, and `lesS` will all be treated as equivalent.

## Constraints
- \( 1 \leq H \leq 24 \)

## Sample 1
### Input
2
### Output
LESS
### Explanation
The student sleeps for 2 hours, which is less than 8. So, the program should output `LESS`.

## Sample 2
### Input
13
### Output
MORE
### Explanation
The student sleeps for 13 hours, which is more than 8. So, the program should output `MORE`.

## Sample 3
### Input
8
### Output
PERFECT
### Explanation
The student sleeps for exactly 8 hours, so the program should output `PERFECT`.
### Algorithm & Logic

sleep < 8 -> LESS
sleep == 8 -> PERFECT
sleep > 8 -> MORE


1. start
2. get sleep duration form user
3. if sleep < 8 print LESS
4. if sleep == 8 print PERFECT
5. if sleep > 8 print MORE
6. STOP

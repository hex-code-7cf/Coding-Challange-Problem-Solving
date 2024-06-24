# Lucky Seven

## Problem Statement
Chef considers the number 7 lucky. As a result, he believes that the 7th letter he sees on a day is his lucky letter of the day.

You are given a string \( S \) of length 10, denoting the first 10 letters Chef saw today. What is Chef's lucky letter?

## Input Format
The only line of input contains a string \( S \), of length 10.

## Output Format
Print a single character: Chef's lucky letter.

## Constraints
- \( S \) has a length of 10
- \( S \) contains only lowercase Latin letters (i.e., the characters 'a' to 'z')

## Sample

### Input
proceeding

### Output
d

### Explanation
The 7th character of "proceeding" is 'd', and hence that is Chef's lucky letter.

### Input
outofsight

### Output
i

### Explanation
The 7th character of "outofsight" is 'i', and hence that is Chef's lucky letter.


### Algorithm and Logic

1. start
2. accept in string input from user
3. get the 7th character of the string (6th character if array start with zero index)
4. print the character
5. stop
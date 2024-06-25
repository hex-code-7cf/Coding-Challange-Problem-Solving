# Minimum Wage

The minimum wage in Chefland is 11 dollars per hour.

## Problem Statement
Given that Chef earns \( X \) dollars per hour, find whether his income is strictly above the minimum wage.

## Input Format
The first and only line contains an integer \( X \), denoting the income of Chef per hour.

## Output Format
Output on a new line, YES, if Chef's income is strictly above the minimum wage. Otherwise, output NO.

You may print each character of the string in uppercase or lowercase (for example, the strings YES, yEs, yes, and yeS will all be treated as identical).

## Constraints
- \( 1 \leq X \leq 20 \)

## Sample 1
### Input
20
### Output
YES
### Explanation
Chef's income is 20 dollars per hour, which is strictly higher than the minimum wage.

## Sample 2
### Input
11
### Output
NO
### Explanation
Chef's income is 11 dollars per hour, which is not higher than the minimum wage.

### Algorithm and Logic

minimim wage is 11
if x > minimum wage print YES


1. start
2. minimum_wage = 11
3. get the input wage from the user
4. if input_wage > minimum_wage
5. if step 4 true, print "YES"
6. if step 4 false, print "NO"
7. stop
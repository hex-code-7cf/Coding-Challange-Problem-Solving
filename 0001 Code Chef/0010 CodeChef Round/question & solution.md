# Codechef Round

Codechef rounds are held on every Wednesday now, and not on any other days.

You are wondering whether there is a Codechef round today. You know it is the \( N \)-th day of the week (Sunday is 1st, Monday is 2nd, Tuesday is 3rd, Wednesday is 4th and so on).

Can you tell whether there is a Codechef round today?

## Input Format
The first and only line of input contains a single integer \( N \), the day of the week.

## Output Format
Output "YES" if there is a Codechef round today, else "NO".

You may print each character of the string in uppercase or lowercase (for example, the strings YES, yEs, yes, and yeS will all be treated as identical).

## Constraints
- \( 1 \leq N \leq 7 \)

## Samples

### Sample 1
**Input**
```
1
```
**Output**
```
NO
```
**Explanation**: 1st day of the week is Sunday, but Codechef rounds are not held anymore on Sunday.

### Sample 2
**Input**
```
4
```
**Output**
```
YES
```
**Explanation**: 4th day of the week is Wednesday, which is when all Codechef rounds are held now.


### Logic and Algorithm

1. start
2. get day
3. check day == 4
4. if step 3 true print "YES"
5. if step 3 false print "NO"
6. stop

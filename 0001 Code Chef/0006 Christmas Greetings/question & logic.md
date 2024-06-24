# Christmas Greetings

Christmas is celebrated on the 25th of December every year.

## Problem Statement
You are given a day \( X \) in December. Determine whether it is Christmas. Print `CHRISTMAS` if it is Christmas. Otherwise, print `ORDINARY`.

## Input Format
The input consists of a single integer \( X \), denoting a day in December.

## Output Format
Output on a new line `CHRISTMAS` if it is Christmas and `ORDINARY` otherwise.

You may print each character in uppercase or lowercase. For example, the strings `CHRISTMAS`, `christmas`, `Christmas` are all considered identical.

## Constraints
- \( 1 \leq X \leq 31 \)

## Sample

```
### Input
25

### Output

CHRISTMAS
```

### Explanation
We print `CHRISTMAS` since the day is 25.

```
### Input
12

### Output
ORDINARY
```

### Explanation
We print `ORDINARY` since the day is not 25.


### Logic & Algorithm

1. start
2. accept day input from user
3. check day is 25
4. if step 3 is true print "CHRISTMAS"
5. if step 3 is false print "ORDINARY"
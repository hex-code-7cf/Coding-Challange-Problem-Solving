# Add Two Numbers

Your task is very simple: given two integers \( A \) and \( B \), write a program to add these two numbers and output the sum.

## Input Format
The first line contains an integer \( T \), the total number of test cases.  
Then follow \( T \) lines, each line contains two integers, \( A \) and \( B \).

## Output Format
For each test case, add \( A \) and \( B \) and display the sum in a new line.

## Constraints
- \( 1 \leq T \leq 1000 \)
- \( 0 \leq A, B \leq 10000 \)

## Sample

### Input
```
3
1 2
100 200
10 40
```

### Output
```
3
300
50
```

### Explanation
- **Testcase 1**: \( 1 + 2 = 3 \). Hence the first output is `3`.
- **Testcase 2**: \( 100 + 200 = 300 \). Hence the second output is `300`.
- **Testcase 3**: \( 10 + 40 = 50 \). Hence the third output is `50`.
o

### Logic and Solution

1. Get number of test case
2. while t < 0
    1. get x and y
    2. sum x + y
    3. t = t - 1 
3. stop


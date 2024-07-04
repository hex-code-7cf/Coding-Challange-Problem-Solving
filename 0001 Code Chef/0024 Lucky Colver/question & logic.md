# Lucky Clover

Chef heard that four-leaf clovers bring good luck, so he went looking for one.

In his search, Chef found \( N \) clovers in total. Out of them, exactly one was a four-leaf clover, and all the others were three-leaf clovers. How many leaves did Chef collect in total, across all the clovers?

## Input Format
The only line of input will contain a single integer \( N \), the number of clovers Chef found.

## Output Format
Print one integer: the total number of leaves Chef collected.

## Constraints
- \( 1 \leq N \leq 10 \)

## Sample 1:
### Input
5
### Output
16
### Explanation
Chef found 5 clovers. One of them is a four-leaf clover, and the other four are three-leaf clovers.
So, the total number of leaves is \( 4 + 3 \cdot 4 = 4 + 12 = 16 \).

## Sample 2:
### Input
1
### Output
4
### Explanation
Chef found only one clover. It has to be a four-leaf clover, so Chef collected 4 leaves in total.

## Sample 3:
### Input
10
### Output
31
### Explanation
Chef found 10 clovers. One of them is a four-leaf clover, and the others are three-leaf clovers.
So, the total number of leaves is \( 4 + 3 \cdot 9 = 4 + 27 = 31 \).

### Algorithm and Logic

Total n clovers 
one have 4 leaf and all other have 3 leaf
total_leaves = 4 + (n-1) * 3

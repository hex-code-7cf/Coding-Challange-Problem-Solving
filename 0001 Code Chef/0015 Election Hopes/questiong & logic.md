
---

**Election Hopes**

**Problem Statement:**

The elections in Chefland have concluded, and the results are in!

Chef received \( X \) votes, and his rival Chefu received \( Y \).

Chef thinks he dominated the election if and only if he received at least double the number of votes Chefu received.
Did Chef dominate the election?

**Input Format:**

The only line of input contains two space-separated integers \( X \) and \( Y \) — the number of votes received by Chef and Chefu, respectively.

**Output Format:**

Print a single line containing the answer: either "Yes" or "No" (without quotes), depending on whether Chef dominated the election or not.

Each letter of the output may be printed in either uppercase or lowercase, i.e, the strings No, no, NO, and nO will all be treated as equivalent.

**Constraints:**

- \( 1 \leq X, Y \leq 100 \)

**Sample 1:**

Input:
```
79 40
```
Output:
```
No
```
Explanation:
Chef received 79 votes, and Chefu received 40.
Twice of 40 is 80, and since Chef didn't receive \(\geq 80\) votes, he didn't dominate the election.

**Sample 2:**

Input:
```
28 14
```
Output:
```
Yes
```
Explanation:
Chef received 28 votes, and Chefu received 14.
Twice of 14 is 28, and since Chef received \(\geq 28\) votes, he dominated the election.

---

This document outlines the problem, provides examples, and specifies the input/output format for the "Election Hopes" problem.

### Algorithm and Logic

constrain : Chef dominated the election if and only if he received at least double (greater than or equal to 2*vote of opponent)

did chef dominate the election?


1. start
2. get the inputs as string form the user
4. conver the string in array of length 2 by spliting
3. intialize array[0] to x and array[1] to y
4. if x >= 2*y
5. if step 4 true, print "YES"
6. if step 4 false, print "NO"
7. stop

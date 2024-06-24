
---

**AC Please**

**Problem Statement:**

Chef is feeling the heat this summer and wants to switch on the Air Conditioning all the time, but since he doesn't want to harm the environment much, he only switches it on when the room temperature is strictly greater than 30 degrees Celsius.

Given the room temperature, you need to find whether Chef will switch on the air conditioning or not.

**Input Format:**

The only line of input will contain a single integer \( T \) - denoting the room temperature.

**Output Format:**

Print `YES` if Chef will turn the Air Conditioning on, otherwise print `NO`.

You may print each character of the string in uppercase or lowercase (for example, the strings `YES`, `yEs`, `yes`, and `yeS` will all be treated as identical).

**Constraints:**

- \( 1 \leq T \leq 50 \)

**Sample 1:**

Input:
```
30
```
Output:
```
NO
```
Explanation:
Since the temperature is not more than 30 degrees Celsius Chef won't turn on the Air Conditioning.

**Sample 2:**

Input:
```
41
```
Output:
```
YES
```
Explanation:
Since the temperature is more than 30 degrees Celsius Chef will turn on the Air Conditioning.

---

This document outlines the problem, provides examples, and specifies the input/output format for the "AC Please" problem.



### Algorithm & Logic

output : Give the remove temperature, find whether switch on the ac or not
condition : stricly greater than 30 degress celsius.

1. start
2. get the temperature t from the user
3. if t > 30
4. if step 3 is true print YES
5. if step 3 is false print NO
6. stop
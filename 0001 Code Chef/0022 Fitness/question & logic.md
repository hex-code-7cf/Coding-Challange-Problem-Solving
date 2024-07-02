# Fitness

Chef wants to become fit for which he decided to walk to the office and return home by walking. It is known that Chef's office is \( X \) km away from his home.

If his office is open on 5 days in a week, find the number of kilometers Chef travels through office trips in a week.

## Input Format
- The first line will contain \( T \), the number of test cases.
- Then the test cases follow.
- Each test case consists of a single line containing a single integer \( X \).

## Output Format
For each test case, output the number of kilometers Chef travels through office trips in a week.

## Constraints
- \( 1 \leq T \leq 10 \)
- \( 1 \leq X \leq 10 \)

## Sample

### Input
    4
    1
    3
    7
    10

### Output
    10
    30
    70
    100

### Explanation
- **Test case 1**: The office is 1 km away. Thus, to go to the office and come back home, Chef has to walk 2 km in a day. In a week with 5 working days, Chef has to travel \( 2 \times 5 = 10 \) km in total.
- **Test case 2**: The office is 3 km away. Thus, to go to the office and come back home, Chef has to walk 6 km in a day. In a week with 5 working days, Chef has to travel \( 6 \times 5 = 30 \) km in total.
- **Test case 3**: The office is 7 km away. Thus, to go to the office and come back home, Chef has to walk 14 km in a day. In a week with 5 working days, Chef has to travel \( 14 \times 5 = 70 \) km in total.
- **Test case 4**: The office is 10 km away. Thus, to go to the office and come back home, Chef has to walk 20 km in a day. In a week with 5 working days, Chef has to travel \( 20 \times 5 = 100 \) km in total.

### Algorithm and Logic

total_km_walk_per_day = 2 * distance between home and office
total_km_walk_in_a_week = 5 * total_km_walk_per_day
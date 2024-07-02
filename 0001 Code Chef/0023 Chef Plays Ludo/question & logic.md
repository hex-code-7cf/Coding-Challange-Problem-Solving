# Chef Plays Ludo

Chef is playing Ludo. According to the rules of Ludo, a player can enter a new token into the play only when he rolls a 6 on the die.

In the current turn, Chef rolled the number \( X \) on the die. Determine if Chef can enter a new token into the play in the current turn or not.

## Input Format
- The first line contains a single integer \( T \) — the number of test cases.
- The first and only line of each test case contains one integer \( X \) — the number rolled by the Chef on the die.

## Output Format
For each test case, output YES if the Chef can enter a new token in the game. Otherwise, output NO.

You may print each character of YES and NO in uppercase or lowercase (for example, yes, yEs, Yes will be considered identical).

## Constraints
- \( 1 \leq T \leq 6 \)
- \( 1 \leq X \leq 6 \)

## Sample

### Input

    3
    1
    6
    3

### Output

    NO
    YES
    NO

### Explanation
- **Test Case 1**: Since Chef did not roll a 6, he cannot enter a new token in the play.
- **Test Case 2**: Since Chef rolled a 6, he can enter a new token in the play.
- **Test Case 3**: Since Chef did not roll a 6, he cannot enter a new token in the play.

### Algorithm & logic

if input == 6 print YES else NO
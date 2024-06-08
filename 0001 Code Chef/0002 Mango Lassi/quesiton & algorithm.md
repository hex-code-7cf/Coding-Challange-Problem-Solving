# Summer Time

Mamalesh likes to drink mango lassi when it's hot, and only when it's hot. If (and only if) the temperature on a given day is strictly greater than 35 degrees, Mamalesh will drink mango lassi.

Mamalesh sees that today's temperature is \( X \) degrees Celsius. Will he drink mango lassi today? Print "YES" if he will, and "NO" otherwise (without quotes).

## Input Format
The only line of input will contain a single integer \( X \), denoting today's temperature.

## Output Format
Print "YES" if Mamalesh will drink mango lassi today, and "NO" otherwise (without quotes).

Each letter of the output may be printed in either uppercase or lowercase, i.e., the strings NO, no, No, and nO will all be treated as equivalent.

## Constraints
- 1≤X≤50

## Samples

### Sample 1
**Input**
```
35
```
**Output**
```
NO
```
**Explanation**: Today's temperature is 35, which is not strictly greater than 35 degrees Celsius. So, Mamalesh will not drink mango lassi today.

### Sample 2
**Input**
```
38
```
**Output**
```
YES
```
**Explanation**: Today's temperature is 38, which is greater than 35 degrees Celsius. So, Mamalesh will drink mango lassi today.


### Algorithm and Logic

1. get the temperature from user
2. if temperature > 35 
3. if step 2 true print "YES"
4. if step 2 false print "NO"

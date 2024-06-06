# Advitiya

IIT Ropar is hosting its tech fest, Advitiya, on the 16th, 17th, and 18th of February.

Mehul, looking for a vacation, decides to visit Ropar in the month of February. Mehul learned of Advitiya and found out that there are no registration fees — even accommodation is being provided to the participants for free! Team Advitiya is very welcoming, so Mehul definitely wants to attend the fest.

Mehul will visit Ropar on date \( N \) (which is between 1 and 18) of February. Will he be able to enjoy the fest? Print "ADVITIYA" if \( N \) is one of the days on which Advitiya is running, and "WAITING FOR ADVITIYA" otherwise.

## Input Format
The first line contains a single integer \( N \), the date on which Mehul decided to visit Ropar.

## Output Format
Print a single line containing the answer: "ADVITIYA" if Mehul visits on the right date, and "WAITING FOR ADVITIYA" otherwise. Both strings are to be printed without the quotes.

Each character of the output may be printed in either uppercase or lowercase, i.e., the strings ADVITIYA, advitiya, and AdViTiYa will all be treated as equivalent.

## Constraints
    1≤N≤18

## Samples

### Sample 1
**Input**
```
5
```
**Output**
```
WAITING FOR ADVITIYA
```
**Explanation**: Advitiya starts on the 16th, but Mehul is visiting on the 5th which is too early.

### Sample 2
**Input**
```
17
```
**Output**
```
ADVITIYA
```
**Explanation**: Advitiya runs from the 16th to the 18th, so Mehul does get to attend the fest.


### Alogrithm & Logic

1. get day (int)
2. if day == 16 or day == 17 or day == 18 then print "ADVITIYA" 
3. if step 2 is false then  print "WAITING FOR ADVITIYA"

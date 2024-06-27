# Saving Taxes

In Chefland, everyone who earns strictly more than \( Y \) rupees per year has to pay a tax to Chef. Chef has allowed a special scheme where you can invest any amount of money and claim exemption for it.

You have earned \( X \) (\( X > Y \)) rupees this year. Find the minimum amount of money you have to invest so that you don't have to pay taxes this year.

## Input Format
- The first line of input will contain a single integer \( T \), denoting the number of test cases.
- Each test case consists of a single line of input consisting of two space-separated integers \( X \) and \( Y \), denoting the amount you earned and the amount above which you will have to pay taxes.

## Output Format
For each test case, output a single integer, denoting the minimum amount you need to invest.

## Constraints
- \( 1 \leq T \leq 100 \)
- \( 1 \leq Y < X \leq 100 \)

## Sample

### Input
4
4 2
8 7
5 1
2 1

### Output
2
1
4
1

### Explanation
- **Test case 1**: The amount above which you will have to pay taxes is \( 2 \). Since you earn \( 4 \) rupees, you need to invest at least \( 2 \) rupees. After investing \( 2 \) rupees, you will remain with an effective income \( 4 - 2 = 2 \) rupees which will not be taxed.
- **Test case 2**: The amount above which you will have to pay taxes is \( 7 \). Since you earn \( 8 \) rupees, you need to invest at least \( 1 \) rupees.
- **Test case 3**: The amount above which you will have to pay taxes is \( 1 \). Since you earn \( 5 \) rupees, you need to invest at least \( 4 \) rupees.
- **Test case 4**: The amount above which you will have to pay taxes is \( 1 \). Since you earn \( 2 \) rupees, you need to invest at least \( 1 \) rupees.


### Algoirhtm and Logic

 Minimum amount of money you have to invest so that you don't have to pay taxes this year
 if earned > taxable then minimum_amount = earned - taxable

 1. start
 2. get input from the user as a string
 3. split the string to array
 4. convert the array elements to x and y of integer type
 5. if(x > y) then
 6. step 5 true then 
    1. minimum = x - y
    2. print(minimum)
 7. step 5 false then print(0)
const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let test = 0;
let currentTest = 0;

rl.question('Enter the number of test cases: ', (input) => {
    test = parseInt(input);
    console.log(`Enter ${test} pairs of numbers:`);

    rl.on('line', (input) => {
        const stringArray = input.split(' ');
        const x = parseInt(stringArray[0]);
        const y = parseInt(stringArray[1]);
        console.log(x + y);

        currentTest++;
        if (currentTest === test) {
            rl.close(); // Close the readline interface once all test cases are processed
        }
    });
});

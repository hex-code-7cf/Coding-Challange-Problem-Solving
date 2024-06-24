const readline = require('readline');

const rl = readline.createInterface({
    input:process.stdin,
    output:process.stdout
});


rl.question('',(input)=>{
    let stringArray = input.split(" ");
    let x = parseInt(stringArray[0]);
    let y = parseInt(stringArray[1]);
    let result = x * y;
    console.log(result);
    rl.close();
})
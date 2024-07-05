const readline = require('readline');

const rl = readline.createInterface({
    input:process.stdin,
    output:process.stdout
});

rl.question('',(input)=>{
    let stringArray = input.split(" ");
    let total = parseInt(stringArray[0]);
    let attempted = parseInt(stringArray[1]);
    let unattempted = total - attempted;
    console.log(unattempted);
    rl.close();
});
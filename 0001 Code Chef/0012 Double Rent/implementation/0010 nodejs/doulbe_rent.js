const readline = require('readline');

const rl = readline.createInterface({
    input:process.stdin,
    output:process.stdout
});


rl.question('',(input)=>{
    let rent = parseInt(input);
    let double_rent = rent * 2;
    console.log(double_rent);
    rl.close();
})
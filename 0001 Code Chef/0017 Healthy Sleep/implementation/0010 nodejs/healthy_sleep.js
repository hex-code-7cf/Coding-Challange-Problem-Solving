const readline = require('readline');

const rl = readline.createInterface({
    input:process.stdin,
    output:process.stdout
});


rl.question('',(input)=>{
    let sleep = parseInt(input);
    if(sleep == 8){
        console.log("PERFECT");
    }else if (sleep < 8){
        console.log("LESS");
    }else if (sleep > 8){
        console.log("MORE");
    }else{
        console.log("Invalid input");
    }
    rl.close();
})
const readline = require('readline');

const rl = readline.createInterface({
    input:process.stdin,
    output:process.stdout
});


rl.question('',(input) =>{
    day = parseInt(input);
    if(day == 16 || day == 17 || day == 18){
        console.log("ADVITYA");
    }else{
        console.log("WAITING FOR ADVITYA");
    }
    rl.close();
});
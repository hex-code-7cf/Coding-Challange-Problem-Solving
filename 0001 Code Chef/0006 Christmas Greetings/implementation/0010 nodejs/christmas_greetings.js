const readline = require('readline');
const rl = readline.createInterface({
    input:process.stdin,
    output:process.stdout
});


rl.question('',(input)=>{
    day = parseInt(input);
    if(day == 25){
        console.log("CHRISTMAS");
    }else{
        console.log("ORDINARY");
    }
    rl.close();
})
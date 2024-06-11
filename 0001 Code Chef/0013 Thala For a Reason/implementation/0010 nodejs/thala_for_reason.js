const readline = require('readline');

const rl = readline.createInterface({
    input:process.stdin,
    output:process.stdout
});


rl.question('',(input)=>{
    number = parseInt(input);
    if(number == 7){
        console.log("THALA");
    }else{
        console.log("SADGE");
    }
    rl.close();
})
const readline = require('readline');


const rl = readline.createInterface({
    input:process.stdin,
    output:process.stdout
});


rl.question('',(input)=>{
    let day = parseInt(input);
    if(day == 16 || day == 17 || day == 18){
        console.log("ADVITIYA");
    }else{
        console.log("WAITING FOR ADVITIYA");
    }
    rl.close();
})
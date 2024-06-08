const readline = require('readline');

const rl = readline.createInterface({
    input:process.stdin,
    output:process.stdout
});

rl.question('',(input)=>{
    day = parseInt(input);
    if(day == 15){
        console.log("YES");
    }else{
        console.log("NO");
    }
    rl.close()
});
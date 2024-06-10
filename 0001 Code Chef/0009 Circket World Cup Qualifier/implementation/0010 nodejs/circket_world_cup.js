const readline = require('readline');

const rl = readline.createInterface({
    input:process.stdin,
    output:process.stdout
});

rl.question('',(input)=>{
    score = parseInt(input);
    if(score >= 12){
        console.log("YES");
    }else{
        console.log("NO");
    }
    rl.close();
});
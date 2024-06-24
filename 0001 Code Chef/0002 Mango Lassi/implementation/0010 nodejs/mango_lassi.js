const readline = require('readline');

const rl = readline.createInterface({
    input:process.stdin,
    output:process.stdout
});


rl.question('',(input)=>{
    temperature = parseInt(input);
    if(temperature > 35){
        console.log("YES");
    }else{
        console.log("NO");
    }
    rl.close();
})
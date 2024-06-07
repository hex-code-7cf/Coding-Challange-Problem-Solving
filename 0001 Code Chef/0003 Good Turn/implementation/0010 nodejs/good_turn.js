const readline = require('readline');


const rl = readline.createInterface({
    input:process.stdin,
    output:process.stdout
});



rl.question('',(input)=>{
    stringArray = input.split(" ");
    x = parseInt(stringArray[0]);
    y = parseInt(stringArray[1]);
    sumof = x + y
    if(sumof > 6){
        console.log("YES");
    }else{
        console.log("NO");
    }
    rl.close();
})
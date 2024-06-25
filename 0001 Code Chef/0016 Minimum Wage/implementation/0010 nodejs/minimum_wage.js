const readline = require('readline');


const rl = readline.createInterface({
    input:process.stdin,
    output:process.stdout
});


rl.question('',(input)=>{
    let minimum_wage = 11;
    let input_wage = parseInt(input);
    if(input_wage > minimum_wage){
            console.log("YES");
    }else{
        console.log("NO");
    }
    rl.close();
})
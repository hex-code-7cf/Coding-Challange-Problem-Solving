const readline = require('readline');

const rl = readline.createInterface({
    input:process.stdin,
    output:process.stdout
});


rl.question('',(input)=>{
    let test = parseInt(input);
    let count = 0;

    rl.on('line',(input)=>{
        let rank = parseInt(input);
        if(rank >= 1 && rank <= 10){
            console.log("YES");
        }else{
            console.log("NO");
        }
        count = count + 1;
        if(count == test){
            rl.close();
        }
    })
})
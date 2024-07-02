const readline = require('readline');

const rl = readline.createInterface({
    input:process.stdin,
    output:process.stdout
});


rl.question('',(input)=>{
    let test = parseInt(input);
    let count = 1;

    rl.on('line',(input)=>{
        let x = parseInt(input);
        if(x == 6){
            console.log("YES");
        }else{
            console.log("NO");
        }
        if(count == test){
            rl.close();
        }else{
            count = count + 1;
        }
    })
})
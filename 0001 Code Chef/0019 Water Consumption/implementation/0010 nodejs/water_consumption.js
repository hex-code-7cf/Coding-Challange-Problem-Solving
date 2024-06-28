const readline = require('readline');

const rl = readline.createInterface({
    input:process.stdin,
    output:process.stdout
});

rl.question('',(input)=>{
    let test = parseInt(input);
    let count = 0;

    rl.on('line',(input)=>{
        let water = parseInt(input);
        if(water >= 2000){
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
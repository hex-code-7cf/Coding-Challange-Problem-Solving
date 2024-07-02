const readline = require('readline');

const rl = readline.createInterface({
    input:process.stdin,
    output:process.stdout
});

rl.question('',(input)=>{
    let test = parseInt(input);
    let count = 0;

    rl.on('line',(input)=>{
        let distance = parseInt(input);
        let distance_walk_per_day = distance * 2;
        let distance_walk_per_week = distance_walk_per_day * 5;
        console.log(distance_walk_per_week);
        count = count + 1;
        if(count == test){
            rl.close();
        }
    })
})
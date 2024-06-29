const readline = require('readline');

const rl = readline.createInterface({
    input:process.stdin,
    output:process.stdout
});


rl.question('',(input)=>{
    let test = parseInt(input);
    let count = 0;
    rl.on('line',(input)=>{
        string_array = input.split(" ");
        x = parseInt(string_array[0]);
        y = parseInt(string_array[1]);
        total = x * y;
        console.log(total);
        count = count + 1;
        if(count == test){
            rl.close();
        }
    })
})
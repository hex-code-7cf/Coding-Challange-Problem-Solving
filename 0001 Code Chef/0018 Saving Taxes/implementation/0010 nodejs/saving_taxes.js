const readline = require('readline');

const rl = readline.createInterface({
    input:process.stdin,
    output:process.stdout
});

let count = 0;


rl.question('',(input)=>{
    let test = parseInt(input);
    rl.on('line',(input) => {
        let string_array = input.split(" ");
        let x = parseInt(string_array[0]);
        let y = parseInt(string_array[1]);
        if(x > y){
            console.log(x-y);
        }else{
            console.log(0);
        }
        count = count + 1;
        if(count == test){
            rl.close();
        }

    });
});
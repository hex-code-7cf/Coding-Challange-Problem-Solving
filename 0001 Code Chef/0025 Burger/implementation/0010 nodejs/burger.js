const readline = require('readline');

const rl = readline.createInterface({
    input:process.stdin,
    output:process.stdout
});


rl.question('',(input)=>{
    let test = parseInt(input);
    let count = 0;

    rl.on('line',(input)=>{
        let string_array = input.split(" ");
        let a = parseInt(string_array[0]);
        let b = parseInt(string_array[1]);
        if(a > b){
            console.log(b);
        }else{
            console.log(a);
        }
        count = count + 1;
        if(count == test){
            rl.close()
        }
    })
})
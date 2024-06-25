const readline = require('readline');

const rl = readline.createInterface({
    input:process.stdin,
    output:process.stdout
});

rl.question('',(input) =>{
    string_array = input.split(" ");
    let x = parseInt(string_array[0]);
    let y = parseInt(string_array[1]);
    if(x >= 2*y){
        console.log("YES");
    }else{
        console.log("NO");
    }
    rl.close();
})
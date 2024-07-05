<?php
$test = (int) fgets(STDIN);
while($test > 0){
    $string_input = fgets(STDIN);
    $string_array = explode(" ",$string_input);
    $a = (int) $string_array[0];
    $b = (int) $string_array[1];
    if($a > $b){
        echo "$b\n";
    }else{
        echo "$a\n";
    }
    $test = $test - 1;
}

?>
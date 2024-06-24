<?php
$string_input = fgets(STDIN);
$test = (int) $string_input;

while($test > 0){
    $string_input = fgets(STDIN);
    $string_array = explode(" ",$string_input);
    $x = (int) $string_array[0];
    $y = (int) $string_array[1];
    $sum = $x + $y;
    echo "$sum\n";
    $test = $test - 1;
}
?>
<?php
    $string_input = fgets(STDIN);
    $string_array = explode(' ',$string_input);
    $x = (int) $string_array[0];
    $y = (int) $string_array[1];
    if($x >= $y*2){
        echo "YES\n";
    }else{
        echo "NO\n";
    }
?>
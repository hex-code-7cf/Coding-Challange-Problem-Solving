<?php
    $test  = (int) fgets(STDIN);
    while($test > 0){
        $string_input = fgets(STDIN);
        $string_array = explode(" ",$string_input);
        $x = (int) $string_array[0];
        $y = (int) $string_array[1];
        if($x > $y){
            $saving = $x - $y;
            echo "$saving\n";
        }else{
            echo "0\n";
        }
        $test = $test - 1;
    }
?>
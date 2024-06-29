<?php
    $test = (int) fgets(STDIN);
    while($test > 0){
        $stringInput = fgets(STDIN);
        $stringArray = explode(" ",$stringInput);
        $x = (int) $stringArray[0];
        $y = (int) $stringArray[1];
        $total = $x * $y;
        echo "$total\n";
        $test = $test - 1;
    }
?>
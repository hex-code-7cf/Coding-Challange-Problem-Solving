<?php
    $stringInput = fgets(STDIN);
    $stringArray = explode(" ",$stringInput);
    $x = (int) $stringArray[0];
    $y = (int) $stringArray[1];
    $result = $x * $y;
    echo "$result\n";
?>
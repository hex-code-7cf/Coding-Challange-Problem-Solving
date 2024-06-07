<?php
    $stringInput = fgets(STDIN);
    $stringArray = explode(" ",$stringInput);
    $x = (int) $stringArray[0];
    $y = (int) $stringArray[1];
    $sumof = $x + $y;
    if($sumof > 6){
        echo "YES\n";
    }else{
        echo "NO\n";
    }
?>
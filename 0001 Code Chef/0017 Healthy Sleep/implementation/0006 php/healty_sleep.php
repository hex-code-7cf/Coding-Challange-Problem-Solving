<?php
    $sleep = (int) fgets(STDIN);
    if($sleep == 8){
        echo "PERFECT\n";
    }else if($sleep < 8){
        echo "LESS\n";
    }else if($sleep > 8){
        echo "MORE\n";
    }
?>
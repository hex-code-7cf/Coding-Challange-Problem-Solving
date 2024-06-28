<?php
    $test = (int) fgets(STDIN);
    while($test > 0){
        $water = (int) fgets(STDIN);
        if($water >= 2000){
            echo "YES\n";
        }else{
            echo "NO\n";
        }
        $test = $test - 1;
    }
?>
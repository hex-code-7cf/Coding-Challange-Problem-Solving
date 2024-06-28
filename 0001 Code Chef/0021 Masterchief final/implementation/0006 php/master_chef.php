<?php
    $test = (int) fgets(STDIN);
    while($test > 0){
        $rank = (int) fgets(STDIN);
        if($rank <= 10 && $rank >= 1){
            echo "YES\n";
        }else{
            echo "NO\n";
        }
        $test = $test - 1;
    }
?>
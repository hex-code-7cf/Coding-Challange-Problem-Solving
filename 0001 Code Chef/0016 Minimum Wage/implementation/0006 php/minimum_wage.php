<?php
    $minimum_wage = 11;
    $input_wage = (int) fgets(STDIN);
    if($input_wage > $minimum_wage){
        echo "YES\n";
    }else{
        echo "NO\n";
    }
?>
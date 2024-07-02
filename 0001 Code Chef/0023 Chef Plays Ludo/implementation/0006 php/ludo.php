<?php
$test = (int) fgets(STDIN);
while($test > 0){
    $x = (int) fgets(STDIN);
    if($x == 6){
        echo "YES\n";
    }else{
        echo "NO\n";
    }
    $test = $test - 1;
}
?>
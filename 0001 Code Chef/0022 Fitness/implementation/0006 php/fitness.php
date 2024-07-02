<?php
$test = (int) fgets(STDIN);
while($test > 0){
    $distance = (int) fgets(STDIN);
    $distance_walk_per_day = 2 * $distance;
    $distance_walk_per_week = 5 * $distance_walk_per_day;
    echo "$distance_walk_per_week\n";

    $test = $test - 1;
}
?>
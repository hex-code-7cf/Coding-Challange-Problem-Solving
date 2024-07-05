<?php
$string_input = fgets(STDIN);
$string_array = explode(" ",$string_input);
$total = (int) $string_array[0];
$attempted = (int) $string_array[1];
$unattempted= $total - $attempted;
echo "$unattempted\n";

?>
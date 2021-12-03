<?php
require_once "autoload.php";

$part1 = new Part("Wheel",5.00);
$part2 = new Part("Wheel",5.00);

print $part1. "\n";

print Part::getTotalPartCost();
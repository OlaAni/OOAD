<?php

require_once "autoload.php";

$s = new ServiceAppointment();
$s->setDate("11/11/11");
$s->setBooking(BookingType::REPAIR);


print $s;

print "\n===================================================================";

$part1 = new Part("Wheel", 5.00);
$part2 = new Part("Spoiler", 50.00);
$mechanic1 = new Mechanic();
$mechanic1->setId("M550");

print $part1 ." installed by ". $mechanic1->getId();
print $part2 ." installed by ". $mechanic1->getId();


print Part::getTotalPartCost();

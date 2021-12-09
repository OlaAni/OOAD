<?php

require_once "src/autoload.php";

print "\n======================<--Car Object-->=========================================";

print "\n======================<--Customer Object-->=========================================";
$customer1 = new Customer();
$customer1->setName("Jim Doe");

print "\n======================<--Mechanic + HeadMechanic Object-->=========================================";

$mechanic1 = new Mechanic("John Doe",3243232,JobType::MECHANIC);
$headMechanic = new HeadMechanic("Jane Doe",3243232,JobType::HEAD_MECHANIC);

$mechanic1->setId("M550");
$headMechanic->setId("HM11");


print $mechanic1;
print $headMechanic;


print "\n======================<--ServiceAppoinment Object-->=========================================";

$serviceAppointment = new ServiceAppointment();
$serviceAppointment->setDate("11/11/11");
$serviceAppointment->setBooking(BookingType::REPAIR);


print $serviceAppointment;

print "\n======================<--Part Object-->=========================================";
$part1 = new Part("Wheel", 5.00);
$part2 = new Part("Spoiler", 50.00);

print $part1 ." installed by ". $mechanic1->getId();
print $part2 ." installed by ". $headMechanic->getId();


print Part::getTotalPartCost();
Part::setTotalPartCost();

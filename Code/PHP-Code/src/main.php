<?php

require_once "autoload.php";

print "\n======================<--Car Object-->=========================================";
$car1 = new Car();
$car1->setMake("Bently");
$car1->setRegistration("AC021");
$car1->setYear(2001);
$car2 = new Car();
$car2->setMake("Ford");
$car2->setRegistration("BC987");
$car2->setYear(2014);

print "\n======================<--Customer Object-->=========================================";
$customer1 = new Customer();
$customer1->setName("Jim Doe");
$customer2 = new Customer();
$customer2->setName("Bob Johnson");


print "\n======================<--ServiceAppoinment Object-->=========================================\n";

$serviceAppointment1 = new ServiceAppointment();
$serviceAppointment1->setDate("11/11/11");
$serviceAppointment1->setBooking(BookingType::REPAIR);
$serviceAppointment1->setCar($car1);
$serviceAppointment1->setCustomer($customer1);

$serviceAppointment2 = new ServiceAppointment();
$serviceAppointment2->setDate("12/12/12");
$serviceAppointment2->setBooking(BookingType::INSPECTION);
$serviceAppointment2->setCar($car2);
$serviceAppointment2->setCustomer($customer2);


print $serviceAppointment1;
print $serviceAppointment2;


print "\n======================<--Mechanic + HeadMechanic Object-->=========================================";

$mechanic1 = new Mechanic("John Doe",3243232,JobType::MECHANIC);
$mechanic1->setId("M550");
$headMechanic = new HeadMechanic("Jane Doe",3243232,JobType::HEAD_MECHANIC);
$headMechanic->setId("HM11");



$mechanic1->setServiceAppointment($serviceAppointment1);
$headMechanic->setServiceAppointment($serviceAppointment1);

print $mechanic1;
print $headMechanic;

print $mechanic1->viewCarDetails();
print $headMechanic->viewCarDetails();
print "\n======================<--Part Object-->=========================================";
$part1 = new Part("Wheel", 5.00,$serviceAppointment1);
$part2 = new Part("Spoiler", 50.00,$serviceAppointment1);

print $part1 ." installed by ". $mechanic1->getId();
print $part2 ." installed by ". $headMechanic->getId();


print Part::getTotalPartCost();
Part::setTotalPartCost();

<?php

require_once "ServiceAppointment.php";
require_once "BookingType.php";

$s = new ServiceAppointment();
$s->setDate("11/11/11");
$s->setBooking(BookingType::REPAIR);

print $s;


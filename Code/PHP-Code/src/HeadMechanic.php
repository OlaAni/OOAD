<?php
require_once "autoload.php";
class HeadMechanic extends  Mechanic {
    public static float $sales = 0;

    public function __construct(string $name, int $phoneNumber, JobType $job)
    {
        parent::__construct($name, $phoneNumber, $job);
    }

    public function __toString(): string
    {
        return parent::__toString();
    }
}
<?php
require_once "autoload.php";
class Mechanic extends Person {

    private String $id;
    private JobType $job;

    //private array ServiceAppointment $serviceAppointment;
    private $serviceAppointments = array();

    public function __construct(String $name, int $phoneNumber, JobType $job)
    {
        $this->setName($name);
        $this->setPhoneNumber($phoneNumber);
        $this->job = $job;
    }

    public function getId(): string
    {
        return $this->id;
    }

    public function setId(string $id): void
    {
        $this->id = $id;
    }

    public function setJob(JobType $job): void
    {
        $this->job = $job;
    }

    public function getJob(): JobType
    {
        return $this->job;
    }

    public function setServiceAppointment(ServiceAppointment $serviceAppointment): void
    {
        $this->serviceAppointment = $serviceAppointment;
    }

    public function viewCarDetails(): String
    {
        $temp = "";
        foreach ($this->serviceAppointments as $serviceAppointment) {
            $temp .= $serviceAppointment->getCar() . " // ";

        }
        return $temp;
    }


    public function __toString(): string
    {
        return "\n".$this->job->name." name is ". $this->getName(). " and phonenumber is ".$this->getPhoneNumber().". ID number is ". $this->id."\n";
    }

}
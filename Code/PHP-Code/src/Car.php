<?php
class Car{
    private String $make;
    private int $year;
    private String $registration;

    public function getYear(): int
    {
        return $this->year;
    }

    public function getMake(): string
    {
        return $this->make;
    }

    public function getRegistration(): string
    {
        return $this->registration;
    }

    public function setYear(int $year): void
    {
        $this->year = $year;
    }

    public function setMake(string $make): void
    {
        $this->make = $make;
    }

    public function setRegistration(string $registration): void
    {
        $this->registration = $registration;
    }

    public function __toString(): string
    {
        return "Car \n".$this->registration." Year: ".$this->year ." Make: ".$this->make;
    }
}
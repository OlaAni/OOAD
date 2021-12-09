<?php
abstract class Person{
    private String $name;
    private int $phoneNumber;

    public function getName(): string
    {
        return $this->name;
    }

    public function getPhoneNumber(): int
    {
        return $this->phoneNumber;
    }

    public function setName(string $name): void
    {
        $this->name = $name;
    }

    public function setPhoneNumber(int $phoneNumber): void
    {
        $this->phoneNumber = $phoneNumber;
    }


}
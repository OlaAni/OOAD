<?php
class Mechanic{

    private String $id;

    public function getId(): string
    {
        return $this->id;
    }

    public function setId(string $id): void
    {
        $this->id = $id;
    }

    public function viewCarDetails(): void
    {

    }

}
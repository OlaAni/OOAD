<?php
class Part{

    private String $part;
    private float $price;
    private int $id;

    public static float $totalPartCost = 0;

    public function __construct(String $part, float $price )
    {
        $this->part = $part;
        $this->price = $price;

        self::$totalPartCost += $price;

    }

    public function setId(int $id): void
    {
        $this->id = $id;
    }


    public function setPart(string $part): void
    {
        $this->part = $part;
    }

    public function setPrice(float $price): void
    {
        $this->price = $price;
    }

    public function getId(): int
    {
        return $this->id;
    }


    public function getPart(): string
    {
        return $this->part;
    }


    public function getPrice(): float
    {
        return $this->price;
    }

    public static function getTotalPartCost(): float|String
    {
        return "\nTotal part cost is = ". self::$totalPartCost;
    }

    public static function setTotalPartCost(): void
    {
        self::$totalPartCost = 0;
    }

    public function __toString(): string
    {
        return "\n".$this->part . " = " .$this->price;
    }


}
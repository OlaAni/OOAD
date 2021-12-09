<?php

require_once "BookingType.php";

class ServiceAppointment{
    private string $date;
    private string $time;
    private BookingType $booking;
    private PaymentRecievedType $paid;
    private bool $destroy;
    private float $cost;

    public function getPaid(): PaymentRecievedType
    {
        return $this->paid;
    }

    public function setPaid(PaymentRecievedType $paid): void
    {
        $this->paid = $paid;
    }

    public function isDestroy(): bool
    {
        return $this->destroy;
    }

    public function setDestroy(bool $destroy): void
    {
        $this->destroy = $destroy;
    }

    public function getCost(): float
    {
        return $this->cost;
    }

    public function setCost(float $cost): void
    {
        $this->cost = $cost;
    }

    public function getStatus(): CarStatusType
    {
        return $this->status;
    }

    public function setStatus(CarStatusType $status): void
    {
        $this->status = $status;
    }
    private CarStatusType $status;

    public function getDate(): string
    {
        return $this->date;
    }

    public function setDate(string $date): void
    {
        $this->date = $date;
    }

    public function getTime(): string
    {
        return $this->time;
    }

    public function setTime(string $time): void
    {
        $this->time = $time;
    }

    public function getBooking(): BookingType
    {
        return $this->booking;
    }

    public function setBooking(BookingType $booking): void
    {
        $this->booking = $booking;
    }

    public function __toString()
    {
        return "Appointment date: ". $this->date . " Appointment type: " . $this->booking->name;
    }


}
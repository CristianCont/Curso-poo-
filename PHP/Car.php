<?php
require_once('Account.php')
class Car{
    public $id ;
    public $license;
    public $Drive;
    public $Passenger;
    public function __construct($license,$Drive){
        $this->license=$license;
        $this->Drive=$Drive;
    }
    public function PrintDataCar(){
        echo "License: $this->license Driver:" .$this->Drive->neme
        
    }
}

?>
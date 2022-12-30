<?php
require_once('Account.php');
class Car{
    public $id ;
    public $license;
    public $Drive;
    protected $passenger;
    public function __construct($license,$Drive){
        $this->license=$license;
        $this->Drive=$Drive;
    }
    public function PrintDataCar(){
        echo "
        Licencia: $this->license 
        Driver: {$this->driver->name} 
        Número de pasajeros: $this->passenger;
        
    }
    public function getPassenger(){
        return $this->Passenger;
    }
    public function setPassenger($passenger) {
        
        if ($passenger == 4) {
            $this->passenger = $passenger;
        }
        else {
            echo "Necesitas asignar 4 pasajeros";
        }
    
    }
}

?>
<?php
require_once('Car.php');
class UberVan extends Car{
    public $tipecarAccepted;
    public $seatsMaterial;
    public function __construct($license,$Drive,$tipecarAccepted,$seatsMaterial){
        parent::__construct($license,$Drive);        
        $this->tipecarAccepted=$tipecarAccepted;
        $this->seatsMaterial=$seatsMaterial;
    }  
  }
?>
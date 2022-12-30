<?php
require_once('Car.php');
class UberX extends Car{
    public $Brand;
    public $Model;
    public function __construct($license,$Drive,$Brand,$Model){
        parent::__construct($license,$Drive);        
        $this->Brand=$Brand;
        $this->Model=$Model;
    }  
    public function PrintDataCar(){
      parent::PrintDataCar();
      echo" 
      Modelo: $this->model
      Marca: $this->brand 
      ";
    }
  }
?>
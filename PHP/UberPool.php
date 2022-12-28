<?php
require_once('Car.php');
class UberPool extends Car{
    public $Brand;
    public $Model;
    public function __construct($license,$Drive,$Brand,$Model){
        parent::__construct($license,$Drive);        
        $this->Brand=$Brand;
        $this->Model=$Model;
    }  
  }
?>
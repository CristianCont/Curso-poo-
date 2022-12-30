<?php
require_once('Payment.php');
class Paypal extends Payment{
    public $Email;
    public function __construct($id,$Email){
        parent::__construct($id);
        $this->Email=$Email;
       
    }
}

?>
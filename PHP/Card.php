<?php
require_once('Payment.php');
class Card extends Payment{
    public $Number;
    public $Cvv;
    public $Data;
    public function __construct($id,$Number,$Cvv,$Data){
        parent::__construct($id);
        $this->Number=$Number;
        $this->Cvv=$Cvv;
        $this->Data=$Data;
    }
}

?>
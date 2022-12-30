<?php

class Account{
    public $id= integer;
    public $name = string;
    public $document =string;
    public $Email =string;
    public $Password =string;

    public function __construct($name,$document){
        $this->name=$name;
        $this->document=$document;
    }
    
}
?>
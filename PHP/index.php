<?php
require_once('Car.php');
require_once('Account.php');

$car=new Car("Asd455", new Account ("Marywxi","1231648979"));
$car->PrintDataCar();
?>
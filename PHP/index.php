<?php
require_once('Car.php');
require_once('Account.php');
require_once('UberX.php');
require_once('UberPool.php');
require_once('UberVan.php');
$uberX=new UberX("srg789", new Account("Andres Matilla","4974949"),"Chevrolet", "Spark gt");
$uberX->PrintDataCar();

$uberPool=new UberPool("164gtr",new Account("Camilo Sexto","164984949"),"Chevrolet","Corsa");
$uberPool->PrintDataCar();

$ubervan= new UberVan("162gdr",new Account("Cristian Sexto","1649214949"),"Chevrolet","Comaro");
$ubervan->setPassenger(6);
$ubervan->PrintDataCar();

?>
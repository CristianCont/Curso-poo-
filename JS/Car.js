function Car(license,Drive){
    this.id;
    this.license=license;
    this.Drive=Drive;
    this.Passenger;

}

Car.prototype.printDataCar = function(){
    console.log(this.Drive)
    console.log(this.Drive.name)
    console.log(this.Drive.document)
    console.log(this.license)
}
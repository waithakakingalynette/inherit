fun main() {
     var car=Car("box","matatu","silver",14)
   car.carry(4)
    car.identity("black","benz","maybach")
    println(car.calculateParkingFees(6))

    var bus=Bus("bus","scannier","blue",44)
  println(bus.maxTripFare(500.00,))
    println(bus.calculateParkingFees(6))
}

//1. Create a class Car with the following attributes: make, model, color, capacity.
//It has these functions:
//- carry(people: Int) : Prints out “Carrying $people passengers” if the
//number of people is within its capacity else it prints out “Over capacity
//by $x people” where x is the number of people exceeding its capacity
//- identity() : Prints out the color, make and model in the following
//format e.g: “I am a white subaru legacy”
//- calculateParkingFees(hours: Int) : Calculates and returns the
//parking fees by multiplying the hours by 20

 open class Car(var make:String, var model:String,var color:String,var capacity:Int){


    fun carry(people:Int){
      var word="Carrying $capacity people passengers"
        println(word)

        if(word.equals(capacity)){
            println("Carrying $capacity people passengers")
        }else
            println("Over capacity by $people people")

    }
   fun identity(color: String, make: String,model: String):String{
       var stmt="i am black benz maybach"
    println(stmt)
       return stmt
   }

    open fun calculateParkingFees(hours:Int):Int{
      var parkingFees=hours*20
         return parkingFees
     }
}


//2. Create a class Bus with the same attributes and functions as the Car class.
//In addition, it has another method called maxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per
//trip.
//The bus’ calculateParkingFees method returns the product of hours and
//the capacity of the bus
class Bus ( make:String, model:String,color:String, capacity:Int):Car(make, model, color, capacity){
    fun maxTripFare(fare:Double):Double{
      var  maxAmount=fare*capacity
        return maxAmount
    }

    override fun calculateParkingFees(hours: Int): Int {
//        return super.calculateParkingFees(hours)
      var  product=hours*capacity
        return product
    }
}
fun main(){
    var weight : Double = 0.00
    var height : Double = 0.00
    var bodyMassIndex : Double = 0.00

    println("Enter your weight (in kg): ")
    weight = readln().toDouble()
    println("Enter your height (in kg): ")
    height = readln().toDouble()

    bodyMassIndex = String.format("%.2f",weight / (height*height)).toDouble()
    //println(bodyMassIndex) //for debugging only

    if(bodyMassIndex <=18.5){
        println("Your BMI is $bodyMassIndex, which is in the underweight range")
    }
    else if(bodyMassIndex <=24.9){
        println("Your BMI is $bodyMassIndex, which is in the normal weight range")
    }
    else if(bodyMassIndex <=29.9){
        println("Your BMI is $bodyMassIndex, which is in the overweight range")
    }
    else if(bodyMassIndex > 30){
        println("Your BMI is $bodyMassIndex, which is in the obese range")
    }else{
        println("BMI result unknown")
    }

}
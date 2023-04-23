package practiceactivities

fun main(){
    var option:String = "Repeat"
    var menu: String =""
    var temperature : Double =0.0
    var celsius : Double = 0.0
    var fahrenheit : Double = 0.0

    do{
        println("Main Menu")
        println("a. Celsius to Fahrenheit")
        println("b. Fahrenheit to Celsius")
        println("c. Exit")
        println("Choose option [a, b or c]: ")
        menu = readln()

        when (menu){
            'a'.toString() ->{
                println("Celsius - Fahrenheit Conversion")
                print("Enter Celsius: ")
                temperature= readln().toDouble()
                fahrenheit = (temperature*9/5)+32
                println("Fahrenheit equivalent is ${String.format("%.2f",fahrenheit)}")
                //option = "Repeat"
            }
            'b'.toString() ->{
                println("Fahrenheit - Celsius Conversion")
                print("Enter Fahrenheit: ")
                temperature= readln().toDouble()
                celsius = (temperature-32)*5/9
                println("Fahrenheit equivalent is ${String.format("%.2f",celsius)}")
                //option = "Repeat"
            }
            'c'.toString() ->{
                print("End of program. Good bye!")
                option = "Exit"
            }
            else->{
                //option = "Repeat"
                continue
            }
        }
        println()

    }while(option!="Exit")
}
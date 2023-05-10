package kotlinoop.kotlinoop2

import java.time.temporal.TemporalAmount

class MobilePhone(var load:Int) {//constructor
    //load
    //textMessageCount
    var messageLogs = mutableListOf<String>()
    var textMessageCount: Int = 0

    fun sendTextMessage (message:String){
        load--
        textMessageCount++
        println("Message Sent!")
        messageLogs.add("Message: $message, ${System.currentTimeMillis()}")
    }
    fun load (amount: Int){
        load +=amount
        println("Loaded Successfully")
    }

    fun checkBalance(){
        println("Your account balance is $load")
    }
    fun displayLogs(){
        println("Number of text messages sent: $textMessageCount")
        println(messageLogs)
    }
}
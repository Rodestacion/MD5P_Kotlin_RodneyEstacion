import kotlinoop.kotlinoop2.MobilePhone

fun main(){
    var myPhone = MobilePhone(10)
    myPhone.checkBalance()
    myPhone.load(30)
    myPhone.checkBalance()
    myPhone.sendTextMessage("Wer na u?")
    myPhone.sendTextMessage("D2 na me")
    myPhone.checkBalance()
    myPhone.displayLogs()
}
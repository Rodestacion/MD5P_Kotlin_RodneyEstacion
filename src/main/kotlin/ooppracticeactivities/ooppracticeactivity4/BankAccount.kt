package ooppracticeactivities.ooppracticeactivity4

class BankAccount (var accountNumber:String,var balance:Double){

    fun deposit(amount:Double){

        println("Account: $accountNumber")
        println("Current Balance: $balance")
        println("Deposit Amount: $amount")

        balance +=amount

        println("Deposit Transaction successful!")
        println("New Balance: $balance")
        println("Transaction code: ${"DPT"+System.currentTimeMillis()}\n")
    }

    fun withdraw(amount:Double){

        if(amount>balance){
            println("Account: $accountNumber")
            println("Current Balance: $balance")
            println("Withdrawal  Amount: $amount")
            println("Withdrawal Transaction Failed!")
            println("Sorry Insufficient fund!")
            println("Balance: $balance \n")
        }else{
            println("Account: $accountNumber")
            println("Current Balance: $balance")
            println("Deposit Amount: $amount")
            balance -= amount
            println("Withdrawal Transaction successful!")
            println("New Balance: $balance")
            println("Transaction code: ${"WD"+System.currentTimeMillis()}\n")
        }

    }
}
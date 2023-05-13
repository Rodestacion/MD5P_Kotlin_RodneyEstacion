package ooppracticeactivities.ooppracticeactivity10

class BankAccount {

    var account : String
    var balance : Double

    //primary
    constructor(account:String){
        this.account = account
        this.balance = 30813.27
    }

    //secondary constructor
    constructor(account:String,balance:Double){
        this.account = account
        this.balance = balance
    }
}
package ooppracticeactivities.ooppracticeactivity7

class Person {
    var name : String
    var age : Int

    //primary constructor
    constructor(name:String){
        this.name = name
        age = 25
    }

    //secondary constructor
    constructor(name:String, age:Int){
        this.name = name
        this.age = age
    }
}
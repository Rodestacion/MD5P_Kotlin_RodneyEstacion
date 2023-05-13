package ooppracticeactivities.ooppracticeactivity8

class Date {
    var day : Int
    var month : Int
    var year : Int

    //primary
    constructor(){
        day = 25
        month = 12
        year = 2023
    }

    //secondary constructor
    constructor(day:Int, month:Int, year:Int){
        this.day = day
        this.month = month
        this.year = year
    }
}
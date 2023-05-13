package ooppracticeactivities.ooppracticeactivity9

class Car {
    var maker : String
    var model : String
    var year : Int

    //primary
    constructor(maker:String, model:String){
        this.maker = maker
        this.model = model
        year = 2023
    }

    //secondary constructor
    constructor(maker:String, model:String, year:Int){
        this.maker = maker
        this.model = model
        this.year = year
    }
}
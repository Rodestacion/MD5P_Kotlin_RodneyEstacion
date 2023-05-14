package ooppracticeactivities.activity04a

class Student {
    private var lastName= mutableListOf<String>("Stewart","Stefford","Armstrong","Parker","Shelton")
    private var firstName= mutableListOf<String>("Laurel","Rachel","Kimberly","Ashley","Aidan")
    private var nickName= mutableListOf<String>("Lowri","Shelley","Kim","Ash","Ai")
    private var middleName= mutableListOf<String>("Rogers","Graham","Meyer","Jackson","Armstrong")
    private var id = mutableListOf<String>("0001","0002","0003","0004","0005",)
    private var year = mutableListOf<Int>(2022,2023,2021,2005,2010)

    constructor(lastName:String,firstName:String,middleName:String){
        val search = mutableListOf<Int>()

        if(this.lastName.contains(lastName)){
            search.add(this.lastName.indexOf(lastName))
            if(this.firstName.contains(firstName)){
                search.add(this.firstName.indexOf(firstName))
                if(this.middleName.contains(middleName)){
                    search.add(this.middleName.indexOf(middleName))
                    val matchNumber =search.toSet() //get the unique number

                    if(matchNumber.size==1){
                        displayDetail(matchNumber.elementAt(0))
                    }else{
                        noSearchDetail(lastName,firstName,middleName)
                    }
                }
                else{
                    noSearchDetail(lastName,firstName,middleName)
                }
            }
            else{
                noSearchDetail(lastName,firstName,middleName)
            }
        }else{
            noSearchDetail(lastName,firstName,middleName)
        }
    }

    constructor(searchName:String){
        var searchCounter: Int = 0
        repeat(this.lastName.size){
            if(this.lastName.elementAt(it).contains(searchName)){
                displayDetail(it)
                searchCounter++
            }
        }

        repeat(this.firstName.size){
            if(this.firstName.elementAt(it).contains(searchName)){
                displayDetail(it)
                searchCounter++
            }
        }

        repeat(this.middleName.size){
            if(this.middleName.elementAt(it).contains(searchName)){
                displayDetail(it)
                searchCounter++
            }
        }

        if(searchCounter == 0){
            println("Name $searchName cannot found in the list")
            println()
        }

    }

    private fun displayDetail(num:Int){
        println("Student ID: ${this.id.elementAt(num)}")
        println("Last Name: ${this.lastName.elementAt(num)}")
        println("First Name: ${this.firstName.elementAt(num)} (a.k.a. ${this.nickName.elementAt(num)})")
        println("Middle Name: ${this.middleName.elementAt(num)}")
        println("Year Enrolled: ${this.year.elementAt(num)}")
        println()
    }
    private fun noSearchDetail(lastName:String,firstName:String,middleName:String){
        println("Student $lastName, $firstName $middleName is not on the list")
        println()
    }
}
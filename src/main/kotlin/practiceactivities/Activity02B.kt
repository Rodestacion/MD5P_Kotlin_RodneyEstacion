package practiceactivities
fun main(){
    //Implement Activity 01 -  B using data structure.

    var bookInformation = mutableListOf(
        mutableListOf<String>("600-CB050-010"),             //libraryCode
        mutableListOf<String>("Microsoft ADO.NET 2.0"),     //bookName
        mutableListOf<String>("Rebecca M. Riordan"),        //bookAuthor
        mutableListOf<String>("600"),                       //deweyClassification
        mutableListOf<String>("Microsoft Press"),           //bookPublisher
        mutableListOf<String>("5th Edition"),               //edition
        mutableListOf<Int>(10)                              //itemQuantity
    )

    var newspaperInformation = mutableListOf(
        mutableListOf<String>("Manila Bulletin"),   //newspaperName
        mutableListOf<String>("Manila Bulletin"),   //newspaperPublisher
        mutableListOf<String>("2023/04/12")         //printDate
    )

    var magazineInformation = mutableListOf(
        mutableListOf<String>("Liwayway"),          //magazineName
        mutableListOf<String>("Manila Bulletin"),   //magazinePublisher
        mutableListOf<Int>(2023),                   //publishedYear
        mutableListOf<Int>(604),                    //volume
        mutableListOf<String>("CB001")              //cabinetLocation
    )

    var thesisInformation = mutableListOf(
        mutableListOf<String>("Foods for Health: Personalized Food and Nutritional Metabolic Profiling to Improve Health"),          //thesisTitle
        mutableListOf<String>("Juan Dela Cruz"),        //thesisCreatorName
        mutableListOf<String>("BSN"),                   //thesisDepartment
        mutableListOf<Int>(2015),                       //thesisYearCreated
        mutableListOf<String>("BS0047")                 //shelfLocation
    )

}
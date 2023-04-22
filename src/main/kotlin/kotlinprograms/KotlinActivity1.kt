package kotlinprograms

fun main(){
    //Application Detail
    var positionApplying:String ="Android Developer"
    var desireSalary: Double = 40000.00
    var dateAvailable: String ="09/14/2023"

    //Personal Information
    var lastName:String ="Dela Cruz"
    var firstName:String ="Juan"
    var middleName:String ="Gomez"
    var homeAddress:String ="San Rafael III"
    var homeCity:String ="Noveleta"
    var homeState:String ="Cavite"
    var homeZipCode:Int = 4105
    var homePhone:String = "(082) 123 1234"
    var cellPhone:String ="0915 123 1234"
    var emailAddress: String ="juan.cruz@outlook.com"
    var socialSecurityNumber: String ="013281356836"
    var usCitizen: String = "No"
    var convictedFelony: String = "No"
    var preEmploymentDrugTest: String = "Yes"

    //Education
    var schoolName:String ="Batangas State University"
    var schoolLocation:String ="Nasugbu, Batangas"
    var yearsAttended:String ="2007"
    var degreeReceived: String ="Bachelor"
    var courseMajor:String ="Computer Engineering"

    //Employment
    var employer:String ="San Technology"
    var dateEmployedStart:String ="10/10/2012"
    var dateEmployedEnd:String ="08/15/2015"
    var workPhone:String ="(043) 123 5678"
    var payRate1:Double =25000.00
    var workAddress:String ="CEPZA Phase II"
    var workCity:String ="Rosario"
    var workState:String ="Cavite"
    var workZipCode:Int =4103
    var workPosition:String ="Technical Engineer"
    var workDuties:String ="Production Machine set-up and maintenance"
    var supervisorName:String ="Marvin Agustin"
    var supervisorTitle:String ="Senior Supervisor"
    var reasonLeaving:String ="low income due to low production operation"
    var contactThem:String = "Yes"

    //References
    var referenceName:String ="Marvin"
    var titleReference:String ="Senior Supervisor"
    var companyReference:String ="Yu Jin Optical Electronic"
    var phoneReference:String ="(043) 123 5678"

    //Acknowledgement And Authorization
    var certifyAnswer:Boolean = true
    var authorizeInvestigation:Boolean = true
    var employmentDischarge:Boolean = true
    var signature:String = "Juan Dela Cruz"
    var dateSigned:String = "04/11/23"

    
    //Display Output
    //Application Detail
    println("\nApplication for Employment")
    println("Position You Are Applying For: $positionApplying")
    println("Desired Salary: $desireSalary")
    println("Date Available for Work: $dateAvailable")

    //Personal Information
    println("\nPersonal Information")
    println("Last Name: $lastName")
    println("First Name: $firstName")
    println("Middle Name: $middleName")
    println("Address: $homeAddress")
    println("City: $homeCity")
    println("State: $homeState")
    println("Zip: $homeZipCode")
    println("Home Phone: $homePhone")
    println("Cell Phone: $cellPhone")
    println("Email Address: $emailAddress")
    println("Social Security Number: $socialSecurityNumber")
    println("Are you a U.S. Citizen?: $usCitizen")
    println("Have you ever convicted of a felony?: $convictedFelony")
    println("If selected for employment are you willing to submit to a pre-employment drug screening test?: $preEmploymentDrugTest")

    //Education
    println("\nEducation")
    println("School Name: $schoolName")
    println("Location: $schoolLocation")
    println("Years Attended: $yearsAttended")
    println("Degree Received: $degreeReceived")
    println("Major: $courseMajor")

    //Employment
    println("\nEmployment")
    println("Employer: $employer")
    print("Date Employed: $dateEmployedStart")
    println(" to $dateEmployedEnd")
    println("Work Phone: $workPhone")
    println("Pay Rate: $ $payRate1 ")
    println("Address: $workAddress")
    println("City: $workCity")
    println("State: $workState")
    println("Zip: $workZipCode")
    println("Position: $workPosition")
    println("Duties Performed: $workDuties")
    print("Supervisors Name and Title: $supervisorName ")
    println("/: $supervisorTitle")
    println("Reason for leaving: $reasonLeaving")
    println("May we contact them?: $contactThem")

    //References
    println("\nReferences")
    println("Name: $referenceName")
    println("Title: $titleReference")
    println("Company: $companyReference")
    println("Phone: $phoneReference")

    //Acknowledgement And Authorization
    println("\nAcknowledgement And Authorization")
    println("I certify that all answers given herein are true and complete to the best of my knowledge: $certifyAnswer")
    println("I authorize investigation of all statements contained in this application for employment as may be necessary in arriving at an employment: $authorizeInvestigation")
    println("In the event of employment, I understand that false or misleading information given in my application or interview(s) may result in discharge: $employmentDischarge")
    println("\nSignature of Applicant: $signature")
    println("Date: $dateSigned")

}
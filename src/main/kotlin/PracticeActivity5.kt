fun main(){
    //initialize
    var studentName : String = "no name"
    var unitsEnrolled : Int = 0
    var pricePerUnit : Double = 0.00
    var tuitionFee : Double = 0.00
    var paymentCash : Double = 0.00
    var paymentInstallment2 : Double = 0.00
    var paymentInstallment3 : Double = 0.00


    //input
    println("Enter Name of student: ")
    studentName = readln()
    println("Enter number of units enrolled: ")
    unitsEnrolled = readln().toInt()
    println("Enter price per unit: ")
    pricePerUnit = readln().toDouble()

    //process
    tuitionFee = unitsEnrolled * pricePerUnit
    paymentCash = tuitionFee-(tuitionFee * 0.1)
    paymentInstallment2 = tuitionFee+(tuitionFee * 0.05)
    paymentInstallment3 = tuitionFee+(tuitionFee * 0.10)

    //output
    println("Student Name: $studentName")
    println("Number of units enrolled: $unitsEnrolled")
    println("Price per unit: $pricePerUnit")

    println("\n$studentName, you could available the following payment mode")
    println("Computed Tuition fee: ${String.format("%.2f",tuitionFee)} dollars")
    println("Payment Mode:")
    println("Cash payment: ${String.format("%.2f",paymentCash)} dollars")
    println("2-installment: ${String.format("%.2f",paymentInstallment2)} dollars")
    println("3-installment: ${String.format("%.2f",paymentInstallment3)} dollars")
}
package onlinebookstore

class Customer(private val name: String,private val email: String) :User(name, email),Discountable {

    override fun applyDiscount() {
        println("Applying 5% discount for customer ${this.name}")
    }
}
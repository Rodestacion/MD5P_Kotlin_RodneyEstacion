package onlinebookstore

class FictionCategory(private val name:String):Category(name),Discountable {
    override fun displayCategory() {
        println("Category: ${this.name}")
    }

    override fun applyDiscount() {
        println("Applying 10% discount for ${this.name} category")
    }

}
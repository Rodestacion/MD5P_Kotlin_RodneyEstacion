package kotlinoop.kotlinoop7

class Outer {
    //nested class
    //in a nested class, the inner class cannot
    // access the properties and behaviors of the
    //Outer class

    val outerClassName = "Outer name"

    class Inner{
        fun callOuter(){
            println("Not possible")
        }
    }


}
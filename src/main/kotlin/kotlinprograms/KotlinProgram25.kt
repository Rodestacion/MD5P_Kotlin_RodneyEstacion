package kotlinprograms

fun main(){
    var setA = setOf(1,2,3,4,5)
    var setB = setOf(4,5,6,7,8)
    
    //union
    var unionSet = setA.union(setB)
    println("Union - $unionSet")

    //intersection
    var intersectSet = setA.intersect(setB)
    println("Intersection - $intersectSet")

    //difference
    var diffSet = setA.subtract(setB)
    println("Difference of Set A from Set B is $diffSet")

    var diffSet2 = setB.subtract(setA)
    println("Difference of Set B from Set A is $diffSet2")

    //symmetric difference
    println("Symmetric difference ${diffSet.union(diffSet2)}")
}
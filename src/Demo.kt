
data class Student( val name :String,val age: Int )

fun main(args: Array<String>) {
   val s = Student("Vaibhav Mojidra",23)
   val (name,age) = s
   println("Name: $name and Age: $age")
}

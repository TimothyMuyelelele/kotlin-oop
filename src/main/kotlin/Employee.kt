class employee {
    //Constuctor Declaration of class
    var name=""
    var age:Int=0
    var salary:Double=0.toDouble()

    fun insertvalues (n:String,a:Int,s:Double) {
        name = n
        age = a
        salary = s

        println("My name is : $name")
        println("My age is : $age")
        println("My salary is : $salary")
    }
}

// https://developer.android.com/courses/android-basics-kotlin/unit-1?hl=ko
// Introduction to Kotlin

fun main() {  //코틀린에서의 함수 선언은 fun functionName(){}

    val age = 5 * 365 //변수를 선언할 땐 val variableName
    val name = "Rover"

    println("Happy Birthday, ${name}!")

    // Let's print a cake!
    val cake_part = "@"
    val timesToRpt = 11
    println("   ,,,,,   ")
    println("   |||||   ")
    println(" =========")
    printcakeline(cake_part, timesToRpt)
    println("{~@~@~@~@~}")
    printcakeline(cake_part, timesToRpt)

    // This prints an empty line.
    println("")

    println("You are already ${age} days old, ${name}!")
    println("${age} days old is the very best age to celebrate!")
}

fun printcakeline(cake_part: String, timesToRpt: Int) {  //인수 설정 필수 !
  //인수명(cake_part), 인수의 종류나 유형(String)
  repeat(timesToRpt) {
    print(cake_part)
  }
  println() // == print("\n") 의미가 동일함.
  //println과 print의 차이는 string이 끝난 후 다음 줄로 넘기는지 안넘기는지 차이
  //println은 다음 줄로 넘기고, print는 \n과 같은 escape string을 사용하지 않는 경우
  //다음줄로 넘기지 않음.
}

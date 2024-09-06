package org.example


fun getSumOfFirstAndLastDigits(number: String) : Int {
    val firstDigit  = number.first().digitToInt()
    val lastDigit = number.last().digitToInt()
    return firstDigit + lastDigit
}

fun sumOfInputtedNumbers() : Int {
    var sumOfUserNumbers = 0
    do {
        val userInput = readln()
        sumOfUserNumbers += userInput.toInt()
    } while (userInput != "0")

    return sumOfUserNumbers
}

fun main() {
    print("Введите целое положительное число: ")
    val userInput = readln()
    println("Сумма первой и последней цифр введённого числа = " + getSumOfFirstAndLastDigits(userInput))

    println("Вводите любые числа, отделяя их через Enter. Чтобы прервать ввод введите «0»")
    println("Сумма введённых чисел = " + sumOfInputtedNumbers())
}
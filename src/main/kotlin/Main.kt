package org.example


fun getSumOfFirstAndLastDigits(number: String) : Int {
    val firstDigit  = number.first().digitToInt()
    val lastDigit = number.last().digitToInt()
    return firstDigit + lastDigit
}

fun main() {
    print("Введите целое положительное число: ")
    val number = readln()
    println("Сумма первой и последней цифр введённого числа = " + getSumOfFirstAndLastDigits(number))
}
package org.example


fun getSumOfFirstAndLastDigits(number: String) : Int {
    val firstDigit  = number.first().digitToInt()
    val lastDigit = number.last().digitToInt()
    return firstDigit + lastDigit
}

fun main() {
    print("Введите целое положительное число: ")
    var userInput = readln()
    println("Сумма первой и последней цифр введённого числа: " + getSumOfFirstAndLastDigits(userInput))

    println("Вводите любые числа, отделяя их через Enter. Чтобы прервать ввод введите «0»")
    var sumOfUserNumbers = 0
    var countOfUserNumbers = -1
    do {
        userInput = readln()
        sumOfUserNumbers += userInput.toInt()
        countOfUserNumbers += 1
    } while (userInput != "0")

    println("Количество введённых чисел: " + countOfUserNumbers + "\n" +
            "Сумма введённых чисел: " + sumOfUserNumbers + "\n" +
            "Среднее арифметическое ввёднных чисел: " + sumOfUserNumbers / countOfUserNumbers)
}

fun main() {
    val comission = 0.0075
    val minComission = 35

    while (true) {
        println("Введите сумму перевода в рублях: ")
        val payment = readLine()
        val paymentResult = payment?.toInt()
        if (paymentResult != null) {
            if (paymentResult <= minComission)
                println("Введена некорректная сумма перевода")
            else {
                println("Сумма комиссии составит: ")
                val comissionResult = paymentResult.times((comission))
                val comissionValue =
                    if (comissionResult < minComission) minComission * 100 else paymentResult * comission * 100
                println(comissionValue)

                val amount = (paymentResult * 100 - comissionValue.toInt())

                println("Сумма перевода составит: $amount копеек.")
                break
            }
        }
    }
}
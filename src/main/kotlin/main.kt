fun main() {

    var amount: Int = 100

    val x: Double = amount * 0.75 / 100

    val sum: Double = amount - x

    if(sum <= 35) {
        println("""Ваша сумма $sum рублей
            |Комиссия будет, ровна 35 рублям. 
            |Положите большую сумму чтобы комиссия была меньше. """.trimMargin())
    } else if (sum > 35) {
        println("Ваша сумма со скидкой $sum рублей ")
    }

}
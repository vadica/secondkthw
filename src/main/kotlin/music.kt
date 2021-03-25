import kotlin.math.ceil

fun main() {
    val increasedDiscount = 0.05
    val discountForRegularCustomer = 0.99
    val isRegularCustomer = true
    val previousPurchase = 1001
    val amountOfPurchases = 63671234
    println("Покупка - $amountOfPurchases руб.")

    val standardDiscount: Double = when {
        previousPurchase in 1001..10000 -> 100.0
        previousPurchase > 10000 -> amountOfPurchases * increasedDiscount
        else -> 0.0
    }
    var totalPrice = amountOfPurchases.toDouble() - standardDiscount
    var discountString = if (standardDiscount == 100.0) "скидки в 100 рублей" else "5% скидки"
    printMessage(discountString, totalPrice)

    if (isRegularCustomer) {
        totalPrice *= discountForRegularCustomer
        discountString = "1% скидки"
        printMessage(discountString, totalPrice)
    }
}

fun printMessage (discountString: String, totalPrice:Double) {
    println("после применения $discountString - ${totalPrice.toInt()} руб. ${ceil(totalPrice % 1.0 * 100).toInt()} коп.")
}
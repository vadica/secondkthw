import kotlin.math.ceil

fun main() {
    val commissionPercent = 0.0075
    val amount = 3_00
    val commissionRub = if (amount * commissionPercent > 3500.0) ceil(amount * commissionPercent).toInt() else 3500
    println ("Комиссия в копейках: $commissionRub")
}
fun main() {
    val likes = 70231
    val people = if (likes % 10 == 1 && likes % 100 != 11) "человеку" else "людям"
    println("Понравилось $likes $people")
}
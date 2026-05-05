fun main() {
    val signalcase_1 = Signal(86, 97, 13, 25, 9)
    check(Policy.score(signalcase_1) == 123)
    check(Policy.classify(signalcase_1) == "review")
    val signalcase_2 = Signal(81, 98, 21, 19, 7)
    check(Policy.score(signalcase_2) == 116)
    check(Policy.classify(signalcase_2) == "review")
    val signalcase_3 = Signal(90, 78, 23, 23, 10)
    check(Policy.score(signalcase_3) == 94)
    check(Policy.classify(signalcase_3) == "review")
}

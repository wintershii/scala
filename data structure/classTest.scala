class Counter {
    private var value = 0
    def increment():Unit = { value += 1}
    def current():Int = {value}
}

val myCounter = new Counter
myCounter.increment
println(myCounter.current)

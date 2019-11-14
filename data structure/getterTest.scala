class Counter {
    private var privateValue = 0;
    def value = privateValue
    def value_=(newValue: Int) {
        if (newValue > 0)
            privateValue = newValue
    }
    def increment(step: Int): Unit = { value += step}
    def current(): Int = {value}
}

object MyCounter {
    def main(args:Array[String]) {
        val myCounter = new Counter
        println(myCounter.value)
        myCounter.value = 3
        println(myCounter.value)
        myCounter.increment(1)
        println(myCounter.current)
    }
}

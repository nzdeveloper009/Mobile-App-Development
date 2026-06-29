interface RouteStrategy {
    fun buildRoute(from: String, to: String)
}
class CarRoute : RouteStrategy {

    override fun buildRoute(from: String, to: String) {
        println("Finding the fastest car route from $from to $to")
    }
}
class WalkingRoute : RouteStrategy {

    override fun buildRoute(from: String, to: String) {
        println("Finding the shortest walking route from $from to $to")
    }
}
class BicycleRoute : RouteStrategy {

    override fun buildRoute(from: String, to: String) {
        println("Finding the safest bicycle route from $from to $to")
    }
}
class NavigationApp(private var strategy: RouteStrategy) {

    fun setStrategy(strategy: RouteStrategy) {
        this.strategy = strategy
    }

    fun navigate(from: String, to: String) {
        strategy.buildRoute(from, to)
    }
}
fun main() {

    val app = NavigationApp(CarRoute())

    app.navigate("Lahore", "Islamabad")

    app.setStrategy(WalkingRoute())

    app.navigate("Lahore", "Islamabad")

    app.setStrategy(BicycleRoute())

    app.navigate("Lahore", "Islamabad")
}
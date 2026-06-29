package com.android.imanlearnkotlin

/*traditional observer pattren
interface Observer {
    fun update(temp: Float)
}
interface Subject {
    fun registerObserver(observer: Observer)
    fun removeObserver(observer: Observer)
    fun notifyObservers()
}
class WeatherStation : Subject {

    private val observers = mutableListOf<Observer>()
    private var temperature = 0f

    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        for (observer in observers) {
            observer.update(temperature)
        }
    }

    fun setTemperature(temp: Float) {
        temperature = temp
        println("Weather Station: Temperature changed to $temp°C")
        notifyObservers()
    }
}
class MobileDisplay : Observer {

    override fun update(temp: Float) {
        println("Mobile Display: Temperature is $temp°C")
    }
}
class LEDDisplay : Observer {

    override fun update(temp: Float) {
        println("LED Display: Temperature is $temp°C")
    }
}
class TVDisplay : Observer {

    override fun update(temp: Float) {
        println("TV Display: Temperature is $temp°C")
    }
}
fun main() {

    val station = WeatherStation()

    val mobile = MobileDisplay()
    val led = LEDDisplay()
    val tv = TVDisplay()

    station.registerObserver(mobile)
    station.registerObserver(led)
    station.registerObserver(tv)

    station.setTemperature(35f)
}*/
// delegate observer pattren
class WeatherStation {

    private val observers = mutableListOf<(Float) -> Unit>()

    fun registerObserver(observer: (Float) -> Unit) {
        observers.add(observer)
    }

    fun setTemperature(temp: Float) {
        println("Temperature changed to $temp°C")

        for (observer in observers) {
            observer(temp)
        }
    }
}
fun main() {

    val station = WeatherStation()

    station.registerObserver {
        println("Mobile Display: $it°C")
    }

    station.registerObserver {
        println("LED Display: $it°C")
    }

    station.registerObserver {
        println("TV Display: $it°C")
    }

    station.setTemperature(35f)
}
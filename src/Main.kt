fun main() {

    // интерфейсы удобно использовать в коллекциях
    val rect = Rect(0, 0, 4, 2)
    println("Starting: \n$rect \n")
    println("Area: ${rect.area()} \n")
    rect.move(4, 3)
    println("Moved (4, 3):\n$rect \n")
    rect.rotate(RotateDirection.Clockwise, 3, -3)
    println("Rotated clockwise (3, -3): \n$rect \n")
    rect.rotate(RotateDirection.CounterClockwise, 3, -3)
    println("Rotated counter clockwise (3, -3): \n$rect \n")
    rect.resize(2)
    println("Resized (2): \n$rect \n")
}
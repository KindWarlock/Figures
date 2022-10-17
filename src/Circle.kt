import kotlin.math.PI
import kotlin.math.abs

class Circle(x: Int, y: Int, var r: Float) : Figure(x, y), Movable, Transforming {
    override fun area(): Float {
        return PI.toFloat() * r * r;
    }

    override fun move(dx: Int, dy: Int) {
        x += dx; y += dy
    }

    override fun resize(zoom: Int) {
        r *= zoom
    }

    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {
        val newX: Int
        val newY: Int
        if (direction == RotateDirection.Clockwise) {
            newX = y - centerY + centerX
            newY = -x + centerX + centerY
        } else {
            newX = -y + centerX + centerY
            newY = x - centerX + centerY
        }
        x = newX
        y = newY
    }

}
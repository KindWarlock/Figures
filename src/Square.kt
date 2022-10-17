import kotlin.math.abs

class Square(x: Int, y: Int, var length: Float) : Movable, Figure(x, y), Transforming {
    override fun area(): Float {
        return length * length
    }

    override fun move(dx: Int, dy: Int) {
        x += dx; y += dy
    }

    override fun resize(zoom: Int) {
        length *= zoom
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
import kotlin.math.abs

class Rect(x: Int, y: Int, var width: Int, var height: Int) : Transforming, Movable, Figure(x, y) {

    constructor(rect: Rect) : this(rect.x, rect.y, rect.width, rect.height)
    override fun move(dx: Int, dy: Int) {
        x += dx; y += dy
    }
    override fun area(): Float {
        return (width*height).toFloat() // требуется явное приведение к вещественному числу
    }

    override fun resize(zoom: Int) {
        width *= zoom
        height *= zoom
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
        val temp = width
        width = height
        height = temp
    }

    override fun toString(): String {
        return "Width: $width, height: $height ($x, $y)"
    }
}
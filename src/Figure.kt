// если хотя бы есть один метод абстрактный (без реализации), класс объявляется абстрактным
abstract class Figure(var x: Int, var y: Int) {
     abstract fun area(): Float
}
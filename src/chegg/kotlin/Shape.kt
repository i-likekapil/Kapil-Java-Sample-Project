package chegg.kotlin

import kotlin.math.sqrt;

open class Shape {

    constructor() {}
    constructor(_name: String) {

        when (_name) {
            "square" -> {
                val sq = Square()
                sq.setDimensions()
                sq.printDimensions()
                sq.getArea()
            }
            "circle" -> {
                val cir = Circle()
                cir.setDimensions()
                cir.printDimensions()
                cir.getArea()
            }
            "triangle" -> {
                val tri = Triangle()
                tri.setDimensions()
                tri.printDimensions()
                tri.getArea()
            }
            "equilateralTriangle" -> {
                val equi = EquilateralTriangle()
                equi.setDimensions()
                equi.printDimensions()
                equi.getArea()
            }
        }
    }

    open fun getArea() {
        println("Area is 0.0")
    }

    open fun printDimensions() {
        println("No dimensions")
    }
}


open class Square : Shape() {
    private var length = 0.0
    private var height = 0.0
    override fun getArea() {
        println("Area is : " + length * height)
    }

    fun setDimensions() {
        println("Enter Length of Square : ")
        length = readLine()?.toDouble() ?: 0.0
        println("Enter Height of Square : ")
        height = readLine()?.toDouble() ?: 0.0
    }

    override fun printDimensions() {
        println("Length is : $length\nHeight is : $height")
    }
}

open class Circle : Shape() {
    private var radius = 0.0
    override fun getArea() {
        println("Area is " + Math.PI * radius * radius)
    }

    fun setDimensions() {
        println("Enter Radius of Circle : ")
        radius = readLine()?.toDouble() ?: 0.0
    }

    override fun printDimensions() {
        println("Radius is : $radius")
    }
}

open class Triangle : Shape() {
    private var a = 0.0
    private var b = 0.0
    private var c = 0.0
    override fun getArea() {
        val s = (a + b + c) / 2.0
        println("Area is " + sqrt(s * (s - a) * (s - b) * (s - c)))
    }

    open fun setDimensions() {
        println("Enter First side of Triangle : ")
        a = readLine()?.toDouble() ?: 0.0
        println("Enter Second side of Triangle : ")
        b = readLine()?.toDouble() ?: 0.0
        println("Enter Third side of Triangle : ")
        c = readLine()?.toDouble() ?: 0.0
    }

    override fun printDimensions() {
        println("First Side is : $a\nSecond Side is : $b\nThird Side is : $c")
    }
}

class EquilateralTriangle : Triangle() {
    private var a = 0.0
    override fun getArea() {
        println("Area is " + sqrt(3.0) * a * a / 4)
    }

    override fun setDimensions() {
        println("Enter side of Equilateral Triangle : ")
        a = readLine()?.toDouble() ?: 0.0
    }

    override fun printDimensions() {
        println("The Side of Equilateral triangle is  : $a")
    }
}
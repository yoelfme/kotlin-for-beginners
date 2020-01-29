package hello

fun main() {
    // boolean
    var bo = 7 < 4;
    println("boolean $bo")

    // byte
    val b: Byte = 127;
    println("byte $b");

    val s: Short = 24;
    println("short $s");

    var i: Int = 7;
    println("integer $i");

    var l: Long = 123123123131;
    println("long $l")

    val f: Float = 3.73F;
    println("float $f");

    val d = 3.02;
    val d2: Double = 3.1415;

    println("double $d, $d2")

    val c: Char = 'c'
    println(c);

    // Casting
    var f2: Float = 3.4F;
    var d3: Double  = 0.0;

    d3 = f2.toDouble();

    println("casting $d3");
}
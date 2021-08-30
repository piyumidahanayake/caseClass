case class point(var p: Int, var q: Int) {
    def add(a:point) = new point(this.p + a.p, this.q + a.q)

    def move(p:Int, q:Int):Unit = {
        this.p = this.p + p
        this.q = this.q + q
    }

    def distance(a:point) : Double = {
        var pDist:Int = this.p - a.p
        var qDist:Int = this.q - a.q
        var dist: Int = pDist*pDist + qDist*qDist
        scala.math.sqrt(dist)
    }

    def invert() :Unit = {
        var tmp = this.p
        this.p = this.q
        this.q = tmp
    }

}

object point extends App {

    var a = point(1,2)
    var b = point(4,10)

    println(a.add(b))

    a.move(p = 2, q = 4)
    println(a)

    var c = a.distance(b)
    println(c)

    a.invert()
    println(a)
}

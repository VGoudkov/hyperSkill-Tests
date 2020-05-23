package ru.vgoudk.kotlinclass

import java.util.*

/**

There are two boxes on the table. The first box has a size of X1 x Y1 x Z1, and the second box has a size of X2 x Y2 x Z2. You need to determine which box can be put inside another box. You can rotate both boxes as you want.

The input contains two lines. The first line contains numbers X1, Y1, Z1, the second line contains numbers X2, Y2, Z2. All numbers are integers and they are greater than 0.

The output should be the following:

If the sizes of the boxes are equal, print "Box 1 = Box 2".
If the first box can be put inside the second box, print "Box 1 < Box 2".
If the second box can be put inside the first box, print "Box 1 > Box 2".
If none of the boxes can be put inside another one, print "Incomparable".

Pay attention to the examples below!

 */
fun main() {

    val scanner = Scanner(System.`in`)
    val x1 = scanner.nextInt()
    val y1 = scanner.nextInt()
    val z1 = scanner.nextInt()

    val x2 = scanner.nextInt()
    val y2 = scanner.nextInt()
    val z2 = scanner.nextInt()

    var sx1 = -1
    var sy1 = -1
    var sz1 = -1

    var sx2 = -1
    var sy2 = -1
    var sz2 = -1


    if (x1 >= y1 && x1 >= z1) {
        sx1 = x1
        if (y1 >= z1) {
            sy1 = y1
            sz1 = z1
        } else {
            sy1 = z1
            sz1 = y1
        }
    } else
        if (y1 >= x1 && y1 >= z1) {
            sx1 = y1
            if (x1 >= z1) {
                sy1 = x1
                sz1 = z1
            } else {
                sy1 = z1
                sz1 = x1
            }
        } else
            if (z1 >= x1 && z1 >= y1) {
                sx1 = z1
                if (x1 >= y1) {
                    sy1 = x1
                    sz1 = y1
                } else {
                    sy1 = y1
                    sz1 = x1
                }
            }


    if (x2 >= y2 && x2 >= z2) {
        sx2 = x2
        if (y2 >= z2) {
            sy2 = y2
            sz2 = z2
        } else {
            sy2 = z2
            sz2 = y2
        }
    } else
        if (y2 >= x2 && y2 >= z2) {
            sx2 = y2
            if (x2 >= z2) {
                sy2 = x2
                sz2 = z2
            } else {
                sy2 = z2
                sz2 = x2
            }
        } else
            if (z2 >= x2 && z2 >= y2) {
                sx2 = z2
                if (x2 >= y2) {
                    sy2 = x2
                    sz2 = y2
                } else {
                    sy2 = y2
                    sz2 = x2
                }
            }


    println("$sx1, $sy1, $sz1")
    println("$sx2, $sy2, $sz2")
    
    if( sx1 == sx2 && sy1 == sy2 && sz1 == sz2) println("Box 1 = Box 2")
    else if ( sx1 <= sx2 && sy1 <= sy2 && sz1 <= sz2) println("Box 1 < Box 2")
    else if ( sx1 >= sx2 && sy1 >= sy2 && sz1 >= sz2) println("Box 1 > Box 2")
    else println("Incomparable")
    
}

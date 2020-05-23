package ru.vgoudk.kotlinclass

fun main(){
  val d: Double = 1.0 % 10f        //1
  val f: Float = d.toLong() + 1.0f  //2
  val l: Long = f.toInt() + 4L     //3
  val n: Int = l.toByte() + 2      //4
}

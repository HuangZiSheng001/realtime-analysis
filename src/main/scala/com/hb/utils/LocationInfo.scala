package com.hb.utils

import scala.collection.mutable.ArrayBuffer

/**
  * Created by Simon on 2017/4/1.
  */
object LocationInfo {
  def findLocation(arrBuffer: ArrayBuffer[IPRecord],ipInt : Int) = {
    var loc : String= null
    for (elems <- arrBuffer ){
      if (elems.isIPMatch(ipInt))
        loc = elems.getLocation
    }
    loc
  }

}
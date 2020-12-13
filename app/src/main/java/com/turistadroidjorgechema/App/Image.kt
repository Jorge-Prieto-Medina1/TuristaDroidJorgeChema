package com.turistadroidjorgechema.App

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class Image (@PrimaryKey var id : Long = 0,
                  var foto : String = "") : RealmObject(){
    constructor( foto : String) : this((System.currentTimeMillis() / 1000L), foto)
}
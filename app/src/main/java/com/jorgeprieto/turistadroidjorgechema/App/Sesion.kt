package com.jorgeprieto.turistadroidjorgechema.App

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class Sesion {
    open class Session (@PrimaryKey var emailUser : String = "") : RealmObject()
}
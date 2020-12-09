package com.turistadroidjorgechema.lugares

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.*
import io.realm.RealmList
import com.turistadroidjorgechema.App.Image

open class Place (@PrimaryKey var id : Long = 0,
                  var nombre : String = "",
                  var fecha : Date = Date(),
                  var city : String = "",
                  var puntuacion : Double = 0.0,
                  var longitud : Double = 0.0,
                  var latitud : Double = 0.0,
                  var imagenes : RealmList<Image> = RealmList()) : RealmObject(){
    constructor(nombre: String, fecha: Date,city: String, puntuacion: Double, longitud: Double, latitud: Double, imagenes: RealmList<Image>) :
            this((System.currentTimeMillis() / 1000L), nombre, fecha, city, puntuacion, longitud, latitud, imagenes)
}

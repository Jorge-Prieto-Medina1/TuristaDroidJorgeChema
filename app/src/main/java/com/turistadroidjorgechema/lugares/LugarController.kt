package com.turistadroidjorgechema.lugares

import io.realm.Realm
import io.realm.kotlin.where

object LugarController {

    private const val DISTANCIA = 1000

    //Insertar un lugar
    fun insertPlace(place: Place){
        Realm.getDefaultInstance().executeTransaction{
            it.copyToRealm(place)
        }
    }

    //Seleccionar todos los lugares
    fun selectPlaces(): MutableList<Place>?{
        return Realm.getDefaultInstance().copyFromRealm(
            Realm.getDefaultInstance().where<Place>().findAll()
        )
    }

    //Seleccionar lugares cerca de mi
    fun selectNearby(longitud : Double, latitud : Double): MutableList<Place>?{
        return Realm.getDefaultInstance().copyFromRealm(
            Realm.getDefaultInstance().where<Place>().between("longitud", (longitud - DISTANCIA), (longitud + DISTANCIA)).and()
                .between("latitud", (latitud - DISTANCIA), (latitud + DISTANCIA)).findAll()

        )
    }

    //Actualizar un lugar
    fun updateUser(place: Place){
        Realm.getDefaultInstance().executeTransaction{
            it.copyToRealmOrUpdate(place)
        }
    }

    //Eliminar un lugar
    fun deletePlace(id : Long){
        Realm.getDefaultInstance().executeTransaction{
            it.where<Place>().equalTo("id", id).findFirst()?.deleteFromRealm()
        }
    }
}
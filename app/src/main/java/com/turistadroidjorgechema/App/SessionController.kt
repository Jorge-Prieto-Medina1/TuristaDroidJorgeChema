package com.turistadroidjorgechema.App

import io.realm.Realm
import io.realm.kotlin.where

object SessionController {

    //Insertar una sesion
    fun insertSession(session: Session){
        Realm.getDefaultInstance().executeTransaction{
            it.copyToRealm(session)
        }
    }

    //Seleccionar todas las sessiones
    fun selectSessions(): MutableList<Session>?{
        return Realm.getDefaultInstance().copyFromRealm(
            Realm.getDefaultInstance().where<Session>().findAll()
        )
    }

    //Eliminar una sesion
    fun deleteSession(email: String){
        Realm.getDefaultInstance().executeTransaction{
            it.where<Session>().equalTo("emailUser", email).findFirst()?.deleteFromRealm()
        }
    }
}
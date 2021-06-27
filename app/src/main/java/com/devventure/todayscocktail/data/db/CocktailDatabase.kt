package com.devventure.todayscocktail.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.devventure.todayscocktail.data.model.Drink
import com.devventure.todayscocktail.data.model.DrinkDetail

@Database(
    entities = [Drink::class, DrinkDetail::class],
    version = 1,
    exportSchema = false
)
abstract class CocktailDatabase : RoomDatabase() {
    abstract fun drinksDao(): DrinkDao
    abstract fun drinkDetailDao(): DrinkDetailDao

    companion object {
        @Volatile // Torna esse campo imediatamente visivel apra outras threads
        private var INSTANCE: CocktailDatabase? = null

        // Usamos o synchronized para garantir que a criação só seja disparada uma vez por solicitação
        fun getDatabase(context: Context): CocktailDatabase {
            return INSTANCE ?: synchronized(this) {
                val database = Room.databaseBuilder(
                    context.applicationContext,
                    CocktailDatabase::class.java,
                    "cocktail_database"
                )
                    .build()
                INSTANCE = database
                database
            }
        }
    }

}
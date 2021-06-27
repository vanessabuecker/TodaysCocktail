package com.devventure.todayscocktail.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "drink_detail_entity")
data class DrinkDetail(
    @PrimaryKey
    @SerializedName("idDrink")
    @ColumnInfo(name = "id")
    var idDrink: String = "",
    var dateModified: String? = null,
    var strAlcoholic: String? = null,
    var strCategory: String? = null,
    var strCreativeCommonsConfirmed: String? = null,
    var strDrink: String? = null,
    var strDrinkAlternate: String? = null,
    var strDrinkThumb: String? = null,
    var strGlass: String? = null,
    var strIBA: String? = null,
    var strImageAttribution: String? = null,
    var strImageSource: String? = null,
    var strIngredient1: String? = null,
    var strIngredient10: String? = null,
    var strIngredient11: String? = null,
    var strIngredient12: String? = null,
    var strIngredient13: String? = null,
    var strIngredient14: String? = null,
    var strIngredient15: String? = null,
    var strIngredient2: String? = null,
    var strIngredient3: String? = null,
    var strIngredient4: String? = null,
    var strIngredient5: String? = null,
    var strIngredient6: String? = null,
    var strIngredient7: String? = null,
    var strIngredient8: String? = null,
    var strIngredient9: String? = null,
    var strInstructions: String? = null,
    var strInstructionsDE: String? = null,
    var strInstructionsES: String? = null,
    var strInstructionsFR: String? = null,
    var strInstructionsIT: String? = null,
    var `strInstructionsZH-HANS`: String? = null,
    var `strInstructionsZH-HANT`: String? = null,
    var strMeasure1: String? = null,
    var strMeasure10: String? = null,
    var strMeasure11: String? = null,
    var strMeasure12: String? = null,
    var strMeasure13: String? = null,
    var strMeasure14: String? = null,
    var strMeasure15: String? = null,
    var strMeasure2: String? = null,
    var strMeasure3: String? = null,
    var strMeasure4: String? = null,
    var strMeasure5: String? = null,
    var strMeasure6: String? = null,
    var strMeasure7: String? = null,
    var strMeasure8: String? = null,
    var strMeasure9: String? = null,
    var strTags: String? = null,
    var strVideo: String? = null
)
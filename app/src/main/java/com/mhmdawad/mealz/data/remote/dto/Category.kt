package com.mhmdawad.mealz.data.remote.dto


import com.google.gson.annotations.SerializedName
import com.mhmdawad.mealz.domain.model.MealCategoryModel

data class Category(
    @SerializedName("idCategory")
    val idCategory: String,
    @SerializedName("strCategory")
    val strCategory: String,
    @SerializedName("strCategoryDescription")
    val strCategoryDescription: String,
    @SerializedName("strCategoryThumb")
    val strCategoryThumb: String
)

fun Category.toModel() = MealCategoryModel(
    id = idCategory.toInt(),
    name = strCategory,
    image = strCategoryThumb
)
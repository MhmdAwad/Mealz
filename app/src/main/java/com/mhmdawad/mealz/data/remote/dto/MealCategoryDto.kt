package com.mhmdawad.mealz.data.remote.dto


import com.google.gson.annotations.SerializedName

data class MealCategoryDto(
    @SerializedName("categories")
    val categories: List<Category>
)
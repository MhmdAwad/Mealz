package com.mhmdawad.mealz.data.remote.dto


import com.google.gson.annotations.SerializedName

data class MealDetailDto(
    @SerializedName("meals")
    val meals: List<Meal>
)
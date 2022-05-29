package com.mhmdawad.mealz.domain.model

data class Ingredients(
    val ingredient: String,
    val measure: String
)
data class MealDetailModel(

    val id: String,
    val name: String,
    val mealArea: String,
    val instructions: String,
    val image: String,
    val youtubeLink: String,
    val tags: List<String>,
    val ingredients: List<Ingredients>
)

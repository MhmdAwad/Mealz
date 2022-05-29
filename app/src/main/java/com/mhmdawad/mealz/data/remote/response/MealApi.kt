package com.mhmdawad.mealz.data.remote.response

import com.mhmdawad.mealz.data.remote.dto.MealCategoryDto
import com.mhmdawad.mealz.data.remote.dto.MealDetailDto
import retrofit2.http.GET
import retrofit2.http.Query

interface MealApi {

    @GET("categories.php")
    suspend fun getMealCategories(): MealCategoryDto

    @GET("random.php")
    suspend fun getRandomMeals(): MealDetailDto

    @GET("search.php")
    suspend fun searchMealByName(@Query("s") queryName: String): MealDetailDto

    @GET("lookup.php")
    suspend fun getMealDetails(@Query("i") queryId: String): MealDetailDto

}
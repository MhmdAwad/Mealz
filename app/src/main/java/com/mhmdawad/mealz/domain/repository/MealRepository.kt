package com.mhmdawad.mealz.domain.repository

import com.mhmdawad.mealz.data.remote.dto.MealCategoryDto
import com.mhmdawad.mealz.data.remote.dto.MealDetailDto

interface MealRepository {

    suspend fun getMealCategories(): MealCategoryDto
    suspend fun getRandomMeals(): MealDetailDto
    suspend fun searchMealByName(mealName: String): MealDetailDto
    suspend fun getMealDetails(mealId: String): MealDetailDto
}
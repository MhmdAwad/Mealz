package com.mhmdawad.mealz.data.repository

import com.mhmdawad.mealz.data.remote.dto.MealCategoryDto
import com.mhmdawad.mealz.data.remote.dto.MealDetailDto
import com.mhmdawad.mealz.data.remote.response.MealApi
import com.mhmdawad.mealz.domain.repository.MealRepository
import javax.inject.Inject

class MealRepositoryImpl @Inject constructor(
    private val mealApi: MealApi
): MealRepository {

    override suspend fun getMealCategories(): MealCategoryDto = mealApi.getMealCategories()

    override suspend fun getRandomMeals(): MealDetailDto = mealApi.getRandomMeals()

    override suspend fun searchMealByName(mealName: String): MealDetailDto = mealApi.searchMealByName(mealName)

    override suspend fun getMealDetails(mealId: String): MealDetailDto = mealApi.getMealDetails(mealId)

}
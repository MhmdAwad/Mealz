package com.mhmdawad.mealz.di

import com.mhmdawad.mealz.common.Constants
import com.mhmdawad.mealz.data.remote.response.MealApi
import com.mhmdawad.mealz.data.repository.MealRepositoryImpl
import com.mhmdawad.mealz.domain.repository.MealRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideMealApi(): MealApi =
        Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MealApi::class.java)

    @Provides
    @Singleton
    fun provideMealRepository(mealApi: MealApi): MealRepository =
        MealRepositoryImpl(mealApi)
}
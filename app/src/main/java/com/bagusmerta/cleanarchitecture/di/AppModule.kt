package com.bagusmerta.cleanarchitecture.di

import com.bagusmerta.cleanarchitecture.data.data_source.ITextDataSource
import com.bagusmerta.cleanarchitecture.data.data_source.TextDataSource
import com.bagusmerta.cleanarchitecture.data.repository.TextRepository
import com.bagusmerta.cleanarchitecture.domain.repository.ITextRepository
import com.bagusmerta.cleanarchitecture.domain.usecase.TextUseCase
import com.bagusmerta.cleanarchitecture.domain.util.GetTextMessage

object AppModule {

    private fun provideDataSource(): ITextDataSource{
        return TextDataSource()
    }
    private fun provideRepository(): ITextRepository{
        val textDataSource = provideDataSource()
        return TextRepository(textDataSource)
    }
    fun provideUseCase(): TextUseCase{
        val textRepository = provideRepository()
        return GetTextMessage(textRepository)
    }
}
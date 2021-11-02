package com.bagusmerta.cleanarchitecture.data.repository

import com.bagusmerta.cleanarchitecture.data.data_source.ITextDataSource
import com.bagusmerta.cleanarchitecture.data.data_source.TextDataSource
import com.bagusmerta.cleanarchitecture.domain.model.TextEntity
import com.bagusmerta.cleanarchitecture.domain.repository.ITextRepository

class TextRepository(private val textDataSource: ITextDataSource): ITextRepository {
    override fun getText(message: String): TextEntity {
        return textDataSource.getTextFromSource(message)
    }
}
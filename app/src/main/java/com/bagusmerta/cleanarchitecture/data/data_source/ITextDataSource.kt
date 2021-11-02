package com.bagusmerta.cleanarchitecture.data.data_source

import com.bagusmerta.cleanarchitecture.domain.model.TextEntity

interface ITextDataSource {
    fun getTextFromSource(message: String): TextEntity
}
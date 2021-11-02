package com.bagusmerta.cleanarchitecture.data.data_source

import com.bagusmerta.cleanarchitecture.domain.model.TextEntity

class TextDataSource: ITextDataSource {
    override fun getTextFromSource(message: String): TextEntity {
        return TextEntity("Hello world! $message")
    }
}
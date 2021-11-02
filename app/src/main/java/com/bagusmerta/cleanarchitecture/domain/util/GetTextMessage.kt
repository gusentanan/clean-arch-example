package com.bagusmerta.cleanarchitecture.domain.util

import com.bagusmerta.cleanarchitecture.domain.model.TextEntity
import com.bagusmerta.cleanarchitecture.domain.repository.ITextRepository
import com.bagusmerta.cleanarchitecture.domain.usecase.TextUseCase

class GetTextMessage(
    private val textRepository: ITextRepository
): TextUseCase {

    override fun getText(message: String): TextEntity {
        return textRepository.getText(message)
    }
}
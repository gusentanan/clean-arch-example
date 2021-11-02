package com.bagusmerta.cleanarchitecture.domain.usecase

import com.bagusmerta.cleanarchitecture.domain.model.TextEntity

interface TextUseCase {
    fun getText(message: String): TextEntity
}
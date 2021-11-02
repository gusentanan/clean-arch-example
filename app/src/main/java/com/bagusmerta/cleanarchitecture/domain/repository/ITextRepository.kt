package com.bagusmerta.cleanarchitecture.domain.repository

import com.bagusmerta.cleanarchitecture.domain.model.TextEntity

interface ITextRepository {
    fun getText(message: String): TextEntity
}
package com.mdevor.littlelemon.data.mapper

import com.mdevor.littlelemon.data.local.entity.MenuLocalEntity
import com.mdevor.littlelemon.domain.entity.MenuEntity

fun List<MenuLocalEntity>.toDomain(): List<MenuEntity> =
    map {
        MenuEntity(
            title = it.title,
            description = it.description,
            price = it.price,
            category = it.category,
            image = it.image,
        )
    }
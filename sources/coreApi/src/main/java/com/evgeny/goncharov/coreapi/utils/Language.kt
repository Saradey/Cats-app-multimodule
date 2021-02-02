package com.evgeny.goncharov.coreapi.utils

import com.evgeny.goncharov.coreapi.consts.EN_CODE
import com.evgeny.goncharov.coreapi.consts.RU_CODE

enum class Language(
    val code: String
) {

    RU(RU_CODE),
    EN(EN_CODE)
}
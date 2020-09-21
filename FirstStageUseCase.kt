package com.dreamsoft.methodsapp.usecase

import androidx.lifecycle.MutableLiveData
import com.dreamsoft.methodsapp.data.FirstStageDataSet
import com.dreamsoft.methodsapp.ui.modelo.FirstStage

class FirstStageUseCase {
    private val firstStageDataSet= FirstStageDataSet()

    fun calcularCicloOne(): List<FirstStage> { //Sin este ultimo despues del parentesis
        return firstStageDataSet.createResult()

}

}



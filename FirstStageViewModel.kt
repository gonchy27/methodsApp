package com.dreamsoft.methodsapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dreamsoft.methodsapp.ui.modelo.FirstStage
import com.dreamsoft.methodsapp.usecase.FirstStageUseCase

class FirstStageViewModel : ViewModel() {
    private val firstStageUseCase= FirstStageUseCase()
    private val _cicloOne = MutableLiveData<List<FirstStage>>()

    /*init {
        getResultLiveData()
    }*/

   // fun LiveData<String> getCicloOne(){
     // return _cicloOne;
    //}



    public fun setData(data: List<FirstStage>) {
        _cicloOne.value=data
    }

    fun getResult(){
        setData(firstStageUseCase.calcularCicloOne())
    }
    fun getResultLiveData():LiveData<List<FirstStage>>{
        return _cicloOne
    }
}
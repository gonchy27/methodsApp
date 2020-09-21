package com.dreamsoft.methodsapp.data

import com.dreamsoft.methodsapp.ui.modelo.FirstStage

class FirstStageDataSet {
    private val timeOp:Double = 0.0;
    private val tsOp:Double = 0.0;
    private val tEff:Double=0.0;

    var capacity:Double=0.0
    var tciclo1:Double=0.0
    fun createResult(): List<FirstStage>{
        capacity= tsOp/timeOp;
        tciclo1=tEff/capacity;

        return listOf(
            FirstStage(0,0,0.0,0.0,0.0,0.0)
        );
    }
}
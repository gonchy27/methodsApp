package com.dreamsoft.methodsapp.viewmodel;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.dreamsoft.methodsapp.domain.EtapaUnoCase;
import com.dreamsoft.methodsapp.ui.modelo.DatoEtapa;

import java.util.List;

public class DataViewModel extends ViewModel {
    private EtapaUnoCase etapaUnoCase = new EtapaUnoCase();

    private void setDataStageOne(List<DatoEtapa> list){
        Log.i("DataViewModel","trabajando");
        /*
        * etapaUnoCase.setData(list);
        * */
    }

}

//entender bien el patron c-10-08-20
/*
* revisar bien el patron de diseño c-10-08-20
* */
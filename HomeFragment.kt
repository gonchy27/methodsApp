package com.dreamsoft.methodsapp.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.dreamsoft.methodsapp.R
import com.dreamsoft.methodsapp.ui.modelo.FirstStage
import com.dreamsoft.methodsapp.viewmodel.FirstStageViewModel
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    private lateinit var firstStageViewModel: FirstStageViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        //val textView: TextView = root.findViewById(R.id.text_home)
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            //textView.text = it
        })

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //controlls y btns

        val name = txt_name_op1.editText?.text
        val operators = txt_op1.editText?.text
        val machs1 = txt_machs1.editText?.text
        val top1 = txt_top1.editText?.text
        val tsOp1 = txt_tsOp1.editText?.text
        val teff = txt_tef1.editText?.text

        setResultViewModel()
        btn_first.setOnClickListener {

           val data:List<FirstStage> = listOf()
            val mutable=data.toMutableList()
            mutable.add(FirstStage(0,0,0.0,0.0,0.0,
                0.0));


            firstStageViewModel.setData(mutable); //probar con un toast para ver si recibimos valores c-20-09-20

            firstStageViewModel.getResult()

            /*val data= mutableListOf<String>()
            data.add(top1.toString());
            data.add(tsOp1.toString());
            data.add(teff.toString());*/

            //firstStageViewModel.firstOne(data);
        }

    }

    private fun setResultViewModel() {
        firstStageViewModel = ViewModelProvider(this).get(FirstStageViewModel::class.java)
        val firstStageObserver = Observer<List<FirstStage>> {
            Log.i("FirstStage", it.toString())
        }

        firstStageViewModel.getResultLiveData()
            .observe(viewLifecycleOwner, firstStageObserver) //this,...
    }

}



/*
* algunas cosas se modificaron del video puesto que algunas estan deprecadas, ahora ya funciona bien y es necesario trabajar
* con los stages de methodsApp c-20-09-20
* */
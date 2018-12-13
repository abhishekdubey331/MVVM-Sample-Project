package com.winuall.connect.ui.oldpapers

import android.arch.lifecycle.Observer
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.connect.winuall.R
import com.orhanobut.logger.Logger
import com.winuall.connect.data.model.OldExamContent
import com.winuall.connect.utils.Utils
import org.koin.android.ext.android.inject
import org.koin.android.viewmodel.ext.android.viewModel


class OldPapersFragment : Fragment() {

    private val utils: Utils by inject()
    private val oldPapersViewModel by viewModel<OldPapersViewModel>()


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_old_papers, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (utils.isConnectedToInternet()) {
            oldPapersViewModel.getOldExamDataFromServer()
        } else
            Toast.makeText(context, "No internet connection", Toast.LENGTH_SHORT).show()
        oldPapersViewModel.oldExamContent().observe(this, Observer<OldExamContent> {
            Logger.d(it)
        })
    }

}

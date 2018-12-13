package com.winuall.connect.ui.appupdate


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.BottomSheetDialogFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.connect.winuall.R
import com.thefinestartist.Base
import kotlinx.android.synthetic.main.fragment_bottom_sheet_normal.*


class BottomSheetFragment : BottomSheetDialogFragment() {
    private val NAME = "BottomSheetFragment"


    fun newInstance(message: ArrayList<String>): BottomSheetFragment {
        val myFragment = BottomSheetFragment()
        val args = Bundle()
        args.putStringArrayList("message", message)
        myFragment.arguments = args
        return myFragment
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_bottom_sheet_normal, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val list = arguments!!.getStringArrayList("message")
        var data = ""
        list?.forEach {content->
            data=data+content+ System.getProperty("line.separator")
        }
        newFeatures.text = data
        updateApp.setOnClickListener {
            try {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=${Base.getContext().packageName}")))
            } catch (anfe: android.content.ActivityNotFoundException) {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=${Base.getContext().packageName}")))
            }
        }
    }


}
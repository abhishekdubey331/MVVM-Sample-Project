package com.winuall.connect.data.model



data class  OldExamContent (var title : String="" ,
                            var list : List<Exams> = emptyList())


data class Exams(var name:String="",var link:String="",var date:String="")
package com.winuall.connect.data.model

import com.google.gson.annotations.SerializedName


data class QuizResponse(
        @SerializedName("data")
        val `data`: List<Data>
)

data class Data(
        @SerializedName("attempts")
        val attempts: Int,
        @SerializedName("duration")
        val duration: Int,
        @SerializedName("id")
        val id: Int,
        @SerializedName("instructions")
        val instructions: Instructions,
        @SerializedName("name")
        val name: String,
        @SerializedName("scheduled_end")
        val scheduledEnd: String,
        @SerializedName("scheduled_start")
        val scheduledStart: String,
        @SerializedName("syllabus")
        val syllabus: String,
        @SerializedName("syllabus_id")
        val syllabusId: Int,
        @SerializedName("type")
        val type: Int
)

data class Instructions(
        @SerializedName("multi_negative_marks")
        val multiNegativeMarks: String,
        @SerializedName("multi_positive_marks")
        val multiPositiveMarks: String,
        @SerializedName("numeric_negative_marks")
        val numericNegativeMarks: String,
        @SerializedName("numeric_positive_marks")
        val numericPositiveMarks: String,
        @SerializedName("passage_negative_marks")
        val passageNegativeMarks: Any,
        @SerializedName("passage_positive_marks")
        val passagePositiveMarks: Any,
        @SerializedName("single_negative_marks")
        val singleNegativeMarks: Any,
        @SerializedName("single_positive_marks")
        val singlePositiveMarks: Any,
        @SerializedName("syllabus")
        val syllabus: List<Syllabu>,
        @SerializedName("total_mcq")
        val totalMcq: Int,
        @SerializedName("total_numeric")
        val totalNumeric: Int,
        @SerializedName("total_passage")
        val totalPassage: Int,
        @SerializedName("total_questions")
        val totalQuestions: Int
)

data class Syllabu(
        @SerializedName("chapters")
        val chapters: List<Chapter>,
        @SerializedName("id")
        val id: Int,
        @SerializedName("name")
        val name: String
)

data class Chapter(
        @SerializedName("created_at")
        val createdAt: String,
        @SerializedName("deleted_at")
        val deletedAt: Any,
        @SerializedName("id")
        val id: Int,
        @SerializedName("name")
        val name: String,
        @SerializedName("order")
        val order: Int,
        @SerializedName("subject_id")
        val subjectId: Int,
        @SerializedName("updated_at")
        val updatedAt: String
)
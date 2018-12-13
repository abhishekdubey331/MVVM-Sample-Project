package com.winuall.connect.data.model
import com.google.gson.annotations.SerializedName



data class UserResponse(
    @SerializedName("first_time")
    var firstTime: Int = 0,
    @SerializedName("name")
    var name: String = "",
    @SerializedName("organisation")
    var organisation: Organisation = Organisation(),
    @SerializedName("organisation_id")
    var organisationId: Int = 0,
    @SerializedName("paid_practice")
    var paidPractice: Int = 0,
    @SerializedName("role")
    var role: Int = 0,
    @SerializedName("status")
    var status: String = "",
    @SerializedName("subjects")
    var subjects: List<Subject> = listOf(),
    @SerializedName("token")
    var token: String = "",
    @SerializedName("user_id")
    var userId: Int = 0
)

data class Subject(
    @SerializedName("created_at")
    var createdAt: String = "",
    @SerializedName("deleted_at")
    var deletedAt: Any? = Any(),
    @SerializedName("id")
    var id: Int = 0,
    @SerializedName("name")
    var name: String = "",
    @SerializedName("pivot")
    var pivot: Pivot = Pivot(),
    @SerializedName("updated_at")
    var updatedAt: String = ""
)

data class Pivot(
    @SerializedName("organisation_id")
    var organisationId: Int = 0,
    @SerializedName("subject_id")
    var subjectId: Int = 0
)

data class Organisation(
    @SerializedName("about")
    var about: String = "",
    @SerializedName("address")
    var address: Address = Address(),
    @SerializedName("avatar")
    var avatar: String = "",
    @SerializedName("cover_picture")
    var coverPicture: String = "",
    @SerializedName("email")
    var email: String = "",
    @SerializedName("name")
    var name: String = "",
    @SerializedName("phone")
    var phone: String = "",
    @SerializedName("website_url")
    var websiteUrl: String = ""
)

data class Address(
    @SerializedName("street")
    var street: String = "",
    @SerializedName("zip_code")
    var zipCode: ZipCode = ZipCode()
)

data class ZipCode(
    @SerializedName("city")
    var city: String = "",
    @SerializedName("id")
    var id: Int = 0,
    @SerializedName("state")
    var state: String = "",
    @SerializedName("zip_code")
    var zipCode: String = ""
)
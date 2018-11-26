package com.winuall.connect.data.model
import com.squareup.moshi.Json
import com.google.gson.annotations.SerializedName



data class UserResponse(
    @SerializedName("first_time")
    val firstTime: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("organisation")
    val organisation: Organisation,
    @SerializedName("organisation_id")
    val organisationId: Int,
    @SerializedName("role")
    val role: Int,
    @SerializedName("status")
    val status: String,
    @SerializedName("subjects")
    val subjects: List<Subject>,
    @SerializedName("token")
    val token: String,
    @SerializedName("user_id")
    val userId: Int
)

data class Subject(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String
)

data class Organisation(
    @SerializedName("about")
    val about: String,
    @SerializedName("address")
    val address: Address,
    @SerializedName("avatar")
    val avatar: String,
    @SerializedName("cover_picture")
    val coverPicture: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("phone")
    val phone: String,
    @SerializedName("website_url")
    val websiteUrl: String
)

data class Address(
    @SerializedName("street")
    val street: String,
    @SerializedName("zip_code")
    val zipCode: ZipCode
)

data class ZipCode(
    @SerializedName("city")
    val city: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("state")
    val state: String,
    @SerializedName("zip_code")
    val zipCode: String
)
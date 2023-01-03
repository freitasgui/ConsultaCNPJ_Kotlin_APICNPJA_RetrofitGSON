package com.example.consultacnpj


import com.google.gson.annotations.SerializedName

data class cnpj(
    @SerializedName("address")
    val address: Address,
    @SerializedName("alias")
    val alias: String,
    @SerializedName("company")
    val company: Company,
    @SerializedName("emails")
    val emails: List<Email>,
    @SerializedName("founded")
    val founded: String,
    @SerializedName("head")
    val head: Boolean,
    @SerializedName("links")
    val links: List<Link>,
    @SerializedName("mainActivity")
    val mainActivity: MainActivityX,
    @SerializedName("phones")
    val phones: List<Phone>,
    @SerializedName("reason")
    val reason: Reason,
    @SerializedName("registrations")
    val registrations: List<Registration>,
    @SerializedName("sideActivities")
    val sideActivities: List<SideActivity>,
    @SerializedName("special")
    val special: Special,
    @SerializedName("specialDate")
    val specialDate: String,
    @SerializedName("status")
    val status: StatusX,
    @SerializedName("statusDate")
    val statusDate: String,
    @SerializedName("taxId")
    val taxId: String,
    @SerializedName("updated")
    val updated: String
)
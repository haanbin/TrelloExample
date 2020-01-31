package com.test.trelloexample.data

data class Membership(
    val deactivated: Boolean,
    val id: String,
    val idMember: String,
    val memberType: String,
    val unconfirmed: Boolean
)
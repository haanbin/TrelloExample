package com.test.trelloexample.data

data class Prefs(
    val background: String,
    val backgroundBottomColor: String,
    val backgroundBrightness: String,
    val backgroundColor: String,
    val backgroundImage: Any,
    val backgroundImageScaled: Any,
    val backgroundTile: Boolean,
    val backgroundTopColor: String,
    val calendarFeedEnabled: Boolean,
    val canBeEnterprise: Boolean,
    val canBeOrg: Boolean,
    val canBePrivate: Boolean,
    val canBePublic: Boolean,
    val canInvite: Boolean,
    val cardAging: String,
    val cardCovers: Boolean,
    val comments: String,
    val hideVotes: Boolean,
    val invitations: String,
    val isTemplate: Boolean,
    val permissionLevel: String,
    val selfJoin: Boolean,
    val voting: String
)
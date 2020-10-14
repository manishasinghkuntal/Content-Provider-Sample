package com.example.getdatafromcontentprovider.db

import android.net.Uri
import android.provider.BaseColumns

object DatabaseContract {

    const val AUTHORITY = "com.github.axet.callrecorder"
    const val SCHEME = "content"

    class NoteColumns : BaseColumns {

        companion object {
            private const val TABLE_NAME = "callrecord_table"
            const val ID = "id"
            const val LOGIN = "number"
            const val AVATAR = "time"
            const val NAME = "duration"
            const val COMPANY = "call_type"
            const val BLOG = "main_status"
            const val LOCATION = "sub_status"
            const val EMAIL = "comment"
            const val BIO = "isstored"
            const val FOLLOWERS = "audio"
            const val FOLLOWING = "audio"

            val CONTENT_URI: Uri = Uri.Builder().scheme(SCHEME)
                .authority(AUTHORITY)
                .appendPath(TABLE_NAME)
                .build()
        }
    }
}
package com.xl.xkit

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.fragment.app.Fragment

inline fun <reified T : Activity> Context.startActivity(vararg params: Pair<String, String>) {
    val intent = Intent(this, T::class.java)
    params.forEach { intent.putExtra(it.first, it.second) }
    startActivity(intent)
}

inline fun <reified T : Activity> Fragment.startActivity(vararg params: Pair<String, String>) {
    val intent = Intent(this.activity, T::class.java)
    params.forEach { intent.putExtra(it.first, it.second) }
    startActivity(intent)
}

package org.wikipedia.settings

import android.R
import android.content.Context
import android.util.AttributeSet
import android.widget.TextView
import androidx.preference.PreferenceViewHolder
import androidx.preference.SwitchPreferenceCompat

open class SwitchPreferenceMultiLine : SwitchPreferenceCompat {
    constructor(ctx: Context?, attrs: AttributeSet?, defStyle: Int) : super(ctx, attrs, defStyle) {}
    constructor(ctx: Context?, attrs: AttributeSet?) : super(ctx, attrs) {}
    constructor(ctx: Context?) : super(ctx) {}

    override fun onBindViewHolder(holder: PreferenceViewHolder) {
        super.onBindViewHolder(holder)
        val textView = holder.itemView.findViewById<TextView>(R.id.title)
        if (textView != null) {
            textView.isSingleLine = false
        }
    }
}
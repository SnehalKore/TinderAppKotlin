package com.example.navigationarchitecturewithkotlin.model

import android.graphics.Color
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.BindingAdapter
import androidx.databinding.library.baseAdapters.BR
import androidx.lifecycle.LiveData
import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.navigationarchitecturewithkotlin.R
import com.google.gson.annotations.SerializedName
import com.squareup.picasso.Picasso

@Entity
data class TinderMemberData(
    @NonNull @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "id") val ID: Int,
    @SerializedName("gender") @ColumnInfo(name = "gender") val gender: String,
    @SerializedName("phone") @ColumnInfo(name = "phone") val phone: String,
    @Embedded @SerializedName("picture") val picture: PictureDataModel,
    @Embedded @SerializedName("name") val name: MemberNameModel,
    @Embedded @SerializedName("login") val login: LoginModel,
    @ColumnInfo(name = "status", defaultValue = "Not updated") var status: String?
): BaseObservable() {
    var _status: String?
        @Bindable get() = status
        set(value) {
            status = value
            notifyPropertyChanged(BR._status)
        }
    companion object DataBindingAdapter {
        @BindingAdapter("bind:profile_path")
        @JvmStatic
        fun loadImage(imageView: ImageView, profile_path: String?) {
            Picasso.get().load("$profile_path").fit()
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(imageView)
        }

        @BindingAdapter("bind:textColorUpdate")
        @JvmStatic
        fun updateTextColor(textView: TextView, status: String?) {
            status?.let {
                if (status.contains("Member Rejected")) {
                    textView.setTextColor(Color.parseColor("#FF0000"))
                } else {
                    textView.setTextColor(Color.parseColor("#008000"))
                }
            }
        }
    }


}

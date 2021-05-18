package com.example.navigationarchitecturewithkotlin.views.interfaces

import com.example.navigationarchitecturewithkotlin.model.TinderMemberData


interface MemberListAdapterListener {
    fun onAcceptClick(member: TinderMemberData)
    fun onRejectClick(member: TinderMemberData)
}

package com.example.navigationarchitecturewithkotlin.views.fragments

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.navigationarchitecturewithkotlin.R
import com.example.navigationarchitecturewithkotlin.databinding.FragmentTinderMemberListBinding
import com.example.navigationarchitecturewithkotlin.model.TinderMemberData
import com.example.navigationarchitecturewithkotlin.repository.network.NetworkState
import com.example.navigationarchitecturewithkotlin.utils.ConnectionDetector
import com.example.navigationarchitecturewithkotlin.viewModel.TinderMemberListViewModel
import com.example.navigationarchitecturewithkotlin.views.activity.MainActivity
import com.example.navigationarchitecturewithkotlin.views.adapter.TinderMemberListAdapter
import com.example.navigationarchitecturewithkotlin.views.interfaces.MemberListAdapterListener

class MemberListFragment : Fragment() {
    private var tinderMemberListViewModel: TinderMemberListViewModel? = null
    private lateinit var fragmentTinderMemberListBinding: FragmentTinderMemberListBinding
    private lateinit var tinderMemberListAdapter: TinderMemberListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        fragmentTinderMemberListBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_tinder_member_list,
            container,
            false
        )
        tinderMemberListAdapter = TinderMemberListAdapter(this.context!!.applicationContext)
        fragmentTinderMemberListBinding.recyclerView.itemAnimator = DefaultItemAnimator()
        fragmentTinderMemberListBinding.recyclerView.layoutManager = LinearLayoutManager(context)
        fragmentTinderMemberListBinding.recyclerView.adapter = tinderMemberListAdapter
        if (tinderMemberListViewModel == null) {
            tinderMemberListViewModel =
                ViewModelProviders.of(this).get(TinderMemberListViewModel::class.java)
            getMemberList()
        }
        return fragmentTinderMemberListBinding.root
    }

    private fun getMemberList() {
        if (activity != null) {
            (activity as MainActivity).showProgress()
        }
        tinderMemberListViewModel!!.getData(ConnectionDetector.networkStatus(context!!))

        // Create the observer which updates the UI.
        val nameObserver = Observer<List<TinderMemberData>> { sampleData ->
                tinderMemberListAdapter.submitList(sampleData)
            tinderMemberListAdapter.setListener(object : MemberListAdapterListener {
                override fun onAcceptClick(member: TinderMemberData) {
                    tinderMemberListViewModel!!.updateStatus(
                        context!!.getString(R.string.accept_msg),
                        member.login.uuid
                    )
                }
                override fun onRejectClick(member: TinderMemberData) {
                    tinderMemberListViewModel!!.updateStatus(
                        context!!.getString(R.string.reject_msg),
                        member.login.uuid
                    )
                }
            })
            (activity as MainActivity).hideProgress()
        }

        val networkState = Observer<NetworkState> { networkState ->
            if (networkState.status === NetworkState.Status.FAILED) {
                Toast.makeText(context, "Network call failed", Toast.LENGTH_LONG).show()
            }
        }
        // Observe the LiveData, passing in this activity as the LifecycleOwner and the observer.
        tinderMemberListViewModel!!.networkState?.observe(this, networkState)
        tinderMemberListViewModel!!.sampleData?.observe(this, nameObserver)

    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        menu.clear()
        inflater.inflate(R.menu.filter_menu, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (ConnectionDetector.networkStatus(context!!)) {
            if (item.itemId == R.id.home) {
                findNavController().popBackStack()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

}

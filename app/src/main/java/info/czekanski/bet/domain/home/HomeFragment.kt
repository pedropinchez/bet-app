package info.czekanski.bet.domain.home


import android.arch.lifecycle.ViewModelProviders
import info.czekanski.bet.domain.base.BaseHomeFragment
import info.czekanski.bet.misc.safeObserve

class HomeFragment : BaseHomeFragment() {
    override fun initializeViewModel() {
        val viewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)
        viewModel.getCells().safeObserve(this, { matchesAdapter.setCells(it) })
    }
}
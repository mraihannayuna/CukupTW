package com.example.cukuptw.ui.pragments.okezone

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cukuptw.R
import com.example.cukuptw.adapter.NewsAdapter
import com.example.cukuptw.data.repository.NewsRepository
import com.example.cukuptw.databinding.FragmentTechnoBinding
import com.example.cukuptw.databinding.FragmentTerbaruBinding
import com.example.cukuptw.ui.NewsViewModel
import com.example.cukuptw.utils.NewsViewModelFactory

class TechnoFragment : Fragment() {

    lateinit var binding: FragmentTechnoBinding
    private val TechnoViewModel: NewsViewModel by viewModels {
        NewsViewModelFactory(NewsRepository())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTechnoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mAdapter = NewsAdapter()
        TechnoViewModel.getOkezoneTechnoNews()

        TechnoViewModel.okezoneTechnoNews.observe(viewLifecycleOwner) { dataNews ->
            dataNews?.data?.let { mAdapter.setData(it.posts) }
        }

        binding.rvOkezoneTechno.apply {
            adapter = mAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }

        TechnoViewModel.isLoading.observe(viewLifecycleOwner){
            isLoading(it)
        }

    }


    private fun isLoading(isLoading: Boolean) {
        if (isLoading) {
            binding.loadingView.root.visibility = View.VISIBLE
        } else {
            binding.loadingView.root.visibility = View.GONE
        }
    }



}
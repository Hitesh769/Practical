package com.example.practical.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.practical.R
import com.example.practical.adapter.GenericListAdapter
import com.example.practical.databinding.FragmentHomeBinding
import com.example.practical.model.CarResponse
import com.example.practical.model.SliderImage

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_home,
            container,
            false
        )//FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /* binding.buttonFirst.setOnClickListener {
             findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
         }*/
        var data = ArrayList<CarResponse>()
        data.add(CarResponse(activity!!,"RJ14WS4",R.drawable.roundimage))
        data.add(CarResponse(activity!!,"RJ14WS4",R.drawable.slider_one))
        data.add(CarResponse(activity!!,"RJ14WS4",R.drawable.roundimage))
        data.add(CarResponse(activity!!,"RJ14WS4",R.drawable.slider_one))

        data.add(CarResponse(activity!!,"Add Vehicles",R.drawable.ic_baseline_add_circle_24))

//        setCarListAdapter(data)

        var sliderlist = ArrayList<SliderImage>()
        sliderlist.add(SliderImage(activity!!,R.drawable.slider_one))
        sliderlist.add(SliderImage(activity!!,R.drawable.slider_two))
        sliderlist.add(SliderImage(activity!!,R.drawable.slider_one))
        sliderlist.add(SliderImage(activity!!,R.drawable.slider_two))
        sliderlist.add(SliderImage(activity!!,R.drawable.slider_one))
        sliderlist.add(SliderImage(activity!!,R.drawable.slider_two))

      /*  setSliderAdapter(sliderlist)

        binding.llBooking.cvMain.setCardBackgroundColor(ContextCompat.getColor(context!!,R.color.colorhome1))
        binding.llMyVehicle.cvMain.setCardBackgroundColor(ContextCompat.getColor(context!!,R.color.colorhome2))
        binding.llMyWallet.cvMain.setCardBackgroundColor(ContextCompat.getColor(context!!,R.color.colorhome3))
        binding.llGiftCard.cvMain.setCardBackgroundColor(ContextCompat.getColor(context!!,R.color.colorhome4))

        binding.llBooking.tvName.text="My Booking"
        binding.llMyVehicle.tvName.text="My Vehicles"
        binding.llMyWallet.tvName.text="My Wallet"
        binding.llGiftCard.tvName.text="Gift Card"

        binding.llBooking.ivLogo.setImageResource(R.drawable.bookings)
        binding.llMyVehicle.ivLogo.setImageResource(R.drawable.vehicle)
        binding.llMyWallet.ivLogo.setImageResource(R.drawable.wallet)
        binding.llGiftCard.ivLogo.setImageResource(R.drawable.gift)*/


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

 /*   private fun setCarListAdapter(data: ArrayList<CarResponse>?) {
        binding.rvCarList?.layoutManager = LinearLayoutManager(
            activity,
            LinearLayoutManager.HORIZONTAL,
            false
        )
        binding.rvCarList.adapter =
            GenericListAdapter<CarResponse>(data as java.util.ArrayList<CarResponse>,
                R.layout.row_car,
                object : GenericListAdapter.OnListItemClickListener<CarResponse> {
                    override fun onListItemClicked(
                        selItem: CarResponse,
                        extra: Any?,
                        position: Int
                    ) {
                    }
                })
        binding.rvCarList?.isNestedScrollingEnabled = false
    }*/

   /* private fun setSliderImages(data: ArrayList<SliderImage>?) {
        binding.rvCarList?.layoutManager = LinearLayoutManager(
            activity,
            LinearLayoutManager.HORIZONTAL,
            false
        )
        binding.infiniteCarousel.adapter =
            GenericListAdapter<SliderImage>(data as java.util.ArrayList<SliderImage>,
                R.layout.row_car,
                object : GenericListAdapter.OnListItemClickListener<SliderImage> {
                    override fun onListItemClicked(
                        selItem: SliderImage,
                        extra: Any?,
                        position: Int
                    ) {
                    }
                })
        binding.rvCarList?.isNestedScrollingEnabled = false
    }

    private fun setSliderAdapter(data: ArrayList<SliderImage>?) {
      *//*  binding.infiniteCarousel?.layoutManager = LinearLayoutManager(
            activity,
            LinearLayoutManager.HORIZONTAL,
            false
        )*//*
        binding.infiniteCarousel.adapter =
            GenericListAdapter<SliderImage>(data as java.util.ArrayList<SliderImage>,
                R.layout.row_image,
                object : GenericListAdapter.OnListItemClickListener<SliderImage> {
                    override fun onListItemClicked(
                        selItem: SliderImage,
                        extra: Any?,
                        position: Int
                    ) {
                    }
                })
        binding.infiniteCarousel?.scrollToPosition(2)
        binding.infiniteCarousel?.smoothScrollToPosition(2)
        binding.infiniteCarousel?.isNestedScrollingEnabled = false
    }*/
}
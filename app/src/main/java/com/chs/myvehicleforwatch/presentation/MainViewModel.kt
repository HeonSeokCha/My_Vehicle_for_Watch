package com.chs.myvehicleforwatch.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.chs.myvehicleforwatch.data.api.MyVehicleService
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val myVehicleService: MyVehicleService
) : ViewModel() {
    suspend fun getTest(): String {
        return myVehicleService.test()
    }
}
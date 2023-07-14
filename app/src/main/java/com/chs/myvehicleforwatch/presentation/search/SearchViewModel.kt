package com.chs.myvehicleforwatch.presentation.search

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.chs.myvehicleforwatch.common.Resource
import com.chs.myvehicleforwatch.domain.usecase.GetSearchResultStationUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(
    private val getSearchResultStationUseCase: GetSearchResultStationUseCase
) : ViewModel() {
    private val _state = MutableStateFlow(SearchState())
    val state = _state.asStateFlow()

    fun searchStation(query: String) {
        _state.update {
            it.copy(
                searchQuery = query
            )
        }
    }

    fun getSearchResult(query: String) {
        viewModelScope.launch {
            getSearchResultStationUseCase(query).collect { result ->
                _state.update {
                    when (result) {
                        is Resource.Loading -> {
                            it.copy(isLoading = true)
                        }

                        is Resource.Success -> {
                            it.copy(
                                isLoading = false,
                                searchResultList = result.data ?: emptyList()
                            )
                        }

                        is Resource.Error -> {
                            it.copy(
                                isLoading = false,
                                isError = result.message
                            )
                        }
                    }
                }
            }
        }
    }
}
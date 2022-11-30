package com.example.stateexample


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DashBoardViewModel @Inject constructor(
) : ViewModel() {


    val uiState = MutableStateFlow(DashboardState(false))

    fun changeTitle() {
        viewModelScope.launch {

            uiState.emit(uiState.value.copy(
                title = "Ciao"

            ))
        }
    }
}

data class DashboardState(
    val isLoading: Boolean = false,
    val title: String = "start"
)

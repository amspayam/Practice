package come.sliide.main.splash.presenter

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor() : ViewModel() {

    val navigationToMainFragment = MutableLiveData(false)

    init {
        viewModelScope.launch {
            delay(2000)
            navigationToMainFragment.postValue(true)
        }
    }
}
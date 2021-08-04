package com.iyoboyi.retrofitapp.UI

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.iyoboyi.retrofitapp.API.RetrofitProvider
import com.iyoboyi.retrofitapp.model.User
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    val usersLiveData = MutableLiveData<List<User>>()

    fun getUsers() {
        CoroutineScope(Dispatchers.IO).launch {
            usersLiveData.postValue(RetrofitProvider.placeHolderAPI.getUsers())
        }

    }
}

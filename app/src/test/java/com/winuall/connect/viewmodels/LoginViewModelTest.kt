package com.winuall.connect.viewmodels

import android.arch.core.executor.testing.InstantTaskExecutorRule
import android.arch.lifecycle.Observer
import com.winuall.connect.RxImmediateSchedulerRule
import com.winuall.connect.data.model.UserResponse
import com.winuall.connect.data.repository.UserRepository
import com.winuall.connect.ui.login.LoginViewModel
import io.reactivex.Single
import org.junit.Before
import org.junit.ClassRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner
import org.junit.Assert.*


@RunWith(MockitoJUnitRunner::class)
class LoginViewModelTest {

    @Rule
    @JvmField
    var rule = InstantTaskExecutorRule()

    companion object {
        @ClassRule
        @JvmField
        val schedulers = RxImmediateSchedulerRule()
    }

    @Mock
    lateinit var userRepository: UserRepository

    @Mock
    lateinit var observer: Observer<UserResponse>


    private lateinit var loginViewModel: LoginViewModel


    @Before
    fun setUp() {
        loginViewModel = LoginViewModel(userRepository)
    }

    @Test
    fun shouldShowUserAccountLoginName() {
        val userResponse = UserResponse()
        userResponse.name = "dummy"
        Mockito.`when`(userRepository.makeLoginOnServer("sdemo", "sdemo"))
            .thenReturn(Single.just(userResponse))
        loginViewModel.userResult.observeForever(observer)
        loginViewModel.makeLoginOnServer("sdemo", "sdemo")
       // assert(loginViewModel.userResult.value?.name == "dummy")
        assertEquals("dummy",loginViewModel.userResult.value?.name)

    }

}
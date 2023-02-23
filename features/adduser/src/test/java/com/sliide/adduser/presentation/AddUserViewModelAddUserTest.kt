package com.sliide.adduser.presentation

import app.cash.turbine.test
import com.sliide.adduser.domain.usecase.AddUserUseCase
import com.sliide.adduser.testdataprovider.AddUserDataProvider
import com.sliide.remote.utils.FailureData
import com.sliide.remote.utils.Resource
import come.sliide.base.view.onViewError
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.UnconfinedTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4


@Suppress("OPT_IN_USAGE_FUTURE_ERROR")
@ExperimentalCoroutinesApi
@RunWith(JUnit4::class)
class AddUserViewModelAddUserTest {

    // Mock
    private val addUserUseCase: AddUserUseCase = mockk()

    // Class for test
    private lateinit var addUserViewModel: AddUserViewModel

    @Before
    fun setup() {

        Dispatchers.setMain(UnconfinedTestDispatcher())

        // Mock for init
        coEvery {
            addUserUseCase(AddUserDataProvider.AddUserRequest())
        } returns flow { Resource.Success(AddUserDataProvider.AddUserResponse()) }

        // Initial viewModel
        addUserViewModel = AddUserViewModel(
            addUserUseCase = addUserUseCase
        )
    }

    @Test
    fun `call add user then useCase must execute`() = runTest {

        // Given
        coEvery {
            addUserUseCase(AddUserDataProvider.AddUserRequest())
        } returns flow { Resource.Success(AddUserDataProvider.AddUserResponse()) }

        // When
        addUserViewModel.addUser(
            username = "John Doe",
            email = "johndoe@gmail.com",
            gender = "male"
        )

        // Then
        coVerify {
            addUserUseCase(AddUserDataProvider.AddUserRequest())
        }

    }

    @Test
    fun `call add user then success response`() = runBlocking {

        // Given
        coEvery {
            addUserUseCase(AddUserDataProvider.AddUserRequest())
        } returns flow { Resource.Success(AddUserDataProvider.AddUserResponse()) }

        val job = launch {
            // Then
            addUserUseCase(AddUserDataProvider.AddUserRequest()).test {
                when (val emission = awaitItem()) {
                    is Resource.Success -> {
                        assert(emission.data?.id == "2031")
                    }
                }
                cancelAndIgnoreRemainingEvents()
            }
        }

        // When
        addUserViewModel.addUser(
            username = "John Doe",
            email = "johndoe@gmail.com",
            gender = "male"
        )

        job.join()
        job.cancel()

    }

    @Test
    fun `call add user then error response`() = runTest {

        // Given
        coEvery {
            addUserUseCase(AddUserDataProvider.AddUserRequest())
        } returns flow {
            Resource.Failure(FailureData(code = 500, message = "Error"))
        }

        // When
        addUserViewModel.addUser(
            username = "John Doe",
            email = "johndoe@gmail.com",
            gender = "male"
        )

        // Then
        addUserViewModel.addUserStateViewLiveData.observeForever {
            it.onViewError { _, messages ->
                assert(messages == "Error")
            }
        }

    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
    }

}
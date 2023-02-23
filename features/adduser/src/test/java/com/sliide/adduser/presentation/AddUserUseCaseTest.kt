package com.sliide.adduser.presentation

import com.sliide.adduser.data.repository.FakeAddUserRepository
import com.sliide.adduser.domain.usecase.AddUserUseCase
import com.sliide.adduser.testdataprovider.AddUserDataProvider
import com.sliide.remote.utils.Resource
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Before
import org.junit.Test

@Suppress("OPT_IN_USAGE_FUTURE_ERROR")
class AddUserUseCaseTest {

    private lateinit var addUserUseCase: AddUserUseCase
    private lateinit var fakeRepository: FakeAddUserRepository

    @Before
    fun setUp() {
        fakeRepository = FakeAddUserRepository()

        addUserUseCase = AddUserUseCase(
            repository = fakeRepository
        )
    }

    @After
    fun tearDown() {
    }

    @Test
    fun `call add user then success response`() = runBlocking {
        val response = addUserUseCase(
            rq = AddUserDataProvider.AddUserRequest()
        ).first()

        when (response) {
            is Resource.Success -> {
                assert(response.data?.id == "2031")
            }
        }

    }

}
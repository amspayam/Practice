package com.sliide.adduser.data.repository

import com.sliide.adduser.data.entities.AddUserResponseEntity
import com.sliide.adduser.domain.AddUserRepository
import com.sliide.adduser.domain.model.AddUserRequestModel
import com.sliide.adduser.testdataprovider.AddUserDataProvider
import com.sliide.remote.utils.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class FakeAddUserRepository : AddUserRepository {

    override fun addUser(addUserRequestModel: AddUserRequestModel): Flow<Resource<AddUserResponseEntity?>> {
        return flow {
            emit(
                Resource.Success(
                    AddUserDataProvider.AddUserResponse()
                )
            )
        }
    }
}
package com.sliide.users.data.remote

import com.sliide.remote.utils.Resource
import com.sliide.users.data.entities.UserEntity
import kotlinx.coroutines.flow.Flow

interface UsersRemoteDatasource {
    fun getUsers(): Flow<Resource<List<UserEntity>>>
    fun deleteUser(userId: String): Flow<Resource<Unit>>
}

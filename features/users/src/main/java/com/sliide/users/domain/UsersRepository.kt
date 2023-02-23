package com.sliide.users.domain

import com.sliide.remote.utils.Resource
import com.sliide.users.data.entities.UserEntity
import kotlinx.coroutines.flow.Flow

interface UsersRepository {
    fun getAllUsers(): Flow<Resource<List<UserEntity>>>
    fun deleteUser(userId: String): Flow<Resource<Unit>>
}
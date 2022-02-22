package com.example.android.githubsearchwithroom.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert

@Dao
interface GitHubRepoDao {
    @Insert
    suspend fun insert(repo: GitHubRepo)

    @Delete
    suspend fun delete(repo: GitHubRepo)
}
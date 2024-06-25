package com.comunidadedevspace.taskbeats

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update


@Dao
interface TaskDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(task: Task)

    @Query("select * from task")
    fun getAll(): List<Task>
    

    @Update(onConflict = OnConflictStrategy.REPLACE )
    fun update(task: Task)


    //Deletando todos
    @Query ("Delete from task")
    fun deleteAll()

    //Deletando pelo id
    @Query ("Delete from task WHERE ID =:id")
    fun deleteByID(id: Int)

}
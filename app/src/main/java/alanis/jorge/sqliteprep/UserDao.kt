package alanis.jorge.sqliteprep

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface UserDao {

    @Insert
    fun insert(user: User):Long

    @Query("SELECT * FROM users")
    fun getAllUsers(): List<User>

    @Update
    fun updateUser(user:User):Int

    @Delete
    fun deleteUser(user: User): Int

}
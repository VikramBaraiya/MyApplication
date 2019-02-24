package e.y.myapplication;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface UserDao {
    @Insert
    void insertUser(User u);
    @Query("select * from Users ")
    public List<User> getUser();



}

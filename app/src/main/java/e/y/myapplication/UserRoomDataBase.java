package e.y.myapplication;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {User.class},version=1)
public abstract class UserRoomDataBase extends RoomDatabase {
public abstract UserDao User_Dao();
private static UserRoomDataBase INSTANCE ;

}

package app.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class PromptDb extends SQLiteOpenHelper {
    public final static String TABLE_NAME = "Prompts";
    public final static String PROMPT_ID = "promptId";
    public final static String PROMPT_NAME = "promptName";
    public final static String PROMPT_GENRE = "promptGenre";
    public final static String PROMPT_TEXT = "promptText";
    
    private final static String CREATE_PROMPTS_TABLE = "create table Prompts(`promptId` int primary key autoincrement," +
            "`promptName` text not null unique," +
            "`promptGenre` int not null," +
            "`promptText` text not null);";
    
    public PromptDb(Context context, String name, CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
    
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_PROMPTS_TABLE);
    }
    
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO
    }
}

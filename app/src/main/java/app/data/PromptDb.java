package app.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class PromptDb extends SQLiteOpenHelper {
    public final static String TABLE_NAME_PROMPTS = "prompts";
    public static final String TABLE_NAME_GENRES = "genres";
    
    public final static String PROMPT_ID = "promptId";
    public final static String PROMPT_NAME = "promptName";
    public final static String PROMPT_GENRE_ID = "promptGenreId";
    public final static String PROMPT_GENRE = "promptGenre";
    public final static String PROMPT_TEXT = "promptText";
    
    private final static String CREATE_PROMPTS_TABLE = "create table " + TABLE_NAME_PROMPTS + "(" + PROMPT_ID + " int primary key autoincrement," +
            PROMPT_NAME + " text not null unique," +
            PROMPT_TEXT + " text not null);";
    
    private final static String CREATE_GENRES_TABLE = "create table " + TABLE_NAME_GENRES + "(" + PROMPT_GENRE_ID + " int primary key autoincrement," +
            PROMPT_GENRE + " text not null);";
    
    private final static String ALTER_PROMPTS_TABLE = "alter table " + TABLE_NAME_PROMPTS
            + " add column " + PROMPT_GENRE_ID + " int references " + TABLE_NAME_GENRES
            + "(" + PROMPT_GENRE_ID + ");";
    
    public PromptDb(Context context, String name, CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
    
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_PROMPTS_TABLE);
        db.execSQL(CREATE_GENRES_TABLE);
        db.execSQL(ALTER_PROMPTS_TABLE);
    }
    
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO
    }
}

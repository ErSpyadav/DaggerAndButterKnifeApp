package demo.pushnotification.mydaggerjan2020;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class SharedPrefModule {
    Context context;

    public SharedPrefModule(Context context) {
        this.context = context;
    }

    @Provides
    public Context provideContext(){
        return context;
    }

    @Provides
    @Singleton
    public SharedPreferences provideSharedPreferences(){
       return PreferenceManager.getDefaultSharedPreferences(context);
    }

}

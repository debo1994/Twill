package com.twill.news.dagger;

import com.twill.news.features.feeds.NewsListFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Anil on 30/05/2017.
 */
@Module
public abstract class FragmentBuilderModule {

    @ContributesAndroidInjector
    abstract NewsListFragment contributeNewsListFragment();
}

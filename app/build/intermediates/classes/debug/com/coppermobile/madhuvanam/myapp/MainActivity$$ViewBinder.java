// Generated code from Butter Knife. Do not modify!
package com.coppermobile.madhuvanam.myapp;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainActivity$$ViewBinder<T extends com.coppermobile.madhuvanam.myapp.MainActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131361797, "field 'welcomeText'");
    target.welcomeText = finder.castView(view, 2131361797, "field 'welcomeText'");
    view = finder.findRequiredView(source, 2131361798, "field 'songsListView'");
    target.songsListView = finder.castView(view, 2131361798, "field 'songsListView'");
  }

  @Override public void unbind(T target) {
    target.welcomeText = null;
    target.songsListView = null;
  }
}

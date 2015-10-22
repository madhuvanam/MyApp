// Generated code from Butter Knife. Do not modify!
package com.coppermobile.madhuvanam.myapp;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class SongsAdapter$ViewHolder$$ViewBinder<T extends com.coppermobile.madhuvanam.myapp.SongsAdapter.ViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131361809, "field 'coverImage'");
    target.coverImage = finder.castView(view, 2131361809, "field 'coverImage'");
    view = finder.findRequiredView(source, 2131361810, "field 'coverTitle'");
    target.coverTitle = finder.castView(view, 2131361810, "field 'coverTitle'");
    view = finder.findRequiredView(source, 2131361811, "field 'coverDescription'");
    target.coverDescription = finder.castView(view, 2131361811, "field 'coverDescription'");
    view = finder.findRequiredView(source, 2131361812, "field 'country'");
    target.country = finder.castView(view, 2131361812, "field 'country'");
  }

  @Override public void unbind(T target) {
    target.coverImage = null;
    target.coverTitle = null;
    target.coverDescription = null;
    target.country = null;
  }
}

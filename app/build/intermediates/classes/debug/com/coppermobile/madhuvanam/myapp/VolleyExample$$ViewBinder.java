// Generated code from Butter Knife. Do not modify!
package com.coppermobile.madhuvanam.myapp;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class VolleyExample$$ViewBinder<T extends com.coppermobile.madhuvanam.myapp.VolleyExample> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131361804, "field 'volleyText'");
    target.volleyText = finder.castView(view, 2131361804, "field 'volleyText'");
    view = finder.findRequiredView(source, 2131361805, "field 'volleyImage'");
    target.volleyImage = finder.castView(view, 2131361805, "field 'volleyImage'");
    view = finder.findRequiredView(source, 2131361806, "field 'volleyImage2'");
    target.volleyImage2 = finder.castView(view, 2131361806, "field 'volleyImage2'");
  }

  @Override public void unbind(T target) {
    target.volleyText = null;
    target.volleyImage = null;
    target.volleyImage2 = null;
  }
}

// Generated code from Butter Knife. Do not modify!
package com.coppermobile.madhuvanam.myapp;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class Webview$$ViewBinder<T extends com.coppermobile.madhuvanam.myapp.Webview> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131361799, "field 'collectionName'");
    target.collectionName = finder.castView(view, 2131361799, "field 'collectionName'");
    view = finder.findRequiredView(source, 2131361800, "field 'collectionPrice'");
    target.collectionPrice = finder.castView(view, 2131361800, "field 'collectionPrice'");
    view = finder.findRequiredView(source, 2131361801, "field 'trackPrice'");
    target.trackPrice = finder.castView(view, 2131361801, "field 'trackPrice'");
    view = finder.findRequiredView(source, 2131361802, "field 'radioStationUrl'");
    target.radioStationUrl = finder.castView(view, 2131361802, "field 'radioStationUrl'");
    view = finder.findRequiredView(source, 2131361803, "field 'webView'");
    target.webView = finder.castView(view, 2131361803, "field 'webView'");
  }

  @Override public void unbind(T target) {
    target.collectionName = null;
    target.collectionPrice = null;
    target.trackPrice = null;
    target.radioStationUrl = null;
    target.webView = null;
  }
}

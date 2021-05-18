// Generated by data binding compiler. Do not edit!
package com.example.navigationarchitecturewithkotlin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.navigationarchitecturewithkotlin.R;
import com.example.navigationarchitecturewithkotlin.model.TinderMemberData;
import com.example.navigationarchitecturewithkotlin.views.interfaces.MemberListAdapterListener;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ListRowBinding extends ViewDataBinding {
  @NonNull
  public final CircleImageView accept;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final Guideline guidelineEnd;

  @NonNull
  public final Guideline guidelineStart;

  @NonNull
  public final TextView memberDetails;

  @NonNull
  public final TextView memberName;

  @NonNull
  public final TextView memberStatus;

  @NonNull
  public final ImageView profileImage;

  @NonNull
  public final CircleImageView reject;

  @Bindable
  protected MemberListAdapterListener mCallback;

  @Bindable
  protected TinderMemberData mMember;

  protected ListRowBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CircleImageView accept, CardView cardView, Guideline guidelineEnd, Guideline guidelineStart,
      TextView memberDetails, TextView memberName, TextView memberStatus, ImageView profileImage,
      CircleImageView reject) {
    super(_bindingComponent, _root, _localFieldCount);
    this.accept = accept;
    this.cardView = cardView;
    this.guidelineEnd = guidelineEnd;
    this.guidelineStart = guidelineStart;
    this.memberDetails = memberDetails;
    this.memberName = memberName;
    this.memberStatus = memberStatus;
    this.profileImage = profileImage;
    this.reject = reject;
  }

  public abstract void setCallback(@Nullable MemberListAdapterListener callback);

  @Nullable
  public MemberListAdapterListener getCallback() {
    return mCallback;
  }

  public abstract void setMember(@Nullable TinderMemberData member);

  @Nullable
  public TinderMemberData getMember() {
    return mMember;
  }

  @NonNull
  public static ListRowBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_row, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ListRowBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ListRowBinding>inflateInternal(inflater, R.layout.list_row, root, attachToRoot, component);
  }

  @NonNull
  public static ListRowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_row, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ListRowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ListRowBinding>inflateInternal(inflater, R.layout.list_row, null, false, component);
  }

  public static ListRowBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ListRowBinding bind(@NonNull View view, @Nullable Object component) {
    return (ListRowBinding)bind(component, view, R.layout.list_row);
  }
}
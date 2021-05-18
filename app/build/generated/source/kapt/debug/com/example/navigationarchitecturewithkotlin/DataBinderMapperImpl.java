package com.example.navigationarchitecturewithkotlin;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.navigationarchitecturewithkotlin.databinding.FragmentTinderMemberListBindingImpl;
import com.example.navigationarchitecturewithkotlin.databinding.ListRowBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Generated;

@Generated("Android Data Binding")
public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTTINDERMEMBERLIST = 1;

  private static final int LAYOUT_LISTROW = 2;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(2);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.navigationarchitecturewithkotlin.R.layout.fragment_tinder_member_list, LAYOUT_FRAGMENTTINDERMEMBERLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.navigationarchitecturewithkotlin.R.layout.list_row, LAYOUT_LISTROW);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTTINDERMEMBERLIST: {
          if ("layout/fragment_tinder_member_list_0".equals(tag)) {
            return new FragmentTinderMemberListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_tinder_member_list is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTROW: {
          if ("layout/list_row_0".equals(tag)) {
            return new ListRowBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_row is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "_status");
      sKeys.put(2, "callback");
      sKeys.put(3, "member");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(2);

    static {
      sKeys.put("layout/fragment_tinder_member_list_0", com.example.navigationarchitecturewithkotlin.R.layout.fragment_tinder_member_list);
      sKeys.put("layout/list_row_0", com.example.navigationarchitecturewithkotlin.R.layout.list_row);
    }
  }
}

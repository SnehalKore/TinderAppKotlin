package com.example.navigationarchitecturewithkotlin.databinding;
import com.example.navigationarchitecturewithkotlin.R;
import com.example.navigationarchitecturewithkotlin.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ListRowBindingImpl extends ListRowBinding implements com.example.navigationarchitecturewithkotlin.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.guideline_start, 7);
        sViewsWithIds.put(R.id.guideline_end, 8);
        sViewsWithIds.put(R.id.cardView, 9);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListRowBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ListRowBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[2]
            , (androidx.cardview.widget.CardView) bindings[9]
            , (androidx.constraintlayout.widget.Guideline) bindings[8]
            , (androidx.constraintlayout.widget.Guideline) bindings[7]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.ImageView) bindings[1]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[3]
            );
        this.accept.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.memberDetails.setTag(null);
        this.memberName.setTag(null);
        this.memberStatus.setTag(null);
        this.profileImage.setTag(null);
        this.reject.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.example.navigationarchitecturewithkotlin.generated.callback.OnClickListener(this, 2);
        mCallback1 = new com.example.navigationarchitecturewithkotlin.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.member == variableId) {
            setMember((com.example.navigationarchitecturewithkotlin.model.TinderMemberData) variable);
        }
        else if (BR.callback == variableId) {
            setCallback((com.example.navigationarchitecturewithkotlin.views.interfaces.MemberListAdapterListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMember(@Nullable com.example.navigationarchitecturewithkotlin.model.TinderMemberData Member) {
        updateRegistration(0, Member);
        this.mMember = Member;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.member);
        super.requestRebind();
    }
    public void setCallback(@Nullable com.example.navigationarchitecturewithkotlin.views.interfaces.MemberListAdapterListener Callback) {
        this.mCallback = Callback;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.callback);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMember((com.example.navigationarchitecturewithkotlin.model.TinderMemberData) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMember(com.example.navigationarchitecturewithkotlin.model.TinderMemberData Member, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String MemberStatus1 = null;
        com.example.navigationarchitecturewithkotlin.model.TinderMemberData member = mMember;
        java.lang.String memberNameTitleJavaLangStringMemberNameFirst = null;
        java.lang.String memberPictureLarge = null;
        com.example.navigationarchitecturewithkotlin.views.interfaces.MemberListAdapterListener callback = mCallback;
        com.example.navigationarchitecturewithkotlin.model.PictureDataModel memberPicture = null;
        java.lang.String memberNameTitle = null;
        java.lang.String memberNameTitleJavaLangStringMemberNameFirstJavaLangString = null;
        java.lang.String memberNameLast = null;
        java.lang.String memberNameTitleJavaLangStringMemberNameFirstJavaLangStringMemberNameLast = null;
        java.lang.String memberNameFirst = null;
        com.example.navigationarchitecturewithkotlin.model.MemberNameModel MemberName1 = null;
        java.lang.String memberPhone = null;
        java.lang.String memberNameTitleJavaLangString = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (member != null) {
                    // read member.status
                    MemberStatus1 = member.getStatus();
                    // read member.picture
                    memberPicture = member.getPicture();
                    // read member.name
                    MemberName1 = member.getName();
                    // read member.phone
                    memberPhone = member.getPhone();
                }


                if (memberPicture != null) {
                    // read member.picture.large
                    memberPictureLarge = memberPicture.getLarge();
                }
                if (MemberName1 != null) {
                    // read member.name.title
                    memberNameTitle = MemberName1.getTitle();
                    // read member.name.last
                    memberNameLast = MemberName1.getLast();
                    // read member.name.first
                    memberNameFirst = MemberName1.getFirst();
                }


                // read (member.name.title) + (" ")
                memberNameTitleJavaLangString = (memberNameTitle) + (" ");


                // read ((member.name.title) + (" ")) + (member.name.first)
                memberNameTitleJavaLangStringMemberNameFirst = (memberNameTitleJavaLangString) + (memberNameFirst);


                // read (((member.name.title) + (" ")) + (member.name.first)) + (" ")
                memberNameTitleJavaLangStringMemberNameFirstJavaLangString = (memberNameTitleJavaLangStringMemberNameFirst) + (" ");


                // read ((((member.name.title) + (" ")) + (member.name.first)) + (" ")) + (member.name.last)
                memberNameTitleJavaLangStringMemberNameFirstJavaLangStringMemberNameLast = (memberNameTitleJavaLangStringMemberNameFirstJavaLangString) + (memberNameLast);
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.accept.setOnClickListener(mCallback1);
            this.reject.setOnClickListener(mCallback2);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.memberDetails, memberPhone);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.memberName, memberNameTitleJavaLangStringMemberNameFirstJavaLangStringMemberNameLast);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.memberStatus, MemberStatus1);
            com.example.navigationarchitecturewithkotlin.model.TinderMemberData.updateTextColor(this.memberStatus, MemberStatus1);
            com.example.navigationarchitecturewithkotlin.model.TinderMemberData.loadImage(this.profileImage, memberPictureLarge);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // member
                com.example.navigationarchitecturewithkotlin.model.TinderMemberData member = mMember;
                // callback
                com.example.navigationarchitecturewithkotlin.views.interfaces.MemberListAdapterListener callback = mCallback;
                // callback != null
                boolean callbackJavaLangObjectNull = false;



                callbackJavaLangObjectNull = (callback) != (null);
                if (callbackJavaLangObjectNull) {



                    callback.onRejectClick(member);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // member
                com.example.navigationarchitecturewithkotlin.model.TinderMemberData member = mMember;
                // callback
                com.example.navigationarchitecturewithkotlin.views.interfaces.MemberListAdapterListener callback = mCallback;
                // callback != null
                boolean callbackJavaLangObjectNull = false;



                callbackJavaLangObjectNull = (callback) != (null);
                if (callbackJavaLangObjectNull) {



                    callback.onAcceptClick(member);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): member
        flag 1 (0x2L): callback
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}
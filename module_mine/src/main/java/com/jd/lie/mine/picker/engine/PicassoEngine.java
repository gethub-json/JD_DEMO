package com.jd.lie.mine.picker.engine;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Parcel;
import android.widget.AbsListView;
import android.widget.GridView;
import android.widget.ImageView;

import com.jd.lie.mine.R;


/**
 * Author:    valuesfeng
 * Version    V1.0
 * Date:      16/1/1
 * Description:
 * Modification  History:
 * Date         	Author        		Version        	Description
 * -----------------------------------------------------------------------------------
 * 16/1/1          valuesfeng              1.0                    1.0
 * Why & What is modified:
 */
@SuppressLint("ParcelCreator")
public class PicassoEngine implements LoadEngine {
    @Override
    public void displayCameraItem(ImageView imageView) {

    }

    @Override
    public void displayImage(String path, ImageView imageView) {

    }

    @Override
    public void scrolling(GridView view) {

    }

    /**
     * Describe the kinds of special objects contained in this Parcelable
     * instance's marshaled representation. For example, if the object will
     * include a file descriptor in the output of {@link #writeToParcel(Parcel, int)},
     * the return value of this method must include the
     * {@link #CONTENTS_FILE_DESCRIPTOR} bit.
     *
     * @return a bitmask indicating the set of special object types marshaled
     * by this Parcelable object instance.
     */
    @Override
    public int describeContents() {
        return 0;
    }

    /**
     * Flatten this object in to a Parcel.
     *
     * @param dest  The Parcel in which the object should be written.
     * @param flags Additional flags about how the object should be written.
     *              May be 0 or {@link #PARCELABLE_WRITE_RETURN_VALUE}.
     */
    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }

//    private int img_loading;
//    private int img_camera;
//
//    public PicassoEngine() {
//        this(0, 0);
//    }
//
//    public PicassoEngine(int img_loading) {
//        this(img_loading,0);
//    }
//
//    public PicassoEngine(int img_camera, int img_loading) {
//        if (img_loading == 0)
//            this.img_loading = R.drawable.image_not_exist;
//        else
//            this.img_loading = img_loading;
//        if (img_camera == 0)
//            this.img_camera = R.drawable.ic_camera;
//        else
//            this.img_camera = img_camera;
//    }
//
//    @Override
//    public void displayImage(String path, ImageView imageView) {
//        chargeInit(imageView.getContext());
//        Picasso.with(imageView.getContext())
//                .load(path)
//                .centerCrop()
//                .fit()
//                .placeholder(img_loading)
//                .error(img_loading)
//                .into(imageView);
//    }
//
//    @Override
//    public void displayCameraItem(ImageView imageView) {
//        chargeInit(imageView.getContext());
//        Picasso.with(imageView.getContext())
//                .load(img_camera)
//                .centerCrop()
//                .fit()
//                .placeholder(img_camera)
//                .error(img_camera)
//                .into(imageView);
//    }
//
//    @Override
//    public void scrolling(GridView view) {
//        view.setOnScrollListener(new AbsListView.OnScrollListener() {
//            @Override
//            public void onScrollStateChanged(AbsListView view, int scrollState) {
//                final Picasso picasso = Picasso.with(view.getContext());
//                if (scrollState == SCROLL_STATE_IDLE || scrollState == SCROLL_STATE_TOUCH_SCROLL) {
//                    picasso.resumeTag(view.getContext());
//                } else {
//                    picasso.pauseTag(view.getContext());
//                }
//            }
//
//            @Override
//            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
//
//            }
//        });
//    }
//
//
//    private void chargeInit(Context context) {
//        if (Picasso.with(context) == null) {
//            throw new ExceptionInInitializerError(INITIALIZE_ENGINE_ERROR);
//        }
//    }
//
//    @Override
//    public int describeContents() {
//        return 0;
//    }
//
//    @Override
//    public void writeToParcel(Parcel dest, int flags) {
//        dest.writeInt(this.img_loading);
//        dest.writeInt(this.img_camera);
//    }
//
//    protected PicassoEngine(Parcel in) {
//        this.img_loading = in.readInt();
//        this.img_camera = in.readInt();
//    }
//
//    public static final Creator<PicassoEngine> CREATOR = new Creator<PicassoEngine>() {
//        public PicassoEngine createFromParcel(Parcel source) {
//            return new PicassoEngine(source);
//        }
//
//        public PicassoEngine[] newArray(int size) {
//            return new PicassoEngine[size];
//        }
//    };
}

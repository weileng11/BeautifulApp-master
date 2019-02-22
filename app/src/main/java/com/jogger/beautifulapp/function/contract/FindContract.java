package com.jogger.beautifulapp.function.contract;


import com.jogger.beautifulapp.base.BaseModel;
import com.jogger.beautifulapp.base.BaseView;
import com.jogger.beautifulapp.base.IPresenter;

public interface FindContract {
    interface Model extends BaseModel {
    }

    interface View extends BaseView {
    }

    interface Presenter extends IPresenter<View, Model> {

    }
}

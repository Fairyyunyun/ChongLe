package com.jiajia.presenter.modle.login;

import com.jiajia.presenter.impl.MvpView;

/**
 * Created by Lei on 2018/3/2.
 */
public interface ForgetPasswordMvpView extends MvpView {
  void updatePassword();
  void checkAccountCanRegister();
  void checkAccountCanRegisterFailed();
}

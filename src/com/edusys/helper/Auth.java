/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.helper;

import com.edusys.entity.EntityNhanVien;

/**
 *
 * @author user
 */
public class Auth {

    public static EntityNhanVien user = null;

    public static void clear() {
        Auth.user = null;
    }

    public static boolean isLogin() {
        return Auth.user != null;
    }

    public static boolean isManager() {
        return Auth.isLogin() && user.getVaiTro();
    }
}
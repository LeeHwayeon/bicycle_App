package com.example.myapplication;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest  {

    // 서버 URL 설정 (PHP 파일 연동)
    final static private String URL = "http://congping2.dothome.co.kr/Register.php";
    private Map<String, String> map;

    public RegisterRequest(String userID, String userPassword, String userGender, String userAge, String userGu, Response.Listener<String> listner) {
        super(Method.POST, URL, listner, null);

        map = new HashMap<>();
        map.put("userID", userID);
        map.put("userPassword", userPassword);
        map.put("userGender", userGender);
        map.put("userAge", userAge);
        map.put("userGu", userGu);
    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }

}

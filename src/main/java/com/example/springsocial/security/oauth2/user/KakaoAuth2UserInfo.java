package com.example.springsocial.security.oauth2.user;

import java.util.Map;

public class KakaoAuth2UserInfo extends OAuth2UserInfo {

    public KakaoAuth2UserInfo(Map<String, Object> attributes) {
        super(attributes);
    }

    @Override
    public String getId() {
        return "11";
    }

    @Override
    public String getName() {
        return "인욱";
    }

    @Override
    public String getEmail() {
        return "inwook94@naver.com";
    }

    @Override
    public String getImageUrl() {
        return "ㅇㅇㅇㅇ";
    }
}

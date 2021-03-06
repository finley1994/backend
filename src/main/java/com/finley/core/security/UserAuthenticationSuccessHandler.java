package com.finley.core.security;

/**
 * Created by 郑远锋 on 2017/3/1.
 */
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.security.web.savedrequest.RequestCache;

public class UserAuthenticationSuccessHandler extends
        SavedRequestAwareAuthenticationSuccessHandler {


    @Override
    public void onAuthenticationSuccess(HttpServletRequest request,
                                        HttpServletResponse response, Authentication authentication)
            throws ServletException, IOException {

    }

    @Override
    public void setRequestCache(RequestCache requestCache) {

        super.setRequestCache(requestCache);
    }



}
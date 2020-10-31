package com.wills.community.controller;

import com.wills.community.dto.GithubAccessTokenDTO;
import com.wills.community.dto.GithubUserDTO;
import com.wills.community.provider.GithubProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthorizeController {

    @Autowired
    private GithubProvider githubProvider;

    @GetMapping("/callback")
    public String callback(@RequestParam("state") String state, @RequestParam("code") String code) {
        GithubAccessTokenDTO accessToken = new GithubAccessTokenDTO();
        accessToken.setClient_id("2da0df27b29ef0b284f1");
        accessToken.setClient_secret("e9dd079798f18fcf3f8d62ab8edfa6a86527be91");
        accessToken.setCode(code);
        accessToken.setState(state);
        accessToken.setRedirect_uri("http://localhost:8080/callback");
        String accessTokenResult = githubProvider.getAccessToken(accessToken);
        GithubUserDTO githubUser = githubProvider.getGithubUser(accessTokenResult);
        // System.out.println(accessTokenResult);
        System.out.println(githubUser.getLogin());
        return "index";
    }
}

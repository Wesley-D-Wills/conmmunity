package com.wills.community.dto;

public class GithubIdentityDTO {
    private String client_id;
    private String redirect_uri;
    private String login;
    private String scope;
    private String state;
    private String allow_signup;

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getRedirect_uri() {
        return redirect_uri;
    }

    public void setRedirect_uri(String redirect_uri) {
        this.redirect_uri = redirect_uri;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAllow_signup() {
        return allow_signup;
    }

    public void setAllow_signup(String allow_signup) {
        this.allow_signup = allow_signup;
    }
}

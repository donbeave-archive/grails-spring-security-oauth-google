grails-spring-security-oauth-google
====================================

Google extension for [Grails Spring Security OAuth][spring-security-oauth-plugin] plugin

Installation
------------

Add the following plugin definition to your BuildConfig:
```groovy
// ...
plugins {
  // ...
  compile ':spring-security-oauth:2.0.2'
  compile ':spring-security-oauth-google:0.1'
  // ...
}
```

Usage
-----

Add to your Config:
```groovy
oauth {
  // ...
  providers {
    // ...
    // for Google OAuth 1.0
    google {
      api = org.scribe.builder.api.GoogleApi
      key = 'oauth_google_key'
      secret = 'oauth_google_secret'
      successUri = '/oauth/google/success'
      failureUri = '/oauth/google/error'
      callback = "${baseURL}/oauth/google/callback"
      scope = 'https://www.googleapis.com/auth/userinfo.email'
    }

    // for Google OAuth 2.0
    google {
      api = org.scribe.builder.api.GoogleApi20
      key = 'oauth_google_key'
      secret = 'oauth_google_secret'
      successUri = '/oauth/google/success'
      failureUri = '/oauth/google/error'
      callback = "${baseURL}/oauth/google/callback"
      scope = 'https://www.googleapis.com/auth/userinfo.profile https://www.googleapis.com/auth/userinfo.email'
    }
    // ...
  }
}
```

In your view you can use the taglib exposed from this plugin and from OAuth plugin to create links and to know if the user is authenticated with a given provider:
```xml
<oauth:connect provider="google" id="google-connect-link">Google</oauth:connect>

Logged with twitter?
<s2o:ifLoggedInWith provider="google">yes</s2o:ifLoggedInWith>
<s2o:ifNotLoggedInWith provider="google">no</s2o:ifNotLoggedInWith>
```

[spring-security-oauth-plugin]: https://github.com/enr/grails-spring-security-oauth

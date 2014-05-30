grails-spring-security-oauth-google [![Build Status](https://api.travis-ci.org/donbeave/grails-spring-security-oauth-google.png?branch=master)](https://travis-ci.org/donbeave/grails-spring-security-oauth-google)
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
  compile ':spring-security-oauth-google:0.2'
  // ...
}
```

Usage
-----

Add to your Config:


```groovy
def appName = grails.util.Metadata.current.'app.name'
def baseURL = grails.serverURL ?: "http://127.0.0.1:${System.getProperty('server.port', '8080')}/${appName}"
oauth {
  // ...
  providers {
    // ...

    // Choose only one "google" block

    // for Google OAuth 1.0 DEPRECATED from Google
    // it uses api class provided from Scribe library
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
      api = org.grails.plugin.springsecurity.oauth.GoogleApi20
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

Logged with google?
<s2o:ifLoggedInWith provider="google">yes</s2o:ifLoggedInWith>
<s2o:ifNotLoggedInWith provider="google">no</s2o:ifNotLoggedInWith>
```

You can look at [bagage's sample app][sample-app].

Copyright and license
---------------------

Copyright 2012-2014 Mihai Cazacu, Enrico Comiti and Alexey Zhokhov under the [Apache License, Version 2.0](LICENSE). Supported by [Polusharie][polusharie].

[polusharie]: http://www.polusharie.com
[spring-security-oauth-plugin]: https://github.com/enr/grails-spring-security-oauth
[sample-app]: https://github.com/bagage/grails-google-authentification-example

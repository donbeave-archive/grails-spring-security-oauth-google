package org.grails.plugin.springsecurity.oauth;

import org.scribe.model.Token;

import java.util.Date;

/**
 * @author <a href='mailto:donbeave@gmail.com'>Alexey Zhokhov</a>
 */
public class GoogleApi20Token extends Token {

    private final Date expiry;

    public GoogleApi20Token(java.lang.String token, java.lang.String secret, Date expiry, java.lang.String rawResponse) {
        super(token, secret, rawResponse);
        this.expiry = expiry;
    }

    public Date getExpiry() {
        return new Date(expiry.getTime());
    }

}

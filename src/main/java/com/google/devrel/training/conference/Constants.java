package com.google.devrel.training.conference;

import com.google.api.server.spi.Constant;

/**
 * Contains the client IDs and scopes for allowed clients consuming the conference API.
 */
public class Constants {
    public static final String WEB_CLIENT_ID = "233139222973-l687gt1nad3kkf7fc012nlu34bstms14.apps.googleusercontent.com";
    public static final String ANDROID_CLIENT_ID = "233139222973-l687gt1nad3kkf7fc012nlu34bstms14.apps.googleusercontent.com";
    public static final String IOS_CLIENT_ID = "233139222973-l687gt1nad3kkf7fc012nlu34bstms14.apps.googleusercontent.com";
    public static final String ANDROID_AUDIENCE = WEB_CLIENT_ID;
    public static final String EMAIL_SCOPE = Constant.API_EMAIL_SCOPE;
    public static final String API_EXPLORER_CLIENT_ID = Constant.API_EXPLORER_CLIENT_ID;

    public static final String MEMCACHE_ANNOUNCEMENTS_KEY = "RECENT_ANNOUNCEMENTS";
}
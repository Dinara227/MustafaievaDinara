package com.company;

import java.util.HashMap;
import java.util.Map;

public enum HTTPError {
    BADREQUEST(400),
    UNAUTHORISED(401),
    PAYMENTREQUIRED(402),
    FORBIDDEN(403),
    NOTFOUND(404),
    METHODNOTALLOWED(405),
    NOTACCEPTABLE(406),
    PROXYAUTHENTIFICATIONREQUIRED(407),
    REQUESTTIMEOUT(408);

    private int code;
    private static Map map = new HashMap<>();

    private HTTPError(int code) {
        this.code = code;
    }

    static {
        for (HTTPError error : HTTPError.values()) {
            map.put(error.code, error);
        }
    }

    public static HTTPError valueOf(int error) {
        return (HTTPError) map.get(error);
    }
}

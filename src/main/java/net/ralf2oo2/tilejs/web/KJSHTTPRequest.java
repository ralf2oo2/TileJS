package net.ralf2oo2.tilejs.web;

import dev.latvian.apps.tinyserver.http.HTTPRequest;
import dev.latvian.apps.tinyserver.http.response.HTTPPayload;
import dev.latvian.apps.tinyserver.http.response.HTTPResponse;
import org.jetbrains.annotations.Nullable;

public class KJSHTTPRequest extends HTTPRequest {

    @Override
    public HTTPResponse handleResponse(HTTPPayload payload, HTTPResponse response, @Nullable Throwable error) {
        return response.cors();
    }
}

package io.hello;


import java.net.URI;
import java.net.http.HttpClient;

public class Hello {

    private HttpClient httpClient;

    private URI clientUri;

    private String clientId;
    private String clientSecret;

    public Hello(HttpClient httpClient) {
        this.httpClient = httpClient;
    }
}

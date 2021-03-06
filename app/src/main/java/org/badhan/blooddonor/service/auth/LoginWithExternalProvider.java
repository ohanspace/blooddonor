package org.badhan.blooddonor.service.auth;

import org.badhan.blooddonor.core.ServiceRequest;

public final class LoginWithExternalProvider {

    private LoginWithExternalProvider(){}


    public static class Request extends ServiceRequest{
        public String providerName;
        public String authToken;
        public String clientId;

        public Request(String providerName, String authToken) {
            this.providerName = providerName;
            this.authToken = authToken;
            clientId = "android";
        }
    }

    public static class Response extends LoginResponse{

    }
}

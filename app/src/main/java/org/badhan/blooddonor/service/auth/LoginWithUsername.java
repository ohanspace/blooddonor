package org.badhan.blooddonor.service.auth;

import org.badhan.blooddonor.core.ServiceRequest;

public final class LoginWithUsername {

    private LoginWithUsername(){}

    public static class Request extends ServiceRequest {
        public String username;
        public String password;

        public Request(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }

    public static class Response extends LoginResponse{

    }
}

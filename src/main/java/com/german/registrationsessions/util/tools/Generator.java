package com.german.registrationsessions.util.tools;

import java.util.UUID;

public class Generator {

    public static String generateUniqueString() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().replace("-", "");
    }

}

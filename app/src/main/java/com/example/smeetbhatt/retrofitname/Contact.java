package com.example.smeetbhatt.retrofitname;

import com.google.gson.annotations.SerializedName;

/**
 * Created by smeetbhatt on 12/09/17.
 */

public class Contact {
    @SerializedName("name")
    private String Name;
    @SerializedName("email")
    private String Email;

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }
}

package com.example.smeetbhatt.retrofitname;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.POST;

/**
  * Defining method for api call
 * Created by smeetbhatt on 12/09/17.
 */

public interface ApiInterface {

    //method used to make api call
    @POST("get_contacts.php")
    Call<List<Contact>> getContacts();

}

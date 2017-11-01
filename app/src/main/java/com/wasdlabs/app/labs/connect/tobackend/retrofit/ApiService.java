package com.wasdlabs.app.labs.connect.tobackend.retrofit;

import com.wasdlabs.app.labs.connect.tobackend.model.Book;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by USER on 11/1/2017.
 */

public interface ApiService {

    /**
     * Call untuk retrofit
     *
     * @param apiKey apikey untuk google book
     * @param searchTerm
     * Search term for volumes that contain this text string. There are special keywords you can specify in the search terms to search in particular fields, such as:
     * intitle: Returns results where the text following this keyword is found in the title.
     * inauthor: Returns results where the text following this keyword is found in the author.
     * inpublisher: Returns results where the text following this keyword is found in the publisher.
     * subject: Returns results where the text following this keyword is listed in the category list of the volume.
     * isbn: Returns results where the text following this keyword is the ISBN number.
     * lccn: Returns results where the text following this keyword is the Library of Congress Control Number.
     * oclc: Returns results where the text following this keyword is the Online Computer Library Center number.
     *
     * @return
     */
    @GET("volumes")
    Call<Book> getBook(@Query("key") String apiKey, @Query("q") String searchTerm);
}

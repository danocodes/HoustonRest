package com.dtorrey.HoustonRest;

import org.apache.commons.lang3.tuple.ImmutablePair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Main util class that will contain the HTTP client. */
public class HoustonRest {

    private String url;
    private String body;
    private List<ImmutablePair> params = new ArrayList<>();

    public HoustonRest url( String url ) {

        this.url = url;
        return this;
    }

    public HoustonRest body( String body ) {

        return this;
    }

    public HoustonRest param( String name, String value ) {

        this.params.add( new ImmutablePair<>( name, value ) );

        return this;
    }

    public String get( int timeoutMillis ) throws IOException {

        StringBuilder result = new StringBuilder();
        URL urlObject = new URL( url );
        HttpURLConnection conn = (HttpURLConnection) urlObject.openConnection();
        conn.setRequestMethod( "GET" );
        conn.setConnectTimeout( timeoutMillis );
        conn.setReadTimeout( timeoutMillis );
        BufferedReader rd = new BufferedReader( new InputStreamReader( conn.getInputStream() ) );
        String line;
        while ( ( line = rd.readLine() ) != null ) {
            result.append( line );
        }
        rd.close();
        return result.toString();
    }

    public String post( int timeoutMillis ) {

        // Not implemented
        return "some response string";
    }
}
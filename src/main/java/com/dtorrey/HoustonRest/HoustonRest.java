package com.dtorrey.HoustonRest;

import org.apache.commons.lang3.tuple.ImmutablePair;

import java.util.ArrayList;
import java.util.List;

/**
 * Main util class that will contain the HTTP client. */
public class HoustonRest {

    private String url;
    private String body;
    private List<ImmutablePair> params = new ArrayList<>();

    public HoustonRest url( String url ) {

        return this;
    }

    public HoustonRest body( String body ) {

        return this;
    }

    public HoustonRest param( String name, String value  ) {

        this.params.add( new ImmutablePair<>( name, value ) );

        return this;
    }

    public String get( int timeoutMillis ) {

        // Not implemented
        return "some response string";
    }

    public String post( int timeoutMillis ) {

        // Not implemented
        return "some response string";
    }
}
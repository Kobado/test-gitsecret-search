package com.project.githubsearch.model;

import java.util.ArrayList;

public class Query {
    private String method;
    private ArrayList<String> arguments;

    public Query() {
        this.method = "";
        this.arguments = new ArrayList<String>();
    }

    /**
     * @return the arguments
     */
    public ArrayList<String> getArguments() {
        return arguments;
    }

    /**
     * @return the method
     */
    public String getMethod() {
        return method;
    }

    /**
     * @param method the method to set
     */
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * @param arguments the arguments to set
     */
    public void setArguments(ArrayList<String> arguments) {
        this.arguments = arguments;
    }

    @Override
    public String toString() {
        String query = "" + this.method;
        query += "(";
        for (int i = 0; i < this.arguments.size(); i++) {
            if (i != this.arguments.size()-1){
                query += this.arguments.get(i) + ", ";
            } else {
                query += this.arguments.get(i) + ")";
            }
        }
        return query;
    }

}

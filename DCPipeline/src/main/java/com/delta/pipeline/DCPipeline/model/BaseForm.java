package com.delta.pipeline.DCPipeline.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;



public class BaseForm
    implements Serializable
{
   
	private static final Logger LOGGER           = Logger.getLogger( BaseForm.class );
    private static final long   serialVersionUID = 7736055439471937694L;
    private final List<String>  errors           = new ArrayList<String>();
    private final List<String>  messages         = new ArrayList<String>();

    public List<String> getErrors()
    {
        return errors;
    }

    public List<String> getMessages()
    {
        return messages;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder( this.getClass().getSimpleName() ).append( "[" );
        builder.append( "errors: " ).append( errors );
        builder.append( ", messages: " ).append( messages );
        return builder.append( "]" ).toString();
    }

    protected void addErrors( String error )
    {
        getErrors().add( error );
    }

    protected void addMessages( String message )
    {
        getMessages().add( message );
    }

    protected void resetForm()
    {
        this.getErrors().clear();
        this.getMessages().clear();
        LOGGER.debug( this.getClass().getSimpleName() + " fields have been reset" );
    }
}

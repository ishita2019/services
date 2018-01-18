package com.delta.pipeline.DCPipeline.model;


import java.io.Serializable;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class LoginForm extends BaseForm implements Serializable 
{
	private static final long serialVersionUID = -1498009889381199747L;
	private static final Logger LOGGER           = Logger.getLogger( LoginForm.class );
	private String username;
    private String password;
    private String station;

    public String getUsername()
    {
        return username;
    }

    public void setUsername( String inUserName )
    {
        this.username = inUserName;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword( String inPassword )
    {
        this.password = inPassword;
    }

    public String getStation()
    {
        return station;
    }

    public void setStation( String inStation )
    {
        this.station = inStation;
    }

    
    @Override
    public void resetForm()
    {
        super.resetForm();
        setPassword( null );
        setUsername( null );
        LOGGER.debug( this.getClass().getSimpleName() + " fields have been reset" );
    }
}

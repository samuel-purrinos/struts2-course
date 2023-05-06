
package com.uichesoh.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.uichesoh.model.Persona;
import org.apache.logging.log4j.*;


public class PersonasAction extends ActionSupport{
    
    Logger log = LogManager.getLogger(PersonasAction.class);
    
    Persona persona;

    @Override
    public String execute() throws Exception {
        if(this.persona!=null){
            log.info("\n");
            log.info("persona: "+persona);
        }else{
            log.info("persona con valor nulo");
        }
        
        return SUCCESS;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    
}

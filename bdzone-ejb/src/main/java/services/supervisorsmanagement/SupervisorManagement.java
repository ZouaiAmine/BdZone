package services.supervisorsmanagement;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class SupervisorManagement
 */
@Stateless
@LocalBean
public class SupervisorManagement implements SupervisorManagementRemote, SupervisorManagementLocal {

    /**
     * Default constructor. 
     */
    public SupervisorManagement() {
        // TODO Auto-generated constructor stub
    }

}

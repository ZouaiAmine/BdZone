package services.traineemanagment;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class TraineeManagement
 */
@Stateless
@LocalBean
public class TraineeManagement implements TraineeManagementRemote, TraineeManagementLocal {

    /**
     * Default constructor. 
     */
    public TraineeManagement() {
        // TODO Auto-generated constructor stub
    }

}

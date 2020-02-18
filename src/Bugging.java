
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.cognizant.medicare.dao.AdminDaoSqlImpl;
import com.cognizant.medicare.dao.DoctorDaoSqlImpl;
import com.cognizant.medicare.dao.PatientDaoSqlImpl;
import com.cognizant.medicare.model.Admin;
import com.cognizant.medicare.model.Doctor;
import com.cognizant.medicare.model.Patient;

public class Bugging {

    @Test
    public void testadminDetailPwd() {

        Admin admin;
        AdminDaoSqlImpl dao = new AdminDaoSqlImpl();
        admin = dao.getAdminDetails("rehana");
        assertEquals("rehana", admin.getPass_word());
    }
   /* @Test
    public void testadminDetailsInsert()
    {
        Admin admin=new Admin();
        AdminDaoSqlImpl dao=new AdminDaoSqlImpl();
        admin=dao.insertAdminDetails();
        assertEquals("1166",admin.getAdmin_Id());
    }*/

    @Test
    public void testpatientDetailPwd() {

        Patient patient;
        PatientDaoSqlImpl dao = new PatientDaoSqlImpl();
        patient = dao.getPatientDetails("abbu");
        assertEquals("abbu", patient.getPass_word());
    }

    @Test
    public void testdoctorDetailPwd() {

        Doctor doctor;
        DoctorDaoSqlImpl dao = new DoctorDaoSqlImpl();
        doctor = dao.getDoctorDetails("reshma");
        assertEquals("reshma", doctor.getPass_word());
    }

}

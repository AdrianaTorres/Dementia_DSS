/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dementia_dss;

/**
 *
 * @author adria
 */
public class QuerysInsert {

    String hola; // Hago esto para que me deje guardar y subirlo jeje
    /*
    private Conector conn = (Conector) Main.conector;
	//change the Integer you are changing

	public void insertDoctor(Doctor doctor) throws SQLException {
		String query;
		query = "INSERT into doctor (username,password,email,gender,idspeciality,mobilephone,name,surname,nif,dob,idaddress) values (?,?,?,?,?,?,?,?,?,?,?)";
		QuerysSelect qs = new QuerysSelect();
		PreparedStatement st = conn.getConnect().prepareStatement(query);
		int idspeciality = 0;

		st.setString(1, doctor.getUsername());
		st.setString(2, doctor.getPassword());
		st.setString(3, doctor.getEmail());
		if(doctor.getGender().equals("Male")) {
			st.setString(4,"Male");
		}
		else {
			st.setString(4,"Female");
		}
		idspeciality = qs.selectIdSpeciality(doctor.getSpeciality());
		st.setInt(5, idspeciality);
		st.setInt(6,doctor.getMobilePhone());
		st.setString(7,doctor.getName());
		st.setString(8, doctor.getSurname());
		st.setString(9,doctor.getNIF());
		st.setDate(10, doctor.getDob());
		st.setInt(11, doctor.getAddress().getID());

		st.executeUpdate();
		st.close();
	}
     */
}

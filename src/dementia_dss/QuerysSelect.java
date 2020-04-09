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
public class QuerysSelect {

    String hola; // Hago esto para que me deje guardar y subirlo jeje
    /*

   private Conector conn = (Conector) Main.conector;

	public String[] selectUser(String user, String psw) throws SQLException {
		String[] data = new String[2];
		String query = "SELECT USERNAME, PASSWORD from mappinglogin where username = '" + user + "' and password = '"
				+ psw + "'";
		PreparedStatement st = conn.getConnect().prepareStatement(query);
		ResultSet set = st.executeQuery();
		while (set.next()) {
			data[0] = set.getString("username");
			data[1] = set.getString("password");
		}

		st.close();
		set.close();

		return data;
	}


     */

}

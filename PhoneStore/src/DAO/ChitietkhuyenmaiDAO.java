package DAO;

import DTO.ChitietkhuyenmaiDTO;
import DTO.SanPhamDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */
public class ChitietkhuyenmaiDAO {
    
    
    public List<ChitietkhuyenmaiDTO> getAllCTKM() {
        List<ChitietkhuyenmaiDTO> chitietKMs = new ArrayList<>();
        
        Connection connection = JDBCConnection.getConnection();
        
        String sql = "SELECT * FROM CHITIETKHUYEMMAI";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                ChitietkhuyenmaiDTO chitietKM = new ChitietkhuyenmaiDTO();
                
                chitietKM.setMaKM(rs.getString("MAKM"));
                chitietKM.setMaSP(rs.getString("TENKM"));
                chitietKM.setTileKM(rs.getInt("TILEKM"));
                
                chitietKMs.add(chitietKM);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return chitietKMs;
    }
}


package dao;

import java.util.List;
import pyramids.Pyramids;


public interface PyramidsDao {
    List<Pyramids> GetObjectsFromTxt(String path);
}

package repository;

import com.bob.vehiclemanag.VehicleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author LiuHaoiang
 * @date 2018/5/13 20:23
 */
public interface VehicleRepository extends JpaRepository<VehicleEntity,Integer>{
}

package controller;

import com.bob.vehiclemanag.VehicleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import repository.VehicleRepository;

import java.util.List;

/**
 * @author LiuHaoiang
 * @date 2018/5/13 20:22
 */
@RestController
public class VehicleConntroller {

    @Autowired
    private VehicleRepository vehicleRepository;

    @GetMapping(value = "/getAll")
    public List<VehicleEntity> getAll(){
        return vehicleRepository.findAll();
    }

    /**
     * 添加一个girl对象
     * @param weight
     * @return
     */
    @PostMapping(value = "/addVehicle")
    public VehicleEntity addGirl(@RequestParam("vehicleNum")String vehicleNum,
                        @RequestParam("vehicleWeight")String weight,
                        @RequestParam("vehicleCheckInTime")String vehicleCheckInTime){
        VehicleEntity vehicleEntity = new VehicleEntity();
        vehicleEntity.setVehicleNum(vehicleNum);
        vehicleEntity.setVehicleWeight(weight);
        vehicleEntity.setVehicleCheckInTime(vehicleCheckInTime);
        return vehicleRepository.save(vehicleEntity);
    }

}

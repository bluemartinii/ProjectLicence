package com.example.ProjectLicence.model;

import com.example.ProjectLicence.model.entity.Vehicle;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;

public interface VehicleReq {

    @Data
    class VehicleDto {
        private Date maintenanceDate;

        private String plate;

        private Boolean isPenalty;

        private Date penaltyDate;

        private String name;

        private String surname;

        private String brand;

        private String model;

        private String productionYear;

        private String vehicleType;

        private Date passDate;

        public VehicleDto(Vehicle vehicle) {
            this.plate = vehicle.getPlate();
            this.maintenanceDate = vehicle.getMaintenanceDate();
            if (vehicle.getIsPenalty() != null) {
                this.isPenalty = vehicle.getIsPenalty();
                this.penaltyDate = vehicle.getPenaltyDate();
            }
            this.name = vehicle.getName();
            this.surname = vehicle.getSurname();
            this.brand = vehicle.getBrand();
            this.model = vehicle.getModel();
            this.productionYear = vehicle.getProductionYear();
            this.vehicleType = vehicle.getVehicleType();
            this.passDate = vehicle.getPassDate();
        }
    }


    @Data
    class VehicleRequest{

        @NotNull
        private String plate;
    }
}

package katanskiy.DemoTemplate.objects;


import org.springframework.stereotype.Component;

@Component
public class Parking {
    private static int parkPlace = 100;

    public boolean carEnter(){
        if(parkPlace == 0){
            System.out.println("There` s no place on the parking.");
            return false;
        }
        parkPlace --;
        return true;
    }

    public boolean carAway(){
        if(parkPlace == 100){
            return false;
        }
        parkPlace ++;
        return true;
    }

    public int getParkPlace() {
        return parkPlace;
    }

}



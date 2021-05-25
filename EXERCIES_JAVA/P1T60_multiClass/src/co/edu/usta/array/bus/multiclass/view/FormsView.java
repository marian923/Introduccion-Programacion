package co.edu.usta.array.bus.multiclass.view;

import co.edu.usta.array.bus.multiclass.logic.Vehicle;

import javax.swing.*;

public class FormsView {
    private static Vehicle myVehicle;
    //create a program that do it manage the bus places with difference X for unavailable, D available, O for busy
    //the bus have 4 columns but the number of rows must be specified by the driver
    public static void main(String []params){
        myVehicle=new Vehicle();
        String value, showInfo, valuefloat, valueint;
        int  valueInt1 = 0, showinfoint;
        float showinfofloat,  valuefloat1;

        //read the value
        value=JOptionPane.showInputDialog("Please type the kind of service of your vehicle");
        //set the value in the serviceType variable
        myVehicle.setServiceType(value);

        //get the serviceType value stored in the variable
        showInfo= myVehicle.getServiceType();
        JOptionPane.showMessageDialog(null, "Your kind service for this vehicle is: "+showInfo);

        value=JOptionPane.showInputDialog("Please type the kind of color of your vehicle");
        myVehicle.setColor(value);
        showInfo=myVehicle.getColor();
        JOptionPane.showMessageDialog(null, "Your color for this vehicle is: "+showInfo);

        value=JOptionPane.showInputDialog("Please type the kind of brand of your vehicle");
        myVehicle.setBrand(value);
        showInfo=myVehicle.getBrand();
        JOptionPane.showMessageDialog(null, "Your brand for this vehicle is: "+showInfo);

        valuefloat=JOptionPane.showInputDialog("Please type the kind of width of your vehicle");
        valuefloat1 = Float.parseFloat(valuefloat);
        myVehicle.setWidth(valuefloat1);
        showinfofloat=myVehicle.getWidth();
        JOptionPane.showMessageDialog(null, "Your width for this vehicle is: "+showinfofloat);

        valuefloat=JOptionPane.showInputDialog("Please type the kind of height of your vehicle");
        valuefloat1 = Float.parseFloat(valuefloat);
        myVehicle.setHeight(valuefloat1);
        showinfofloat=myVehicle.getHeight();
        JOptionPane.showMessageDialog(null, "Your height for this vehicle is: "+showinfofloat);

        valueint=JOptionPane.showInputDialog("Please type the kind of doors of your vehicle");
        valueInt1=Integer.parseInt(valueint);
        myVehicle.setDoorsNumbers(valueInt1);
        showinfoint=myVehicle.getDoorsNumber();
        JOptionPane.showMessageDialog(null, "Your doors for this vehicle is: "+showinfoint);

        valueint=JOptionPane.showInputDialog("Please type the kind of wheels of your vehicle");
        valueInt1=Integer.parseInt(valueint);
        myVehicle.setWheelsNumber(valueInt1);
        showinfoint=myVehicle.getWheelsNumber();
        JOptionPane.showMessageDialog(null, "Your wheels for this vehicle is: "+showinfoint);

        value=JOptionPane.showInputDialog("Please type the kind of plates of your vehicle");
        myVehicle.setPlates(value);
        showInfo=myVehicle.getPlates();
        JOptionPane.showMessageDialog(null, "Your brand for this vehicle is: "+showInfo);

    }

}

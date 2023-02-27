module es.damdi.raulherreriascorral.MavenAddressAppBasica {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml.bind;
	requires java.prefs;
    
    opens es.damdi.raulherreriascorral.MavenAddressAppBasica to javafx.fxml;
    opens es.damdi.raulherreriascorral.MavenAddressAppBasica.controller;
    opens es.damdi.raulherreriascorral.MavenAddressAppBasica.model;
    opens es.damdi.raulherreriascorral.MavenAddressAppBasica.util;
    
    exports es.damdi.raulherreriascorral.MavenAddressAppBasica;
}
package keresztezodes.j.diagrams;

import keresztezodes.x.model.gyLampa;
import keresztezodes.x.model.gyLampa.Init;
import keresztezodes.x.model.gyLampa.Zold;
import keresztezodes.x.model.gyLampa.ZVillog;
import keresztezodes.x.model.gyLampa.Piros;

import hu.elte.txtuml.api.layout.Row;
import hu.elte.txtuml.api.layout.StateMachineDiagram;

public class GyLampaSMDiagram extends StateMachineDiagram<gyLampa> {
	
	//Init will be in the first row
	//The others will be in the second row
	@Row({ Init.class })
	@Row({ Zold.class, ZVillog.class,Piros.class })
	class CarLay extends Layout {
	}
}

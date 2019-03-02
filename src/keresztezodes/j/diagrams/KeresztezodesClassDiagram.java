package keresztezodes.j.diagrams;

import keresztezodes.x.model.keresztezodes;
import keresztezodes.x.model.aLampa;
import keresztezodes.x.model.gyLampa;

import hu.elte.txtuml.api.layout.ClassDiagram;
import hu.elte.txtuml.api.layout.Right;
import hu.elte.txtuml.api.layout.South;


public class KeresztezodesClassDiagram extends ClassDiagram {

	@Right(from = keresztezodes.class,
			val = aLampa.class)
	@South(from = keresztezodes.class,
	val = gyLampa.class)
	
	class KerLayout extends Layout {
	}
}

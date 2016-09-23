package org.umuc.swen.capstone.brewer;

import java.awt.event.ActionEvent;
import org.cytoscape.application.swing.AbstractCyAction;
import org.cytoscape.application.swing.CySwingApplication;
import org.cytoscape.application.swing.CytoPanel;
import org.cytoscape.application.swing.CytoPanelName;
import org.cytoscape.application.swing.CytoPanelState;


public class ControlPanelAction extends AbstractCyAction {

	private static final long serialVersionUID = 1L;
	private CySwingApplication desktopApp;
	private final CytoPanel cytoPanelWest;
	private BrewerPanelComponent brewerPanelComponent;
	
	public ControlPanelAction(CySwingApplication desktopApp,
			BrewerPanelComponent myCytoPanel){
		// Add a menu item -- Apps->sample02
		super("Brewer Scale");
		setPreferredMenu("Apps.Samples");

		this.desktopApp = desktopApp;
		
		this.cytoPanelWest = this.desktopApp.getCytoPanel(CytoPanelName.WEST);
		this.brewerPanelComponent = myCytoPanel;
	}

	public void actionPerformed(ActionEvent e) {
		// If the state of the cytoPanelWest is HIDE, show it
		if (cytoPanelWest.getState() == CytoPanelState.HIDE) {
			cytoPanelWest.setState(CytoPanelState.DOCK);
		}	

		// Select my panel
		int index = cytoPanelWest.indexOfComponent(brewerPanelComponent.getComponent());
		if (index == -1) {
			return;
		}
		cytoPanelWest.setSelectedIndex(index);
	}

}
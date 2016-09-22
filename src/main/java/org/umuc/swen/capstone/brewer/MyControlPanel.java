package org.umuc.swen.capstone.brewer;

import java.awt.Component;
import javax.swing.Icon;
import org.cytoscape.application.swing.CytoPanelComponent;
import org.cytoscape.application.swing.CytoPanelName;
import org.umuc.swen.capstone.brewer.view.BrewerScaleMainPanel;

public class MyControlPanel implements CytoPanelComponent {

  private final BrewerScaleMainPanel brewerScaleMainPanel;
  private final static String TITLE = "Brewer Scale";

  public MyControlPanel() {
    this.brewerScaleMainPanel = new BrewerScaleMainPanel();
  }


  public Component getComponent() {
    return this.brewerScaleMainPanel;
  }


  public CytoPanelName getCytoPanelName() {
    return CytoPanelName.WEST;
  }


  public String getTitle() {
    return TITLE;
  }


  public Icon getIcon() {
    return null;
  }
}

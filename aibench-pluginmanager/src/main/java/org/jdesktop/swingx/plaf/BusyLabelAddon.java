/*
 * #%L
 * The AIBench Plugin Manager Plugin
 * %%
 * Copyright (C) 2006 - 2017 Daniel Glez-Peña and Florentino Fdez-Riverola
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-3.0.html>.
 * #L%
 */
/*
 * $Id: BusyLabelAddon.java,v 1.1 2009-04-13 22:17:51 mrjato Exp $
 *
 * Copyright 2004 Sun Microsystems, Inc., 4150 Network Circle,
 * Santa Clara, California 95054, U.S.A. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */
package org.jdesktop.swingx.plaf;

import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.plaf.ColorUIResource;

import org.jdesktop.swingx.JXBusyLabel;

/**
 * Addon for <code>JXBusyLabel</code>.<br>
 *
 * @author rah003
 */
public class BusyLabelAddon extends AbstractComponentAddon {

  public BusyLabelAddon() {
    super("JXBusyLabel");
  }

  @Override
  protected void addBasicDefaults(LookAndFeelAddons addon, DefaultsList defaults) {
    defaults.add(JXBusyLabel.uiClassID, "org.jdesktop.swingx.plaf.basic.BasicBusyLabelUI");
    defaults.add("JXBusyLabel.delay", 100);
    defaults.add("JXBusyLabel.baseColor", new ColorUIResource(Color.LIGHT_GRAY));
    defaults.add("JXBusyLabel.highlightColor", new ColorUIResource(UIManagerExt.getSafeColor("Label.foreground", Color.BLACK)));
    float barLength = 8;
    float barWidth = 4;
    float height = 26;
    defaults.add("JXBusyLabel.pointShape", new ShapeUIResource(
            new RoundRectangle2D.Float(0, 0, barLength, barWidth,
                barWidth, barWidth)));
    defaults.add("JXBusyLabel.trajectoryShape", new ShapeUIResource(
            new Ellipse2D.Float(barLength / 2, barLength / 2, height
                    - barLength, height - barLength)));
    

  }
}

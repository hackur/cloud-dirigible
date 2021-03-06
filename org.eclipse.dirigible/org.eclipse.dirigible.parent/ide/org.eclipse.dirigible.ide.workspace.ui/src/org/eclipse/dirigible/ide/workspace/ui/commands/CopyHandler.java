/******************************************************************************* 
 * Copyright (c) 2015 SAP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   SAP - initial API and implementation
 *******************************************************************************/

package org.eclipse.dirigible.ide.workspace.ui.commands;

import java.util.SortedSet;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IResource;

import org.eclipse.dirigible.ide.repository.ui.command.Clipboard;

public class CopyHandler extends AbstractClipboardHandler {

	protected void execute(ExecutionEvent event, SortedSet<IResource> resources) {
		if (resources.size() == 0) {
			return;
		}

		Clipboard clipboard = Clipboard.getInstance();
		clipboard.clear();
		clipboard.setCommand(COPY);

		for (IResource resource : resources) {
			clipboard.add(resource);
		}
	}

}

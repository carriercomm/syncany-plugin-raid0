/*
 * Syncany, www.syncany.org
 * Copyright (C) 2011-2015 Philipp C. Heckel <philipp.heckel@gmail.com> 
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.syncany.operations.daemon.messages;

import org.simpleframework.xml.Element;

public class LsRemoteEndSyncExternalEvent extends SyncExternalEvent {
	@Element(name = "hasChanges", required = true)
	private boolean hasChanges;
	
	public LsRemoteEndSyncExternalEvent() {
		this.hasChanges = false;
	}
	
	public LsRemoteEndSyncExternalEvent(String root, boolean hasChanges) {
		super(root);
		this.hasChanges = hasChanges;
	}
	
	public boolean hasChanges() {
		return hasChanges;
	}	
}

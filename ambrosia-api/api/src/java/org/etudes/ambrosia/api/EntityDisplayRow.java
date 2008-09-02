/**********************************************************************************
 * $URL$
 * $Id$
 ***********************************************************************************
 *
 * Copyright (c) 2008 Etudes, Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Portions completed before September 1, 2008 Copyright (c) 2007, 2008 Sakai Foundation,
 * licensed under the Educational Community License, Version 2.0
 *
 *       http://www.osedu.org/licenses/ECL-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 **********************************************************************************/

package org.etudes.ambrosia.api;

/**
 * EntityDisplayRow describes one row of an EntityDisplay.
 */
public interface EntityDisplayRow extends Container
{
	/**
	 * Get the selector reference for the column. This will provide the value to display for each entity in this column.
	 * 
	 * @return The selector reference for the column.
	 */
	PropertyReference getProperty();

	/**
	 * Access the row title message.
	 * 
	 * @return The row title message.
	 */
	Message getTitle();

	/**
	 * Set the selector reference for the column. This will provide the value to display for each entity in this column.
	 * 
	 * @param propertyReference
	 *        The selector reference for the column.
	 */
	EntityDisplayRow setProperty(PropertyReference propertyReference);

	/**
	 * Set the row title message.
	 * 
	 * @param selector
	 *        The message selector.
	 * @param references
	 *        one or more (or an array) of UiPropertyReferences to form the additional values in the formatted message.
	 */
	EntityDisplayRow setTitle(String selector, PropertyReference... references);
}

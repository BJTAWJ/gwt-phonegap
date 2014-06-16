/*
 * Copyright 2010 Daniel Kurka
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.googlecode.gwtphonegap.client.accelerometer;

import java.util.Date;

/**
 * Contains {@link Accelerometer} data captured at a specific point in time.
 * 
 * @author Daniel Kurka
 * 
 */
public interface Acceleration {

	/**
	 * Amount of motion on the x-axis. Range [0, 1]
         * @return 
	 */
	public double getX();

	/**
	 * Amount of motion on the y-axis. Range [0, 1]
         * @return 
	 */
	public double getY();
        
	/**
	 * Amount of motion on the z-axis. Range [0, 1]
         * @return 
	 */

	public double getZ();

	/**
	 * Time of the Acceleration capture
         * @return 
	 */
	public Date getTimeStamp();

}
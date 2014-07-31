/*
 * Copyright 2011 Daniel Kurka
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
package com.googlecode.gwtphonegap.client.capture;

/**
 * Encapsulates image capture configuration options.
 * @author Daniel Kurka
 */
public class CaptureImageOptions {
	private int limit;

	public CaptureImageOptions() {
		this.limit = 1;
	}

        /**
         * The maximum number of images the user can capture in a single capture
         * operation. The value must be greater than or equal to 1 (defaults to 1).
         * @param limit 
         */
	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getLimit() {
		return limit;
	}

}

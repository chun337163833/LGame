/**
 * Copyright 2013 The Loon Authors
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
package loon.physics;

public class PContactData {

	public boolean flip;
	public int id;

	public PContactData() {
		id = 0;
		flip = false;
	}

	public PContactData(int id, boolean flip) {
		this.id = id;
		this.flip = flip;
	}

	public PContactData clone() {
		PContactData ret = new PContactData();
		ret.id = id;
		ret.flip = flip;
		return ret;
	}

	public void set(int id, boolean flip) {
		this.id = id;
		this.flip = flip;
	}

}

/*
 * Copyright (C) 2013 salesforce.com, inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.auraframework.test.root.parser.handler;

import org.auraframework.impl.root.parser.handler.BaseAccessAttributeEnforcementTest;

public class RegisterEventAccessAttributeEnforcementTest extends BaseAccessAttributeEnforcementTest {

	private TestResource[] consumers = new TestResource[]{TestResource.Component};
	
	public RegisterEventAccessAttributeEnforcementTest(String name) {
		super(name);
		testResource = TestResource.RegisterEvent;
	}		
	
	/**
	 * Verify Default access enforcement
	 * @throws Exception
	 */	
	public void testDefaultAccess() throws Exception {
		testCase = TestCase.DEFAULT;
		verifyAccess(consumers);
    }
	
	/**
	 * Verify Public access enforcement
	 * @throws Exception
	 */
	public void testPublicAccess() throws Exception {
		testCase = TestCase.PUBLIC;
		verifyAccess(consumers);
    }
	
	/**
	 * Verify Global access enforcement
	 * @throws Exception
	 */
	public void testGlobalAccess() throws Exception {
		testCase = TestCase.GLOBAL;
		verifyAccess(consumers);
    }
}

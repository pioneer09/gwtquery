/*
 * Copyright 2013, The gwtquery team.
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
package com.google.gwt.query.client.ajax;

import com.google.gwt.core.client.GWT;


/**
 * Test for data binding and Ajax which is run in gwt
 */
public class AjaxTestGwt extends AjaxTests {

  @Override
  public String getModuleName() {
    return "com.google.gwt.query.QueryTest";
  }
  
  public AjaxTestGwt() {
    echoUrl = (GWT.isClient() ? GWT.getHostPageBaseURL() : "http://localhost:3333/") + servletPath;
    echoUrlCORS = echoUrl.replaceFirst("http://[\\d\\.]+:", "http://localhost:") + "?cors=true";
  }
}

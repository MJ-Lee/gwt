/*
 * Copyright 2012 Google Inc.
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
package elemental.html;
import elemental.dom.Element;

import elemental.events.*;
import elemental.util.*;
import elemental.dom.*;
import elemental.html.*;
import elemental.css.*;
import elemental.stylesheets.*;

import java.util.Date;

/**
  * DOM Label objects inherit all of the properties and methods of DOM <a title="en/DOM/element" rel="internal" href="https://developer.mozilla.org/en/DOM/element">element</a>, and also expose the <a title="http://dev.w3.org/html5/spec/forms.html#htmllabelelement" class=" external" rel="external" href="http://dev.w3.org/html5/spec/forms.html#htmllabelelement" target="_blank">HTMLLabelElement</a>(or 
<span><a rel="custom" href="https://developer.mozilla.org/en/HTML">HTML 4</a></span> <a class=" external" title="http://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-13691394" rel="external" href="http://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-13691394" target="_blank">HTMLLabelElement</a>) interface.
  */
public interface LabelElement extends Element {


  /**
    * The labeled control.
    */
  Element getControl();


  /**
    * The form owner of this label.
    */
  FormElement getForm();


  /**
    * The ID of the labeled control. Reflects the 

<code><a rel="custom" href="https://developer.mozilla.org/en/HTML/Element/label#attr-for">for</a></code>
 attribute.
    */
  String getHtmlFor();

  void setHtmlFor(String arg);
}
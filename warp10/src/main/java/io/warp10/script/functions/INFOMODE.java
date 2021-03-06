//
//   Copyright 2018  Cityzen Data
//
//   Licensed under the Apache License, Version 2.0 (the "License");
//   you may not use this file except in compliance with the License.
//   You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
//   Unless required by applicable law or agreed to in writing, software
//   distributed under the License is distributed on an "AS IS" BASIS,
//   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//   See the License for the specific language governing permissions and
//   limitations under the License.
//

package io.warp10.script.functions;

import io.warp10.script.NamedWarpScriptFunction;
import io.warp10.script.WarpScriptStackFunction;
import io.warp10.script.WarpScriptException;
import io.warp10.script.WarpScriptStack;

/**
 * Toggle the 'documentation mode' of the stack
 */
public class INFOMODE extends NamedWarpScriptFunction implements WarpScriptStackFunction {
  
  public INFOMODE(String name) {
    super(name);
  }
  
  @Override
  public Object apply(WarpScriptStack stack) throws WarpScriptException {
    if (Boolean.TRUE.equals(stack.getAttribute(WarpScriptStack.ATTRIBUTE_INFOMODE))) {
      stack.setAttribute(WarpScriptStack.ATTRIBUTE_INFOMODE, null);
    } else {
      stack.setAttribute(WarpScriptStack.ATTRIBUTE_INFOMODE, true);      
    }
    return stack;
  }

}

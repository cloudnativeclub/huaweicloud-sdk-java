/*******************************************************************************
 * 	Copyright 2016 ContainX and OpenStack4j                                          
 * 	                                                                                 
 * 	Licensed under the Apache License, Version 2.0 (the "License"); you may not      
 * 	use this file except in compliance with the License. You may obtain a copy of    
 * 	the License at                                                                   
 * 	                                                                                 
 * 	    http://www.apache.org/licenses/LICENSE-2.0                                   
 * 	                                                                                 
 * 	Unless required by applicable law or agreed to in writing, software              
 * 	distributed under the License is distributed on an "AS IS" BASIS, WITHOUT        
 * 	WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the         
 * 	License for the specific language governing permissions and limitations under    
 * 	the License.                                                                     
 *******************************************************************************/
package com.huawei.openstack4j.openstack.storage.object.functions;

import com.google.common.base.Function;

import com.huawei.openstack4j.openstack.storage.object.domain.SwiftObjectImpl;

/**
 * Applies a container name specified through the function creation to a Swift Object
 * 
 * @author Jeremy Unruh
 *
 */
public class ApplyContainerToObjectFunction implements Function<SwiftObjectImpl, SwiftObjectImpl>{

    String containerName;
    
    private ApplyContainerToObjectFunction(String containerName) {
        this.containerName = containerName;
    }
    
    public static ApplyContainerToObjectFunction create(String containerName) {
        return new ApplyContainerToObjectFunction(containerName);
    }
    
    @Override
    public SwiftObjectImpl apply(SwiftObjectImpl obj) {
        obj.setContainerName(containerName);
        return obj;
    }

}

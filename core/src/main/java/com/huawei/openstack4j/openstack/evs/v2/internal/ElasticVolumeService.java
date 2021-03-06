 /*******************************************************************************
 * 	Copyright 2018 Huawei Technologies Co.,Ltd.                                         
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
package com.huawei.openstack4j.openstack.evs.v2.internal;

import com.huawei.openstack4j.api.Apis;
import com.huawei.openstack4j.common.RestService;

public class ElasticVolumeService extends BaseElasticVolumeService implements RestService{
	
	public VolumeService volumes() {
		return Apis.get(VolumeService.class);
	}

	public VolumeSnapshotService snapshots() {
		return Apis.get(VolumeSnapshotService.class);
	}

	 public JobService jobs() {
		 return Apis.get(JobService.class);
	 }
}

/*
 * Copyright (c) 2019 Handywedge Co.,Ltd.
 *
 * This software is released under the MIT License.
 *
 * http://opensource.org/licenses/mit-license.php
 */
package com.handywedge.context;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.handywedge.role.FWRoleAcl;

import jakarta.enterprise.context.ApplicationScoped;
import lombok.Data;

@Data
@ApplicationScoped
public class FWApplicationContextImpl implements FWApplicationContext {

  private String hostName;
  private String applicationId;
  private String contextPath;
  private boolean userManagementEnable;

  // v0.3.0よりkey-valueを入れ替えてkeyはtokenとする
  private Map<String, String> tokenMap = Collections.synchronizedMap(new HashMap<String, String>());
  private List<FWRoleAcl> roleAcl = Collections.synchronizedList(new ArrayList<FWRoleAcl>());

}

package com.oasis.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class UserAccessController {
	

	  @GetMapping("/api/access/user")
	  @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	  public String userAccess() {
	    return ">>> User Access Dashboard Contents! >>>";
	  }
	  
	  @GetMapping("/api/access/pm")
	  @PreAuthorize("hasRole('PM') or hasRole('ADMIN')")
	  public String projectManagementAccess() {
	    return ">>> Hospital Access Management Board >>>";
	  }
	  
	  @GetMapping("/api/access/admin")
	  @PreAuthorize("hasRole('ADMIN')")
	  public String adminAccess() {
	    return ">>> Admin Access Contents >>>";
	  }

}

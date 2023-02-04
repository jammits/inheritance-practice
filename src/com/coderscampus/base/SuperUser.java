package com.coderscampus.base;

public class SuperUser extends User {
    public SuperUser() {
      this.setWriteAccess(Boolean.TRUE);
      this.setSuperUser(Boolean.TRUE);
    }
}

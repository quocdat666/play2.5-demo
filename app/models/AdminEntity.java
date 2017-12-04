package models;

import be.objectify.deadbolt.java.models.Permission;
import be.objectify.deadbolt.java.models.Role;
import be.objectify.deadbolt.java.models.Subject;
import io.ebean.Finder;
import io.ebean.Model;
import play.Logger;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class AdminEntity extends Model implements Subject {
    @Id
    public String adminId;
    public String adminType;
    public String companyName;
    public String name;
    public String email;
    public String activeStatus;
    public String branch;
    public String username;
    public String nameKana;

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getAdminType() {
        return adminType;
    }

    public void setAdminType(String adminType) {
        this.adminType = adminType;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNameKana() {
        return nameKana;
    }

    public void setNameKana(String nameKana) {
        this.nameKana = nameKana;
    }

    @ManyToMany
    public List<UserPermission> permissions;

    @Override
    public List<? extends Role> getRoles() {
        return null;
    }

    @Override
    public List<? extends Permission> getPermissions() {
        return permissions;
    }

    @Override
    public String getIdentifier() {
        return getUsername();
    }

    public static final Finder<Long, AdminEntity> find = new Finder(AdminEntity.class);

    public static AdminEntity findByUserName(String userName) {
        Logger.of("application").debug("FINDING ACCOUNT ...");
        return find.query().where()
                .eq("username",
                        userName)
                .findUnique();
    }

}

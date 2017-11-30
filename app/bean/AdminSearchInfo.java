package bean;

import models.AdminEntity;
import play.data.Form;
import play.libs.Json;
import utils.Condition;
import utils.Operator;

public class AdminSearchInfo implements ExpressionInfo {

    @Condition(operator = Operator.EQUAL)
    private String adminId;

    @Condition(operator = Operator.EQUAL)
    private String adminType;

    @Condition(operator = Operator.START_WITH)
    private String companyName;

    @Condition(operator = Operator.END_WITH)
    private String name;

    @Condition(operator = Operator.LIKE)
    private String email;

    @Condition(operator = Operator.EQUAL)
    private String activeStatus;

    @Condition(operator = Operator.NOT_LIKE)
    private String branch;

    @Condition(operator = Operator.LIKE)
    private String username;

    @Condition(operator = Operator.LIKE)
    private String nameKana;

    public String toJsonString() {
        return Json.toJson(this).toString();
    }

    public static AdminSearchInfo parse(Form<AdminEntity> form) {
        AdminSearchInfo info = new AdminSearchInfo();

        info.setAdminId(form.get().getAdminId());
        info.setAdminType(form.get().getAdminType());
        info.setCompanyName(form.get().getCompanyName());
        info.setName(form.get().getName());
        info.setEmail(form.get().getEmail());
        info.setActiveStatus(form.get().getActiveStatus());
        info.setBranch(form.get().getBranch());
        info.setUsername(form.get().getUsername());
        info.setNameKana(form.get().getNameKana());

        return info;
    }

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
}

package zhongchiedu.system.pojo;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.lang.String;
import java.lang.Integer;
/****
 * @Author:fliay
 * @Description:User构建
 * @Date 
 *****/
@Table(name="tb_user")
public class User implements Serializable{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Integer id;//主键

    @Column(name = "userName")
	private String userName;//用户名

    @Column(name = "password")
	private String password;//密码

    @Column(name = "cardType")
	private String cardType;//证件类型

    @Column(name = "accountName")
	private String accountName;//账号

    @Column(name = "cardId")
	private String cardId;//证件号码

    @Column(name = "photograph")
	private String photograph;//头像

    @Column(name = "roleId")
	private String roleId;//角色id

    @Column(name = "userType")
	private String userType;//用户类型

    @Column(name = "isDelete")
	private String isDelete;//是否删除

    @Column(name = "isDisable")
	private String isDisable;//是否禁用

    @Column(name = "updateTime")
	private Date updateTime;//更新时间

    @Column(name = "createTime")
	private Date createTime;//创建时间



	//get方法
	public Integer getId() {
		return id;
	}

	//set方法
	public void setId(Integer id) {
		this.id = id;
	}
	//get方法
	public String getUserName() {
		return userName;
	}

	//set方法
	public void setUserName(String userName) {
		this.userName = userName;
	}
	//get方法
	public String getPassword() {
		return password;
	}

	//set方法
	public void setPassword(String password) {
		this.password = password;
	}
	//get方法
	public String getCardType() {
		return cardType;
	}

	//set方法
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	//get方法
	public String getAccountName() {
		return accountName;
	}

	//set方法
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	//get方法
	public String getCardId() {
		return cardId;
	}

	//set方法
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	//get方法
	public String getPhotograph() {
		return photograph;
	}

	//set方法
	public void setPhotograph(String photograph) {
		this.photograph = photograph;
	}
	//get方法
	public String getRoleId() {
		return roleId;
	}

	//set方法
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	//get方法
	public String getUserType() {
		return userType;
	}

	//set方法
	public void setUserType(String userType) {
		this.userType = userType;
	}
	//get方法
	public String getIsDelete() {
		return isDelete;
	}

	//set方法
	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}
	//get方法
	public String getIsDisable() {
		return isDisable;
	}

	//set方法
	public void setIsDisable(String isDisable) {
		this.isDisable = isDisable;
	}
	//get方法
	public Date getUpdateTime() {
		return updateTime;
	}

	//set方法
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	//get方法
	public Date getCreateTime() {
		return createTime;
	}

	//set方法
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}


}

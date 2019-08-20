package jp.co.sample.emp_management.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * 管理者情報登録時に使用するフォーム.
 * 
 * @author igamasayuki
 * 
 */
public class InsertAdministratorForm {

	@NotBlank(message = "氏名を入力してください")
	/** 名前 */
	private String name;
	/** メールアドレス */
	@Size(min = 1, max = 124, message = "メールアドレスを入力してください")
	@Email(message = "メールアドレスを入力してください")
	private String mailAddress;
	/** パスワード */
	@Size(min = 1, max = 124, message = "パスワードを入力してください")
	private String password;
	/** 確認用パスワード */
	
	private String confirmationPassword;

	public String getConfirmationPassword() {
		return confirmationPassword;
	}

	public void setConfirmationPassword(String confirmationPassword) {
		this.confirmationPassword = confirmationPassword;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "InsertAdministratorForm [name=" + name + ", mailAddress=" + mailAddress + ", password=" + password
				+ "]";
	}

}

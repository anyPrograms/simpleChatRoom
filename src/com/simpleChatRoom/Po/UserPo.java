package com.simpleChatRoom.Po;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "user",uniqueConstraints={})
@Data
@NoArgsConstructor
public class UserPo implements Serializable {

	@Id
	@Column(name = "id", length = 11, nullable = false, unique = true)
	private int id;
	
	@Column(name = "account", length = 255, nullable = false)
	@ColumnPosition(2)
	private String account;

	@Column(name = "user_age", length = 8)
	@ColumnPosition(3)
	private String age;

	@Column(name = "user_city", length = 32)
	@ColumnPosition(4)
	private String city;

	@Column(name = "descr", length = 1024)
	@ColumnPosition(5)
	private String descr;

}

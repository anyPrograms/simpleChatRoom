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
public class ChatHistoryPo implements Serializable {

	@Id
	@Column(name = "id", length = 11, nullable = false, unique = true)
	private int id;
	
	@Column(name = "account", length = 255, nullable = false)
	@ColumnPosition(2)
	private String account;

	@Column(name = "message", length = 1024)
	@ColumnPosition(3)
	private String message;

}

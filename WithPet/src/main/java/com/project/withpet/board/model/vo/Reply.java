package com.project.withpet.board.model.vo;

import lombok.Data;

@Data
public class Reply {
	
	private int replyNo;
	private String replyContent;
	private int refBoardNo;
	private String replyWriter;
	private String createDate;
	private String status;
}

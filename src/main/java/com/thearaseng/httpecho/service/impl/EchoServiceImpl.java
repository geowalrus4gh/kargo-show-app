package com.thearaseng.httpecho.service.impl;

import com.thearaseng.httpecho.model.MessageModel;
import com.thearaseng.httpecho.service.EchoService;
import org.springframework.stereotype.Service;

@Service
public class EchoServiceImpl implements EchoService {

	@Override
	public MessageModel getMessage() {

		MessageModel messageModel = new MessageModel();
		messageModel.setMessage("Hello");
		return messageModel;
	}

}

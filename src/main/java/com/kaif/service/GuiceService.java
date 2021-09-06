package com.kaif.service;

import com.google.inject.ImplementedBy;
import com.kaif.service.impl.GuiceServiceImpl;

@ImplementedBy(GuiceServiceImpl.class)
public interface GuiceService {
	String sayHello();
}

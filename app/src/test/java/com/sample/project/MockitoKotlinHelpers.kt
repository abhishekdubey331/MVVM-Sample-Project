package com.sample.project

import org.mockito.ArgumentCaptor


fun <T> capture(argumentCaptor: ArgumentCaptor<T>): T = argumentCaptor.capture()
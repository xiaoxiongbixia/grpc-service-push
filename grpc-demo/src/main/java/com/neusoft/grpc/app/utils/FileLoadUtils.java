package com.neusoft.grpc.app.utils;

import java.io.File;
import java.io.IOException;

import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

public class FileLoadUtils {
	//加载文件路径
	public static File loadFile(String fileRelativePath) throws IOException{
		PathMatchingResourcePatternResolver p = new PathMatchingResourcePatternResolver();
		return p.getResource(fileRelativePath).getFile();
		//return new ClassPathResource(fileRelativePath).getFile();
	}

}

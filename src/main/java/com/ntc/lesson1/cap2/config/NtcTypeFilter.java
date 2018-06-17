package com.ntc.lesson1.cap2.config;

import java.io.IOException;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

/*
 * 自定义过滤注入类
 */
public class NtcTypeFilter implements TypeFilter{

	/*
	 * MetadataReader：读取到当前站在扫描类的信息
	 * MetadataReaderFactory：可以获取到其他任何类信息
	 */
	
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory)
			throws IOException {
		// 获取当前注解类的信息
		AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
		
		// 获取当前正在扫描的类信息
		ClassMetadata classMetadata = metadataReader.getClassMetadata();
		
		// 获取当前类资源（类路径）
		Resource resource = metadataReader.getResource();
		
		String className = classMetadata.getClassName();
		
		System.out.println("---自定义过滤类中打印----->-" + className);
		
		if(className.contains("er")) {
			return true;
		}		
		
		return false;
	}

}

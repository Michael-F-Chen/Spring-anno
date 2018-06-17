package com.ntc.lesson1.cap2.config;

import java.io.IOException;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

/*
 * �Զ������ע����
 */
public class NtcTypeFilter implements TypeFilter{

	/*
	 * MetadataReader����ȡ����ǰվ��ɨ�������Ϣ
	 * MetadataReaderFactory�����Ի�ȡ�������κ�����Ϣ
	 */
	
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory)
			throws IOException {
		// ��ȡ��ǰע�������Ϣ
		AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
		
		// ��ȡ��ǰ����ɨ�������Ϣ
		ClassMetadata classMetadata = metadataReader.getClassMetadata();
		
		// ��ȡ��ǰ����Դ����·����
		Resource resource = metadataReader.getResource();
		
		String className = classMetadata.getClassName();
		
		System.out.println("---�Զ���������д�ӡ----->-" + className);
		
		if(className.contains("er")) {
			return true;
		}		
		
		return false;
	}

}

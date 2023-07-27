package com.chlee4.lc;

import com.chlee1.collector.CSVMetadataCollector;
import com.chlee1.collector.MetadataCollector;
import com.chlee1.collector.PDFMetadataCollector;
import com.chlee2.export.CSVExport;
import com.chlee2.export.ExportMetadata;
import com.chlee2.export.PDFExport;
import com.chlee3.fetch.FetchMetadata;
import com.chlee3.fetch.JSONFetch;
import com.chlee3.fetch.XMLFetch;

public class Program {
	
	public static void setMetadataCollector(MetadataCollector mdcollector,
			FetchMetadata fetchMetadata, 
			ExportMetadata exportMetadata) {
		mdcollector.setMetadataCollector(fetchMetadata, exportMetadata);
	}
	
	public static void collectMetadata(MetadataCollector mdcollector) {
		mdcollector.collectMetadata();
	}

	public static void print(MetadataCollector mdcollector) {
		mdcollector.print();
	}

	public static void main(String[] args) {
		FetchMetadata fetchMetadata1 = JSONFetch.getInstance();
		ExportMetadata exportMetadata1 = PDFExport.getInstance();
		
		MetadataCollector mdcollector1 = new PDFMetadataCollector();
		setMetadataCollector(mdcollector1, fetchMetadata1, exportMetadata1);
		collectMetadata(mdcollector1);
		print(mdcollector1);
		
		
		FetchMetadata fetchMetadata2 = XMLFetch.getInstance();
		ExportMetadata exportMetadata2 = CSVExport.getInstance();
		
		MetadataCollector mdcollector2 = new CSVMetadataCollector();
		setMetadataCollector(mdcollector2, fetchMetadata2, exportMetadata2);
		collectMetadata(mdcollector2);
		print(mdcollector2);
//		mdcollector.setMetadataCollector(fetchMetadata, exportMetadata);
//		mdcollector.collectMetadata();
//		mdcollector.print();
	}
}

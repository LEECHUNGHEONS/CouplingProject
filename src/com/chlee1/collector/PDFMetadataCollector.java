package com.chlee1.collector;

import java.util.List;

import com.chlee2.export.ExportMetadata;
import com.chlee3.fetch.FetchMetadata;

public class PDFMetadataCollector implements MetadataCollector {
	
	private FetchMetadata fetchMetadata;
    private ExportMetadata exportMetadata;

	@Override
	public void setMetadataCollector(FetchMetadata fetchMetadata, ExportMetadata exportMetadata) {
		this.fetchMetadata = fetchMetadata;
        this.exportMetadata = exportMetadata;
	}

	@Override
	public void collectMetadata() {
		List<Object> metadata = fetchMetadata.fetchMetadata();
        exportMetadata.export(metadata);

	}

	@Override
	public void print() {
		String fetchType = fetchMetadata.getFetchType();
		System.out.println("PDF Exporting data to" + fetchType);

	}
}
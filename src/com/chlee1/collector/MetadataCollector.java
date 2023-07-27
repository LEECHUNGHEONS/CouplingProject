package com.chlee1.collector;

import com.chlee2.export.ExportMetadata;
import com.chlee3.fetch.FetchMetadata;

public interface MetadataCollector {
	public void setMetadataCollector(FetchMetadata fetchMetadata, ExportMetadata exportMetadata);
	public void collectMetadata();
	public void print();
}

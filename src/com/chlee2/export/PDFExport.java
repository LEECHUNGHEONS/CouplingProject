package com.chlee2.export;

import java.io.File;
import java.util.List;

public class PDFExport implements ExportMetadata {
	
	final String exportType = "PDF";
	
	private static PDFExport instance = null;
	
	
    private PDFExport() {
    }
    
    
    public static PDFExport getInstance() {
        
        if (instance == null) {
            instance = new PDFExport();
        }
        return instance;
    }
	
	@Override
	public String getExportType() {
		return this.exportType;
	}

	@Override
	public File export(List<Object> metadata) {
		System.out.println("PDF Exporting data 출력완료!");
        // Export Metadata
        File outputCSV = null;
        return outputCSV;
	}
}
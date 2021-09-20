package com.llg.lqs.service.impl;

import com.llg.lqs.dao.LiteratureRepository;
import com.llg.lqs.entity.Literature;
import com.llg.lqs.service.LiteratureService;
import com.llg.lqs.util.ExcelUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Service("literatureService")
public class LiteratureServiceImpl implements LiteratureService {

    @Autowired
    private LiteratureRepository literatureRepository;

    @Override
    public Page<Literature> findByAny(String queryStr, Pageable pageable) {
        return literatureRepository.findByAny(queryStr, pageable);
    }

    @Override
    public Page<Literature> findAll(Pageable pageable) {
        return literatureRepository.findAll(pageable);
    }

    @Override
    public Literature findById(Long id) {
        return literatureRepository.findById(id).get();
    }

    @Override
    public String importExcel(InputStream inputStream, String filename) throws Exception {
        List<List<Cell>> dataRows = ExcelUtil.parseExcel(inputStream, filename, 21);
        List<Literature> literatureList = new ArrayList<>(dataRows.size());
        int i = 0;
        for (List<Cell> row : dataRows) {
            i++;
            System.out.println(i);
            Literature.Builder builder = new Literature.Builder();
            builder.ltName(getStringCellValue(row.get(0)));
            builder.ltType(getStringCellValue(row.get(1)));
            // row[2] lt_category
            builder.ltDigest(getStringCellValue(row.get(3)));
            builder.ltRange(getStringCellValue(row.get(4)));
            builder.ltReadability(getStringCellValue(row.get(5)));
            builder.publicationTime(row.get(6).getDateCellValue());
            builder.country(getStringCellValue(row.get(7)));
            builder.unit(getStringCellValue(row.get(8)));
            builder.unitCategory(getStringCellValue(row.get(9)));
            builder.doi(getStringCellValue(row.get(10)));
            builder.authors(getStringCellValue(row.get(11)));
            builder.project(getStringCellValue(row.get(12)));
//            builder.journals(getStringCellValue(row.get(13)));
            builder.referenceAmount(getIntCellValue(row.get(14)));
            builder.recommendedAmount(getIntCellValue(row.get(15)));
            builder.sharedAmount(getIntCellValue(row.get(16)));
            builder.readedAmount(getIntCellValue(row.get(17)));
//            builder.imgUrl(row.get(18).getStringCellValue());
//            builder.ltDesc(row.get(19).getStringCellValue());
//            builder.comments(row.get(20).getStringCellValue());
            literatureList.add(new Literature(builder));
        }
        literatureRepository.saveAll(literatureList);
        return "success";
    }

    private String getStringCellValue(Cell cell) {
        if (cell != null) {
            return cell.getStringCellValue();
        }
        return null;
    }

    private int getIntCellValue(Cell cell) {
        if (cell != null) {
            return (int) cell.getNumericCellValue();
        }
        return 0;
    }
}

package hello.upload.domain;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.List;


@Data
public class Item {

    private Long id;
    private String itemName;
    private UploadFile attachFile;
    private List<UploadFile> imageFiles;
}

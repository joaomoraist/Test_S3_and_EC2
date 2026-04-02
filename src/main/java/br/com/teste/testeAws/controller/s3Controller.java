package br.com.teste.testeAws.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;


@RestController
@RequestMapping
public class s3Controller {

    private final S3Client s3 = S3Client.builder().region(Region.US_EAST_2).build();
    private final String BUCKET = "meu-bucket-estudo-original";

    @PostMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file) throws Exception {
        s3.putObject(PutObjectRequest.builder().bucket(BUCKET).key(file.getOriginalFilename()).build(),
                RequestBody.fromInputStream(file.getInputStream(), file.getSize()));
        return "Arquivo enviado!";
    }
}

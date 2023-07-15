package ru.skypro.lessons.springboot.weblibrary.controller;

@RestController
@RequestMapping("report")
@RequiredArgsConstructor
public class ReportController {

    private final ReportService reportService;
    @PostMapping("/")
    public int createReport(){
        return reportService.createReport();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    public ResponseEntity<Resource> getReportById(@PathVariable int id) {
        return reportService.getReportById(id);
    }

    @PostMapping("/path")
    public int createReportWihPath(){
        return reportService.createReportWihPath();
    }

    @GetMapping(value = "/path/{id}", produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    public ResponseEntity<Resource> getReportByIdWihPath(@PathVariable int id) {
        return reportService.getReportByIdWihPath(id);
    }

}

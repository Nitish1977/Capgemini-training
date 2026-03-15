package com.educommerce.resultservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(name = "attendance-service", fallback = AttendanceClientFallback.class)
public interface AttendanceClient {

    @GetMapping("/attendance/percentage")
    Map<String, Object> getAttendancePercentage(
            @RequestParam("studentId") Long studentId,
            @RequestParam("courseId") Long courseId);
}

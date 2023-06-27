package com.DataIntimate.BookCatalog.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResponsiveUtil {
    private int code;
    private String message;
    private Object data;
}